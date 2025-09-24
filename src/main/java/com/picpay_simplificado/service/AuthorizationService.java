package com.picpay_simplificado.service;

import com.picpay_simplificado.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Map;

@Service
public class AuthorizationService {

    private final RestTemplate restTemplate;

    @Autowired
    public AuthorizationService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public boolean authorizeTransaction(User payer, BigDecimal value) {
        String authorizationUrl = "https://util.devi.tools/api/v2/authorize";
        Map<String, Object> response = restTemplate.getForObject(authorizationUrl, Map.class);

        if (response != null && "success".equals(response.get("status"))) {
            Object dataObj = response.get("data");
            if (dataObj instanceof Map<?, ?> data) {
                Object auth = data.get("authorization");
                if (auth instanceof Boolean) {
                    return (Boolean) auth;
                }
            }
        }
        return false;
    }
}

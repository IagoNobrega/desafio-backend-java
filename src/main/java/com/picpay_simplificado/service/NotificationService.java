package com.picpay_simplificado.service;

import com.picpay_simplificado.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class NotificationService {

    private final RestTemplate restTemplate;

    @Autowired
    public NotificationService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void sendNotification(User user, String message) {
        String notificationUrl = "https://util.devi.tools/api/v1/notify";
        try {
            Map<String, String> requestBody = Map.of(
                    "email", user.getEmail(),
                    "message", message
            );

            ResponseEntity<Map> notificationResponse =
                    restTemplate.postForEntity(notificationUrl, requestBody, Map.class);

            if (notificationResponse.getStatusCode() != HttpStatus.OK) {
                System.err.println("Erro ao enviar notificação: " +
                        notificationResponse.getStatusCode() + ": " +
                        notificationResponse.getBody());
            }
        } catch (Exception e) {
            System.err.println("Erro ao enviar notificação: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
package com.picpay_simplificado.dto;

public class NotificationRequestDTO {
    private String email;
    private String message;

    // Construtores
    public NotificationRequestDTO() {}

    public NotificationRequestDTO(String email, String message) {
        this.email = email;
        this.message = message;
    }

    // Getters e Setters
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
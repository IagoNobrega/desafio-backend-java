Desafio Back-end PicPay Simplificado

Este projeto é uma implementação do desafio de back-end proposto pelo PicPay, focado em uma plataforma de pagamentos simplificada onde usuários podem realizar transferências de dinheiro.

Estrutura do Projeto

O projeto foi desenvolvido utilizando Spring Boot e Maven, seguindo uma arquitetura em camadas para garantir a manutenibilidade e escalabilidade. A estrutura de pacotes é a seguinte:

•
com.picpay.simplified

•
PicpaySimplifiedApplication.java: Classe principal da aplicação Spring Boot.



•
com.picpay.simplified.config: Contém classes de configuração da aplicação.

•
AppConfig.java: Configuração para beans como RestTemplate.



•
com.picpay.simplified.controller: Responsável por expor os endpoints da API REST.

•
TransactionController.java: Endpoint para realizar transferências.

•
GlobalExceptionHandler.java: Tratamento global de exceções.



•
com.picpay.simplified.domain

•
transaction: Contém a entidade Transaction.

•
Transaction.java: Entidade que representa uma transação.



•
user: Contém a entidade User e o enum UserType.

•
User.java: Entidade que representa um usuário (comum ou lojista).

•
UserType.java: Enum para diferenciar tipos de usuários.





•
com.picpay.simplified.dtos: Data Transfer Objects para comunicação entre camadas.

•
TransferDTO.java: DTO para a requisição de transferência.



•
com.picpay.simplified.exception: Classes de exceção personalizadas.

•
CustomException.java: Exceção genérica para erros de negócio.



•
com.picpay.simplified.repository: Interfaces de repositório para acesso a dados, utilizando Spring Data JPA.

•
TransactionRepository.java: Repositório para transações.

•
UserRepository.java: Repositório para usuários.



•
com.picpay.simplified.service: Contém a lógica de negócio da aplicação.

•
AuthorizationService.java: Serviço para autorização de transações com mock externo.

•
NotificationService.java: Serviço para envio de notificações com mock externo.

•
TransactionService.java: Lógica principal para criação e validação de transações.

•
UserService.java: Lógica para validação e criação de usuários.



Como Rodar a Aplicação

Pré-requisitos

•
Java 17 ou superior

•
Maven




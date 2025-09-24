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

•
Docker e Docker Compose (opcional, para rodar com containers)

Rodando com Maven

1.
Navegue até o diretório raiz do projeto (picpay-simplified).

2.
Compile o projeto:

3.
Execute a aplicação:

Rodando com Docker Compose

1.
Certifique-se de ter o Docker e o Docker Compose instalados.

2.
Navegue até o diretório raiz do projeto (picpay-simplified).

3.
Construa e inicie os containers:

Diferenciais Implementados

Este projeto buscou incorporar diversos pontos de diferenciação mencionados no desafio:

•
Uso do Docker: Fornecido Dockerfile e docker-compose.yml para facilitar a conteinerização e execução da aplicação, incluindo um banco de dados H2 em memória.

•
Cobertura de Testes Consistente: Implementação de testes unitários para as camadas de serviço (UserServiceTest.java, TransactionServiceTest.java), garantindo a validação da lógica de negócio e o comportamento esperado das funcionalidades.

•
Uso de Padrões de Design: Aplicação de padrões como Injeção de Dependência (via Spring), Repositório (Spring Data JPA) e Serviço para organizar a lógica de negócio e desacoplar componentes.

•
Documentação: Este README.md serve como documentação inicial do projeto, explicando a estrutura, como rodar e os diferenciais implementados.

•
Proposta de Melhoria na Arquitetura: A escolha do Spring Boot e a divisão em camadas (controller, service, repository, domain) reflete uma arquitetura modular e escalável, facilitando futuras expansões e manutenções. O uso de DTOs para comunicação entre camadas também contribui para uma arquitetura mais limpa.

•
Consistência e Argumentação das Escolhas: As escolhas tecnológicas (Spring Boot, Maven, H2 para desenvolvimento/testes) foram feitas visando produtividade, robustez e alinhamento com as práticas de mercado para desenvolvimento Java backend. A estrutura de pacotes e a separação de responsabilidades visam um código limpo e de fácil manutenção.

•
Modelagem de Dados: As entidades User e Transaction foram modeladas com relacionamentos e validações de unicidade (CPF/CNPJ e e-mail) conforme os requisitos do desafio.

•
Manutenibilidade do Código: Código organizado em pacotes lógicos, com classes e métodos bem definidos, e uso de Lombok para reduzir boilerplate, contribuindo para a manutenibilidade.

•
Tratamento de Erros: Implementação de CustomException e GlobalExceptionHandler para um tratamento de erros centralizado e padronizado, retornando mensagens claras para o cliente da API.

•
Cuidado com Itens de Segurança: Embora o desafio não exija autenticação completa, a separação de responsabilidades e o uso de transações (@Transactional) são práticas que contribuem para a segurança e integridade dos dados.

•
Arquitetura (estruturar o pensamento antes de escrever): A abordagem de dividir o projeto em fases (análise, configuração, modelagem, implementação da lógica, integração, testes, docker, documentação) demonstra um planejamento prévio à implementação, focando na estrutura e nos requisitos.

•
Carinho em Desacoplar Componentes (outras camadas, serviço, repositório): A clara separação entre Controller, Service e Repository garante que cada camada tenha uma única responsabilidade, facilitando testes e manutenção. Os serviços externos (autorização e notificação) são injetados, demonstrando baixo acoplamento.


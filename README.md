# JaneBank – Microservices Banking System

JaneBank is a Spring Boot microservices-based banking system demonstrating modern cloud-native architecture.
The project contains multiple microservices, centralized configuration, environment-based deployment setups, and containerized infrastructure.

The repository janebank is organized into multiple branches, each representing a different stage or component of the architecture.

## Architecture Overview

The system follows a microservices architecture built using the Spring ecosystem.

### Core Services

- Accounts Service – Manages customer bank accounts.

- Loans Service – Handles loan creation and management.

- Cards Service – Manages credit card information.

### Infrastructure

- Config Server – Centralized configuration using Spring Cloud Config.

- Docker Compose – Environment-based orchestration for local development and testing.

## Microservices

1. Accounts Service

Responsible for managing customer bank accounts.

### Features

- Create account

- Fetch account details

- Update account information

- REST APIs for account operations

2. Loans Service

- Handles loan-related functionality.

### Features

- Create loan

- Fetch loan details

- Manage loan records

3. Cards Service

Manages credit card data.

### Features

- Issue credit cards

- Retrieve card information

- Maintain card records

## Config Server

The project includes a Spring Cloud Config Server which provides:

- Centralized configuration management

- Environment-specific configurations

- Externalized configuration for microservices

- Microservices retrieve their configuration from the config server during startup.

## Dockerized environments

The project supports three environments using Docker Compose.

### Development Environment
```
cd default
````

### QA Environment
```
cd qa
```
### Production Environment
```
cd prod
```
Finally, 
```
docker-compose up -d
```
To kill all the docker containers:
```
docker-compose down
```

## Branch Overview

This repository contains **9 branches**, each representing a different stage or architectural feature of the JaneBank microservices system.

| Branch | Description |
|------|-------------|
| **main** | Core microservices implementation with **Accounts, Loans, Cards**, and a **Spring Cloud Config Server**. Includes Docker Compose setups for **dev, QA, and production environments**. |
| **discovery_registration** | Introduces **Eureka Service Discovery**. All microservices are registered as clients with the Eureka server for dynamic service discovery. |
| **gateway_server** | Implements **Spring Cloud API Gateway** for centralized routing and load balancing. Provides a **single entry point (primary URI)** to access all microservices. |
| **keycloak** | Integrates **Keycloak Authorization Server** to demonstrate **OAuth2 security**, including **Client Credentials Grant** and **Authorization Code Grant** flows. |
| **kubernetes** | Deploys all microservices to **Kubernetes**, including integrations with **messaging systems, Keycloak, MySQL, Grafana, and Prometheus**, providing a production-like distributed environment. |
| **observability** | Demonstrates **observability tools** for monitoring microservices, including **logs, metrics, and distributed tracing**. |
| **pure-mysql** | Replaces the in-memory **H2 database** with **MySQL** to enable persistent data storage even after application restarts. |
| **messaging** | Implements **asynchronous communication** using **RabbitMQ and Kafka** with **Spring Cloud Stream and Spring Cloud Functions**, replacing REST-based inter-service communication. |
| **springbom** | Introduces a **central parent project (Spring BOM)** with a shared `pom.xml` to manage dependency versions across all microservices. |

## Technologies Used

### Programming Language
- **Java 21**

---

### Backend Frameworks
- **Spring Boot 3.x / 4.x** – Core framework for building microservices
- **Spring Web (Spring MVC)** – Building REST APIs
- **Spring Data JPA** – ORM framework for database interaction
- **Spring Validation** – Request validation for REST APIs
- **Spring Boot Actuator** – Application monitoring and health endpoints

---

### Microservices & Cloud
- **Spring Cloud Config Server** – Centralized configuration management
- **Spring Cloud Config Client** – Fetches configurations from Config Server
- **Spring Cloud Bus (AMQP)** – Dynamic configuration refresh across services
- **Spring Cloud Dependencies BOM** – Centralized dependency version management

---

### Messaging
- **RabbitMQ (AMQP)** – Used with Spring Cloud Bus for configuration refresh events

---

### API Documentation
- **SpringDoc OpenAPI (Swagger UI)** – API documentation and testing interface

---

### Database
- **H2 Database** – In-memory database used for development and testing

---

### Development Tools
- **Lombok** – Reduces boilerplate code (getters, setters, constructors)
- **Spring Boot DevTools** – Hot reload during development

---

### Observability & Monitoring
- **Spring Boot Actuator** – Provides production-ready monitoring endpoints

---

### Containerization
- **Jib Maven Plugin** – Builds optimized Docker images directly from Maven without requiring a Dockerfile

---

### Build Tool
- **Maven**

---

### Infrastructure
- **Docker**
- **Docker Compose**


## API Services

| Service | Default Port |
|--------|-------------|
| Config Server | 8071 |
| Accounts Service | 8080 |
| Loans Service | 8090 |
| Cards Service | 9000 |


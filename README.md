# JaneBank – Service Discovery with Eureka

This branch introduces **Service Discovery using Netflix Eureka**.

---

## Overview

In a microservices architecture, services need a way to locate each other dynamically.

This branch implements **Eureka Server** which allows microservices to:

- Register themselves automatically
- Discover other services dynamically
- Avoid hardcoded service URLs

---

## Architecture

Components:

- Eureka Server
- Accounts Service (Eureka Client)
- Loans Service (Eureka Client)
- Cards Service (Eureka Client)

---

## Inter-Service Communication using OpenFeign

To demonstrate communication between microservices, a **controller is implemented in the Accounts microservice**.

This controller exposes an endpoint that **fetches data from all three microservices**:

- Accounts Service
- Loans Service
- Cards Service

The communication between services is handled using **Spring Cloud OpenFeign**, which simplifies REST client implementation.

## Benefits

- Dynamic service discovery
- Fault tolerance
- Improved scalability
- No hardcoded service endpoints

---

## Access Eureka Dashboard
```
http://localhost:8070
```
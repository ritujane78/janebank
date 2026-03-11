# JaneBank – API Gateway

This branch introduces **Spring Cloud API Gateway**.

---

## Overview

Instead of exposing each microservice separately, the API Gateway provides a **single entry point** for all client requests.

---

## Common Gateway URI

All services can be accessed through the **API Gateway** using the base URI:
```
http://localhost:8072
```

## Example Routes

| Service | Example Gateway Endpoint |
|-------|---------------------------|
| Accounts Service | http://localhost:8072/janebank/accounts/** |
| Loans Service | http://localhost:8072/janebank/loans/** |
| Cards Service | http://localhost:8072/janebank/cards/** |

## Responsibilities

- Request routing
- Load balancing
- Centralized API access
- Security integration
- Rate limiting (optional)

---

## Architecture

Client → API Gateway → Microservices

The gateway routes requests to:

- Accounts Service
- Loans Service
- Cards Service

---

## Benefits

- Simplified client communication
- Centralized routing
- Built-in load balancing
- Improved security architecture



# JaneBank – Security with Keycloak

This branch integrates **Keycloak Authorization Server** to secure the JaneBank microservices system.

---

## Overview

Keycloak is an **Open Source Identity and Access Management (IAM)** solution that provides authentication and authorization using **OAuth2 and OpenID Connect**.

In this branch, Keycloak is used to secure access to the microservices and demonstrate different OAuth2 authentication flows.

---

## Implemented OAuth2 Grant Types

### Client Credentials Grant
Used for **service-to-service communication** where no user interaction is required.

### Authorization Code Grant
Used for **user authentication flows**, where a user logs in and grants access to an application.

---

## Keycloak Server

Keycloak runs locally and manages authentication for all services.

Keycloak Base URL:

```
http://localhost:7080
```

## Token Endpoint

Access tokens can be generated using the following endpoint:
```
http://localhost:7080/realms/master/protocol/openid-connect/token
```
This endpoint is used by clients to request **OAuth2 access tokens**.

---

## Generating Tokens Using Postman

Access tokens for authorization were generated using **Postman’s OAuth2 Authorization feature**.

Steps followed:

1. Open **Postman**
2. Go to **Authorization tab**
3. Select **OAuth 2.0**
4. Click **Get New Access Token**
5. Provide the following configuration:

| Field | Value |
|------|------|
| Grant Type | Client Credentials / Authorization Code |
| Access Token URL | http://localhost:7080/realms/master/protocol/openid-connect/token |
| Client ID | configured client id |
| Client Secret | configured client secret |

Postman then generates an **OAuth2 access token**, which can be used to authorize API requests to the microservices.

---

## Security Flow

1. Client requests an **access token** from Keycloak
2. Keycloak authenticates the client
3. Keycloak returns an **OAuth2 access token**
4. Client calls microservices with the token
5. Microservices validate the token before allowing access

---

## Benefits

- Centralized authentication
- OAuth2 and OpenID Connect support
- Secure microservices communication
- Role-based access control
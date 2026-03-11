# JaneBank – Kubernetes Deployment

This branch demonstrates deploying the entire JaneBank microservices system on **Kubernetes**.

---

## Overview

All services are containerized and deployed using Kubernetes manifests.

---

## Components Deployed

- Accounts Service
- Loans Service
- Cards Service
- Config Server
- Keycloak
- MySQL Database
- Messaging systems
- Observability stack

---

## Monitoring Tools

- Prometheus
- Grafana

---

## Benefits

- Container orchestration
- Auto-scaling
- Self-healing infrastructure
- Production-ready deployment

---

## Example Commands

Deploy services:

```
kubectl apply -f .
```

Check pods:
```
kubectl get pods
```


# JaneBank – Observability

This branch demonstrates **observability for the JaneBank microservices system**, enabling monitoring, logging, and distributed tracing.

---

## Overview

Observability is critical in microservices architectures to understand system behavior and troubleshoot issues.  
This branch integrates several observability tools to collect and visualize **metrics, logs, and traces**.

---

## Observability Stack

| Tool | Purpose |
|-----|--------|
| Prometheus | Metrics collection and monitoring |
| Grafana | Visualization dashboards |
| Loki | Log aggregation and querying |
| Tempo | Distributed tracing |
| Alloy | Telemetry data collection and forwarding |

---

## Ports Used

| Service | Port |
|-------|------|
| Prometheus | 9090 |
| Grafana | 3000 |

---

## Grafana Datasources

In Grafana, multiple **datasources were configured** to collect observability data:

| Datasource | Purpose |
|-----------|---------|
| Prometheus | Metrics monitoring |
| Loki | Log storage and querying |
| Tempo | Distributed tracing |
| Alloy | Telemetry collection pipeline |

These datasources allow Grafana to visualize different types of observability data in dashboards.

---

## Grafana UI

The **Grafana UI was explored to visualize system observability**, including:

- Viewing **metrics dashboards**
- Searching and filtering **logs from Loki**
- Viewing **distributed traces from Tempo**
- Monitoring application health and performance
- Creating dashboards using configured datasources

Grafana UI can be accessed at:
```
http://localhost:3000
```

---

## Prometheus Metrics

Prometheus collects metrics exposed by the microservices through **Spring Boot Actuator endpoints**.

Prometheus UI can be accessed at:
```
http://localhost:9090
```

---

## Observability Features Demonstrated

- Metrics monitoring
- Log aggregation
- Distributed tracing
- Centralized visualization dashboards
- Telemetry collection using Alloy

---

## Benefits

- Faster debugging and troubleshooting
- Real-time monitoring of microservices
- Visibility into system performance
- Improved reliability of distributed systems
# JaneBank – Event Driven Messaging

This branch introduces **asynchronous communication using messaging systems**.

---

## Overview

Instead of using REST APIs for service communication, this branch uses **event-driven messaging**.

---

## Messaging Technologies

- RabbitMQ
- Apache Kafka
- Spring Cloud Stream
- Spring Cloud Functions

---

## Architecture

Microservices communicate by publishing and consuming events through message brokers.

Example flow:

Accounts Service → Event → Kafka/RabbitMQ → Loans Service

---

## Benefits

- Loose coupling between services
- Improved scalability
- Fault tolerance
- Event-driven architecture

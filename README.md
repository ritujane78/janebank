# JaneBank – MySQL Database Integration

This branch replaces the **H2 in-memory database** with **MySQL**.

---

## Overview

H2 databases lose data after application restart.  
Using MySQL ensures **persistent storage**.

---

## Benefits

- Persistent data storage
- Production-like database
- Better scalability

---

## Configuration Example

```
spring.datasource.url=jdbc:mysql://localhost:3306/janebank
spring.datasource.username=root
spring.datasource.password=password
```

## Database Used

- MySQL
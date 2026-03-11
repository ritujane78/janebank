# JaneBank – Spring BOM Dependency Management

This branch introduces a **centralized dependency management system** using a Spring BOM (Bill of Materials).

---

## Overview

Instead of managing dependency versions separately in each microservice, a **parent project** manages them centrally.

---

## Benefits

- Consistent dependency versions
- Simplified dependency management
- Easier upgrades
- Reduced configuration duplication

---

## Structure

Parent Project:
```xml
parent-project
├── pom.xml
├── accounts
├── loans
├── cards
```
All services inherit dependencies from the **parent pom.xml**.


## Example

<parent> 
### Example: Using the Parent BOM

```xml
<parent>
    <groupId>com.jane</groupId>
    <artifactId>janebank-bom</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <relativePath>../janebank-bom/pom.xml</relativePath>
</parent>

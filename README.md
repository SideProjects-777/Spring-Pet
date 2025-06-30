# PDF IBAN Scanner Service — Quick Manual

## Overview

This Spring Boot service scans PDF invoices from a given URL to detect blacklisted IBANs, helping prevent money laundering. It also provides REST endpoints to manage the blacklist of IBANs.

---

## Prerequisites

- Maven 3.6+

---

## Run

```shell
mvn clean install spring-boot:run
```

The service will start on port `8080` by default.

---

## API Endpoints

### PDFs

```
https://togetherfordevelopment.com/wp-content/uploads/2017/10/Bank-account-details.pdf
https://indico.un.org/event/1012743/attachments/16964/48833/Countries%20with%20IBAN.pdf
```

---

### 1. Scan PDF Invoice for Blacklisted IBANs

- **URL:** `POST /scan-invoice`
- **Request Body:**

```json
{
  "url": "https://indico.un.org/event/1012743/attachments/16964/48833/Countries%20with%20IBAN.pdf"
}
```

- **Response:**

- **200 OK** if no blacklisted IBANs found:

```json
{
  "blacklistedFound": false,
  "blacklistedIBANs": []
}
```

- **400 Bad Request** if blacklisted IBANs found:

```json
{
  "blacklistedFound": true,
  "blacklistedIBANs": ["DE89370400440532013000"]
}
```

---

### 2. Manage Blacklisted IBANs

| Method | Endpoint | Description |
|---------|---------|---------|
| GET | `/blacklist/ibans` | List all blacklisted IBANs |
| POST | `/blacklist/ibans` | Add an IBAN to blacklist |
| DELETE | `/blacklist/ibans/{iban}` | Remove an IBAN from blacklist |
| GET | `/blacklist/ibans/{iban}` | Check if an IBAN is blacklisted |  

---

## Test places

After starting the service, please proceed to the `requests` folder, where you can run the provided shell scripts.
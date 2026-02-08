# Trade Journal API

A simple RESTful API built with Spring Boot to manage trading journal entries in memory.

This project was created as a clean, structured backend practice project with a focus on:
- RESTful API design
- separation of concerns (controller / service / model)
- clean and maintainable code
- correct HTTP status handling

---

## Features

- Create trades
- Retrieve all trades
- Update existing trades
- Delete trades
- In-memory data storage
- Proper HTTP status responses (200, 204, 404)

---

## Technologies

- Java 17
- Spring Boot
- Maven
- Git & GitHub
- Postman (manual API testing)

---

## API Endpoints

| Method | Endpoint        | Description                     |
|-------:|-----------------|---------------------------------|
|    GET | /trades         | Get all trades                  |
|   POST | /trades         | Create a new trade              |
|    PUT | /trades/{id}    | Update an existing trade        |
| DELETE | /trades/{id}    | Delete a trade by ID            |
|    GET | /health         | Health check endpoint           |

---

## Project Structure

```text
src/main/java
└── dev/roggenbuck/tradejournalapi
    ├── TradeJournalApiApplication.java
    ├── controller
    │   ├── TradeController.java
    │   └── HealthController.java
    ├── service
    │   └── TradeService.java
    └── model
        └── Trade.java
```
---

## How to Run

1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Run `TradeJournalApiApplication`
4. The API will be available at `http://localhost:8080`

---

## Testing

The API was tested manually using Postman by sending HTTP requests
for all CRUD operations and verifying the responses.

---

## Planned Improvements

- Database integration (PostgreSQL + Spring Data JPA)
- Swagger / OpenAPI documentation
- Input validation using Bean Validation
- DTO separation between API and domain model
- Basic unit and integration tests

---

## Notes

- This project was built as a structured backend practice project.
- Focus on clean architecture, RESTful APIs and real-world backend patterns.
- Designed as a foundation for further extensions (database, validation, documentation).

---

## Author

Created by Atze Roggenbuck

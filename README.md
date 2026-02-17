# Trade Journal API

A RESTful backend API built with Spring Boot to manage trading journal entries using persistent PostgreSQL storage.

This project was created as a structured backend practice project with a focus on:
- RESTful API design
- Separation of concerns (controller / service / repository / model)
- Database integration using Spring Data JPA
- Clean and maintainable code
- Proper HTTP status handling

---

## Features

- Create trades
- Retrieve all trades
- Update existing trades
- Delete trades
- Persistent storage using PostgreSQL
- Proper HTTP status responses (200, 204, 404)

---

## Technologies

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- PostgreSQL 18
- Docker & Docker Compose
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
    ├── repository
    │   └── TradeRepository.java
    └── model
        └── Trade.java
```
---

## How to Run

1. Clone the repository
2. Start Docker Desktop
3. Start the PostgreSQL container:
```bash
docker compose up -d
```
4. Open the project in IntelliJ IDEA
5. Run `TradeJournalApiApplication`
6. The API will be available at `http://localhost:8080`

---

## Testing

The API was tested manually using Postman by performing full CRUD operations and verifying correct HTTP responses
and database persistence.

---

## Planned Improvements

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

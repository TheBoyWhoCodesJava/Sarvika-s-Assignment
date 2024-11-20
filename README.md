# Spring Boot Product Management API

This project is a simple Spring Boot based REST API that allows performing CRUD operations on
a `Product` entity. It uses Spring Data JPA for database interaction, 
PostgreSQL for persistence, and implements proper validation, exception handling, 
and user-friendly error messages. Swagger (OpenAPI) is also integrated for API documentation.

## Swagger API Link
[http://localhost:8080/swagger-ui/index.html#]

## Features

- **CRUD Operations**: Perform Create, Read, Update, and Delete operations on `Product`.
- **Validation**: Use Java Bean Validation (JSR 380) for input validation on product fields.
- **Exception Handling**: Global exception handling with user-friendly error messages.
- **Swagger UI**: API documentation with Swagger UI.
- **Database**: PostgreSQL for persistence.

## Prerequisites

- Java 17 or later
- PostgreSQL
- Maven
- Postman 

## Technologies Used

- Spring Boot
- Spring Data JPA
- PostgreSQL
- Spring Web
- Spring Validation (JSR 380)
- Swagger (OpenAPI)
- Lombok (for reducing boilerplate code)

## Setup

### Clone the Repository

Clone the repository to local machine using the following command:
Note: Ensure Postgres is added in your machin

```bash
[git clone https://github.com/TheBoyWhoCodesJava/Sarvika-s-Assignment.git]

# Blog Application REST APIs – Spring Boot

Backend REST APIs for a blogging platform, built with **Java 11**, **Spring Boot 2.7**, **Spring Data JPA** and **MySQL** using a clean layered architecture (Controller → Service → Repository).

## Features

- **User CRUD REST APIs** – create, update, delete, list and fetch users
- **Category module** – entity, repository and service layer for blog categories (`CategoryService`)
- **DTO pattern** with ModelMapper to keep entities out of the API layer
- **Bean Validation** on request payloads
- **Global exception handling** (`GlobalExceptionHandler`, `ResourceNotFoundException`) with a consistent `ApiResponse`
- **MySQL** for persistence and **H2** in-memory database for development/testing
- **Lombok** to reduce boilerplate

## Tech stack

Java 11 · Spring Boot 2.7 · Spring Web · Spring Data JPA · Hibernate · MySQL · H2 · Bean Validation · ModelMapper · Lombok · Maven

## REST API

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/users/` | Create a user |
| GET | `/api/users/` | Get all users |
| GET | `/api/users/{userId}` | Get a single user |
| PUT | `/api/users/{userId}` | Update a user |
| DELETE | `/api/users/{userId}` | Delete a user |

## Project structure

```
src/main/java/com/codewithsumit/blog
├── controllers    # UserController, CategoryController
├── entities       # User, Category
├── exeptions      # GlobalExceptionHandler, ResourceNotFoundException
├── payloads       # UserDto, CategoryDto, ApiResponse
├── repositories   # UserRepo, CategoryRepo
└── services       # UserService, CategoryService (+ impl)
```

## Getting started

1. Create a MySQL database named `blog_app_apis`.
2. Set your database username and password in `src/main/resources/application.properties`.
3. Run:

```bash
./mvnw spring-boot:run
```

The API starts on port **9011**.

## Author

**Sumit Sharma** – Java Full Stack Developer (Spring Boot, Microservices, Spring AI)
[LinkedIn](https://www.linkedin.com/in/sumit-sharma-325a24206)

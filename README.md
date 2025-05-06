
# 💼 JobApp

**JobApp** is a Spring Boot application designed to manage job postings. It provides RESTful APIs for CRUD operations on job posts and includes features like keyword-based search.

---

## ✨ Key Features

### 📋 Job Management

* Add, update, delete, and retrieve job postings.
* Each job post includes:

  * `id`
  * `profile`
  * `description`
  * `required experience`
  * A list of `technologies`

### 🔍 Keyword Search

* Search job posts by keywords in the profile or description.

### 📦 Preloaded Data

* Load a sample dataset of job posts using the `/load` endpoint.

### 🌐 RESTful API

* Exposes endpoints for CRUD operations on job posts:

  * `GET`, `POST`, `PUT`, `DELETE` methods supported.


---

## 🛠️ Tech Stack

* **Framework**: Spring Boot
* **Database**: PostgreSQL
* **ORM**: JPA (Java Persistence API)
* **Build Tool**: Maven
* **Utilities**: Lombok for reducing boilerplate code

---

## 📁 Project Structure

```
├── controller
│   └── JobRestController.java       # Handles API requests
├── service
│   └── JobService.java              # Business logic
├── repository
│   └── JobRepo.java                 # JPA repository interface
├── model
│   └── JobPost.java                 # Job post entity
├── configuration
│   └── application.properties       # App config (excluded via .gitignore)

```

---

## ⚙️ `application.properties` Setup

Make sure your `src/main/resources/application.properties` file is configured with the following settings:

```properties
# Application Info
spring.application.name=Backend

# Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/dbName
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.datasource.hikari.auto-commit=false
```

> 💡 **Tip:** Make sure PostgreSQL is running locally and a database named `dbName` exists. Adjust credentials and URL based on your environment.
---

## 📌 API Endpoints

### 🔧 Job Post Operations

| Method | Endpoint                      | Description                 |
| ------ | ----------------------------- | --------------------------- |
| GET    | `/jobPosts`                   | Retrieve all job posts      |
| GET    | `/jobPost/{postId}`           | Retrieve job post by ID     |
| POST   | `/jobPosts`                   | Add a new job post          |
| PUT    | `/jobPosts`                   | Update an existing job post |
| DELETE | `/jobPosts/{postId}`          | Delete a job post by ID     |
| GET    | `/load`                       | Load sample job posts       |
| GET    | `/jobPosts/keyword/{keyword}` | Search job posts by keyword |

---


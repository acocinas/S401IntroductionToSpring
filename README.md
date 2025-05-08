# 🌱 Spring Boot Starter API - S04T01N01

This is an introductory Spring Boot project using Maven, designed to get familiar with:
- 🔧 HTTP requests
- 🧪 API testing with Postman
- 📦 Dependency management with Maven
- ⚙️ Basic controller setup with parameters

---

## 📦 Project Metadata

- **Group**: `cat.itacademy.s04.t01.n01`
- **Artifact**: `S04T01N01`
- **Name**: `S04T01N01`
- **Description**: `S04T01N01`
- **Package name**: `cat.itacademy.s04.t01.n01`
- **Packaging**: `JAR`
- **Java version**: 11+
- **Dependencies**:
  - Spring Boot DevTools
  - Spring Web

---

## 📁 Project Structure

```
cat.itacademy.s04.t01.n01
└── controller
    └── HelloWorldController.java
```

---

## 🔗 Endpoints

### 1. `GET /HelloWorld`

- Accepts a `RequestParam` called `nom`
- Default value: `"UNKNOWN"`
- Example URLs:
  ```
  http://localhost:9000/HelloWorld
  http://localhost:9000/HelloWorld?nom=YourName
  ```
- ✅ Response:
  ```
  Hola, YourName. Estàs executant un projecte Maven.
  ```

---

### 2. `GET /HelloWorld2/{nom}`

- Accepts an optional `PathVariable`
- If not provided, handled internally
- Example URLs:
  ```
  http://localhost:9000/HelloWorld2
  http://localhost:9000/HelloWorld2/YourName
  ```
- ✅ Response:
  ```
  Hola, YourName. Estàs executant un projecte Maven.
  ```

---

## ⚙️ Application Configuration

In `application.properties`, the following setting is used:

```properties
server.port=9000
```

This changes the default server port to `9000`.

---

## 🧪 How to Run and Test

### 🔧 Maven Commands

From the project root:

```bash
mvn compile          # Compile the project
mvn clean            # Clean the compiled files
mvn package          # Package the project as a JAR
mvn spring-boot:run  # Run the Spring Boot application
```

### 🧪 Postman

Use [Postman](https://www.postman.com/) to test both endpoints using `GET` requests and pass parameters via query or path.

---

## 📚 Resources Used

These videos were used as reference while building the project:

- 🎥 [Spring Boot con Maven desde cero - Controladores](https://www.youtube.com/watch?v=C_6DqxKbGM8&t=3s)
- 🎥 [Spring Boot @RequestParam y @PathVariable](https://www.youtube.com/watch?v=Ryt0AfsP1WA&t=1s)

---

## 👨‍💻 Author

**Alfonso**  
🎓 Project for [ItAcademy](https://itacademy.barcelonactiva.cat/)  
📅 2025

---


# Spring Boot REST API - User Management System

## 🎯 Project Description

This project demonstrates the implementation of a RESTful web service using Spring Boot framework. The application provides a complete CRUD (Create, Read, Update, Delete) API for managing user data without database integration, using in-memory storage for simplicity and learning purposes.

## 🚀 Learning Objectives

- **Spring Boot Setup**: Configure and set up a Spring Boot project using VS Code
- **REST API Development**: Build RESTful web services following industry standards
- **HTTP Methods**: Implement GET, POST, PUT, and DELETE operations
- **JSON Handling**: Process JSON requests and responses
- **Error Handling**: Implement proper HTTP status codes and error responses
- **Spring Annotations**: Utilize Spring Boot annotations effectively
- **API Testing**: Test REST endpoints using various tools

## 🛠️ Technologies Used

- **Framework:** Spring Boot 3.x
- **Language:** Java 17+
- **Build Tool:** Maven
- **IDE:** Visual Studio Code
- **Testing:** cURL, Postman
- **Version Control:** Git

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── rest/
│   │               ├── RestApplication.java          # Main Spring Boot Application
│   │               ├── controller/
│   │               │   └── UserController.java      # REST Controller
│   │               └── model/
│   │                   ├── User.java                # User Entity Model
│   │                   └── UserRepository.java      # In-Memory Repository
│   └── resources/
│       └── application.properties                   # Application Configuration
├── target/                                          # Compiled Classes
├── pom.xml                                         # Maven Dependencies
└── README.md                                       # Project Documentation
```

## 🔧 Setup and Installation

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- VS Code with Java extensions
- Git

### VS Code Extensions Required
1. **Spring Initializr Java Support** - Microsoft
2. **Extension Pack for Java** - Microsoft

### Installation Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/spring-boot-rest-api.git
   cd spring-boot-rest-api
   ```

2. **Open in VS Code**
   ```bash
   code .
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```
   
   Or run directly from VS Code by pressing `F5` or running the main class.

4. **Access the application**
   - Base URL: `http://localhost:8080`
   - API Base: `http://localhost:8080/api/users`

## 🌐 API Endpoints

### Base Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/` | Welcome message |
| GET | `/hello?name={name}` | Personalized greeting |

### User Management API
| Method | Endpoint | Description | Request Body |
|--------|----------|-------------|--------------|
| GET | `/api/users` | Get all users | None |
| GET | `/api/users/{id}` | Get user by ID | None |
| POST | `/api/users` | Create new user | User JSON |
| PUT | `/api/users/{id}` | Update user | User JSON |
| DELETE | `/api/users/{id}` | Delete user | None |

### Sample User JSON
```json
{
  "name": "John Doe",
  "email": "john.doe@example.com"
}
```

## 🧪 Testing the API

### Using cURL

1. **Get all users**
   ```bash
   curl -X GET http://localhost:8080/api/users
   ```

2. **Get user by ID**
   ```bash
   curl -X GET http://localhost:8080/api/users/1
   ```

3. **Create new user**
   ```bash
   curl -X POST http://localhost:8080/api/users \
     -H "Content-Type: application/json" \
     -d '{"name":"Alice Johnson","email":"alice@example.com"}'
   ```

4. **Update user**
   ```bash
   curl -X PUT http://localhost:8080/api/users/1 \
     -H "Content-Type: application/json" \
     -d '{"name":"John Updated","email":"john.updated@example.com"}'
   ```

5. **Delete user**
   ```bash
   curl -X DELETE http://localhost:8080/api/users/1
   ```

6. **Test greeting endpoint**
   ```bash
   curl -X GET "http://localhost:8080/hello?name=YourName"
   ```

### Using Postman
1. Import the API endpoints into Postman
2. Set the base URL to `http://localhost:8080`
3. Test each endpoint with appropriate HTTP methods and JSON payloads

## 📊 Features Implemented

- ✅ **Spring Boot Application Setup**
- ✅ **RESTful API Architecture**
- ✅ **CRUD Operations**
- ✅ **In-Memory Data Storage**
- ✅ **JSON Request/Response Handling**
- ✅ **HTTP Status Code Management**
- ✅ **Input Validation**
- ✅ **Error Handling**
- ✅ **Parameterized Endpoints**
- ✅ **Sample Data Population**

## 🎓 Key Concepts Demonstrated

### Spring Boot Annotations
- `@SpringBootApplication` - Main application class
- `@RestController` - REST controller definition
- `@RequestMapping` - Base URL mapping
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` - HTTP method mappings
- `@PathVariable` - URL path variable binding
- `@RequestParam` - Query parameter binding
- `@RequestBody` - JSON request body binding

### HTTP Status Codes
- `200 OK` - Successful GET/PUT operations
- `201 Created` - Successful POST operations
- `204 No Content` - Successful DELETE operations
- `400 Bad Request` - Invalid input data
- `404 Not Found` - Resource not found

## 🚧 Future Enhancements

- [ ] Database integration with JPA/Hibernate
- [ ] User authentication and authorization
- [ ] Input validation with Bean Validation
- [ ] Exception handling with @ControllerAdvice
- [ ] API documentation with Swagger/OpenAPI
- [ ] Unit and integration testing
- [ ] Logging implementation
- [ ] Docker containerization

## 📝 Assignment Requirements Fulfilled

1. ✅ **VS Code Setup** - Configured with required extensions
2. ✅ **Spring Boot Project Creation** - Using Spring Initializr
3. ✅ **Basic REST Endpoint** - Root endpoint implementation
4. ✅ **Parameterized Endpoint** - Hello endpoint with name parameter
5. ✅ **User Model Creation** - POJO with proper getters/setters
6. ✅ **Repository Implementation** - In-memory storage without database
7. ✅ **REST Controller** - Complete CRUD operations
8. ✅ **Application Execution** - Running on default port 8080

## 👨‍💻 Author

Dasun Dushmantha

## 📄 License

This project is created for educational purposes as part of the SE3040 course curriculum.

## 🤝 Contributing

This is an academic assignment. However, suggestions and improvements are welcome for learning purposes.



**Note:** This implementation uses in-memory storage for simplicity. In production applications, proper database integration and security measures should be implemented.

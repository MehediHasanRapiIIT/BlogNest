# BlogNest - A Spring Boot Blog Application

BlogNest is a robust and scalable blog application built using Spring Boot. It provides a comprehensive set of features for managing users, categories, posts, and comments, along with file upload capabilities and API documentation.

## Technologies Used

*   **Spring Boot:** Framework for building stand-alone, production-grade Spring applications.
*   **Spring Data JPA:** For easy data access and persistence with Hibernate.
*   **Spring Web:** For building RESTful APIs.
*   **Spring Security:** For authentication and authorization.
*   **MySQL Connector/J:** JDBC driver for MySQL database connectivity.
*   **Lombok:** Reduces boilerplate code for Java classes.
*   **ModelMapper:** Object mapping library for mapping DTOs to entities and vice-versa.
*   **Spring Boot Starter Validation:** For declarative data validation.
*   **Springdoc OpenAPI UI:** For automatic generation of API documentation (Swagger UI).
*   **Maven:** Build automation tool.

## Features

*   **User Management:** Create, read, update, and delete user accounts.
*   **Category Management:** Manage blog post categories.
*   **Post Management:** Create, read, update, and delete blog posts.
*   **Comment Management:** Add and manage comments on blog posts.
*   **File Upload:** Support for uploading images (e.g., for post thumbnails).
*   **API Security:** Basic authentication and authorization using Spring Security.
*   **RESTful APIs:** All functionalities exposed via well-defined REST endpoints.
*   **API Documentation:** Interactive API documentation available via Swagger UI.

## Database Configuration

This application uses MySQL as its database. Before running the application, ensure you have a MySQL server running.

1.  **Create Database:** Create a database named `blog_app_apis` in your MySQL server.
2.  **Update `application.properties`:** The database connection details are configured in `src/main/resources/application.properties`.
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/blog_app_apis
    spring.datasource.username=root
    spring.datasource.password=
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true
    ```
    Adjust `spring.datasource.username` and `spring.datasource.password` according to your MySQL setup. The `ddl-auto=update` property will automatically create/update tables based on your JPA entities.

## Running the Application

To run the BlogNest application:

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/MehediHasanRapiIIT/BlogNest.git
    cd BlogNest
    ```
2.  **Build the project:**
    ```bash
    ./mvnw clean install
    ```
3.  **Run the application:**
    ```bash
    ./mvnw spring-boot:run
    ```
    The application will start on port 8080 by default.

## API Documentation (Swagger UI)

Once the application is running, you can access the interactive API documentation (Swagger UI) at:
`http://localhost:8080/swagger-ui.html`

## Security

The application uses basic authentication. Default user credentials are set in `application.properties`:
```properties
spring.security.user.name=mehedi
spring.security.user.password=mehedi
spring.security.user.roles=ADMIN
```
You can modify these credentials or implement more advanced security mechanisms as needed.

## File Uploads

Uploaded images are stored in the `images/` directory within the project root. The maximum file size for uploads is configured to 10MB.
```properties
project.image = images/
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=10MB
```

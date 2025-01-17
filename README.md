Waste Category Management Application
This project is a Spring Boot based RESTful web application designed for managing waste categories 
Users can perform basic CRUD ( Create, Read, Update and Delete) on waste categories
The application leverages an in memory H2 data storage, with endpoints tested using Postman

Technologies used
Java: Core programming language.
Spring Boot:
Spring Web: To build RESTful APIs.
Spring Data JPA: To manage database interactions.
Spring Validation: To validate user inputs.
H2 Database: An in-memory database for local development and testing.
Maven: For dependency management.
Git and GitHub: For version control and repository hosting.

Features
RESTful APIs:
Perform CRUD operations on waste categories.

Validation:
Ensures valid inputs for creating and updating categories.
Example: Category name cannot be blank, and the description cannot exceed 255 characters.

Error Handling:
Returns meaningful error messages for validation and invalid operations.

In-Memory Database:
H2 Database used for quick development and testing.

API Endpoints

HTTP Method

Endpoint

Description

GET

/api/categories

Fetch all waste categories.

POST

/api/categories

Add a new waste category.

PUT

/api/categories/{id}

Update an existing waste category.

DELETE

/api/categories/{id}

Delete a waste category by ID.

Application structure

src/main/java/com/enviro/assessment/grad001/MinenhleMadlala/
├── MinenhleMadlalaApplication.java  // Main entry point of the application.
├── entity/
│   └── WasteCategory.java           // Defines the WasteCategory entity.
├── controller/
│   └── WasteCategoryController.java // Handles HTTP requests and responses.
├── service/
│   └── WasteCategoryService.java    // Contains the business logic.
├── repository/
│   └── WasteCategoryRepository.java // Handles database interactions.

How to Run the Application
Clone the Repository:
git clone https://github.com/minenhleMadlala/WasteCategoryManagement.git
cd WasteCategoryManagement

Run the application
Using Maven:
mvn spring-boot:run
Access the H2 Database:

Open a browser and navigate to http://localhost:8080/h2-console.

Enter the following credentials:

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: password

Test the Endpoints:
Using Postman or any other API client to interact with the API

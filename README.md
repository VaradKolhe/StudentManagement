# Student CRUD Web Application (Spring + MySQL via XAMPP)

A full-stack Java web application built with **Spring Framework** that performs CRUD operations on student data using a MySQL database served through **XAMPP**.

## Technologies Used
- Java 8
- Spring Framework (Core, Web MVC)
- MySQL (via XAMPP)
- JDBC Template or JPA (as used)
- Apache Tomcat (embedded or via Eclipse)
- Eclipse IDE

## Features
- Create new student records
- Update student information
- Delete students
- View all students
- Spring-managed services and DAO layers


## How to Run
1. Start **Apache** and **MySQL** from **XAMPP Control Panel**
2. Create a MySQL DB:
    ```sql
    CREATE DATABASE studentdb;
    ```
3. Import the provided `student.sql` if available.
4. Open the project in **Eclipse** as a Maven project (if using Maven).
5. Configure database credentials in `application.properties` or XML file.
6. Deploy the app on **Tomcat** or run via Eclipse server.

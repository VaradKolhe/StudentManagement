# Student CRUD Web Application (Spring + MySQL via XAMPP)

A full-stack Java web application built with **Spring Framework** that performs CRUD operations on student data using a MySQL database served through **XAMPP**.

## Technologies Used
- Java 8
- Spring Framework
- MySQL (via XAMPP)
- JDBC Template
- Apache Tomcat

## Features
- Create new student records
- Update student information
- Delete students
- View all students
- Spring-managed services and DAO layers


## How to Run
1. Start **Apache** and **MySQL** from **XAMPP Control Panel**
2.1. Create school MySQL DB:
    ```sql
    CREATE DATABASE school;
    ```
2.2. Create student table in school DB
    ```sql
    CREATE TABLE student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    course VARCHAR(100),
    fee DECIMAL(10, 2),
    studentname VARCHAR(100)
    );
    ```
4. Open the project in **Eclipse** as a Maven project (if using Maven).
5. Run the file src/main/java/com/example/emp/StudentCrudApplication.java as a java project.

Use this project as a localhost

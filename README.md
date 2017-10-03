# Spring Boot Docker example
Example of the Spring Boot + Docker 

# Prerequisites
- JDK 8
- Maven
- Docker

# Build and create Docker image
- mvn clean package

# Run with Docker
- docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8080:8080 -t springio/spring-boot.app

# access with browser
- http://localhost:8080/
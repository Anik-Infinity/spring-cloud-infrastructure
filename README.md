# Spring Cloud Infrastructure

This project demonstrates a microservices architecture using Spring Cloud components:
- Eureka Server for service discovery
- Spring Cloud Gateway for API Gateway
- Hello Service as a sample microservice
- Goodbye Service as another sample microservice

## Prerequisites
- Java 21 or higher
- Maven 3.6 or higher

## Project Structure
```
spring-cloud-infrastructure/
├── eureka-server/         # Service Discovery Server (Port: 8761)
├── gateway-server/        # API Gateway (Port: 8080)
├── hello-service/         # Hello Microservice (Port: 8081)
└── goodbye-service/       # Goodbye Microservice (Port: 8082)
```

## Running the Application

1. Start the Eureka Server:
```bash
cd eureka-server
mvn spring-boot:run
```

2. Start the Gateway Server:
```bash
cd gateway-server
mvn spring-boot:run
```

3. Start the Hello Service:
```bash
cd hello-service
mvn spring-boot:run
```

4. Start the Goodbye Service:
```bash
cd goodbye-service
mvn spring-boot:run
```

## Testing the Application

Once all services are running, you can test them through the Gateway:

1. Access the Eureka Dashboard:
```
http://localhost:8761
```

2. Test the Hello Service:
```
http://localhost:8080/hello
```

3. Test the Goodbye Service:
```
http://localhost:8080/goodbye
```

## Ports
- Eureka Server: 8761
- Gateway Server: 8080
- Hello Service: 8081
- Goodbye Service: 8082 
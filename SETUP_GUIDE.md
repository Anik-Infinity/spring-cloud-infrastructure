# Spring Cloud Infrastructure Setup Guide

## Quick Start

1. **Clone the Repository**
```bash
git clone <repository-url>
cd spring-cloud-infrastructure
```

2. **Open in Cursor**
- Open Cursor IDE
- Open the project folder

3. **Build the Project**
```bash
mvn clean install
```

## Service Architecture

```
spring-cloud-infrastructure/
├── eureka-server/         # Service Discovery (Port: 8761)
├── gateway-server/        # API Gateway (Port: 8080)
├── hello-service/         # Sample Service (Port: 8081)
└── goodbye-service/       # Sample Service (Port: 8082)
```

## Running the Services

Start services in this order:

1. **Eureka Server**
```bash
cd eureka-server
mvn spring-boot:run
```
- Access dashboard: http://localhost:8761

2. **Gateway Server**
```bash
cd gateway-server
mvn spring-boot:run
```

3. **Hello Service**
```bash
cd hello-service
mvn spring-boot:run
```

4. **Goodbye Service**
```bash
cd goodbye-service
mvn spring-boot:run
```

## Testing the Setup

1. **Check Eureka Dashboard**
- Open http://localhost:8761
- Verify all services are registered

2. **Test Services via Gateway**
- Hello Service: http://localhost:8080/hello
- Goodbye Service: http://localhost:8080/goodbye

## Key Features

- **Service Discovery**: Eureka Server manages service registration
- **API Gateway**: Single entry point for all client requests
- **Load Balancing**: Automatic load balancing across service instances
- **Health Monitoring**: Service health checks via Eureka

## Technology Stack

- Java 17
- Spring Boot 3.2.3
- Spring Cloud 2023.0.0
- Maven 3.6+

## Common Issues & Solutions

1. **Port Conflicts**
- Ensure no other services are using ports 8761, 8080, 8081, 8082
- Change ports in respective `application.yml` if needed

2. **Service Registration Issues**
- Check Eureka Server is running
- Verify service URLs in `application.yml`
- Check network connectivity

## Need Help?

- Check the main [README.md](README.md) for detailed documentation
- Review Spring Cloud documentation
- Contact the team for support 
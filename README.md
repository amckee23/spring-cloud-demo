# Spring Cloud Example App
This repository represents an example of the following netflix oss tools:
- Zuul as an edge service
- Eureka as a service discovery application 
- Hystrix for request failover
- Ribbon for software load balancing
- Feign for http requests

## Pre-requisites to run the code

1. Java 8
2. Docker
3. Docker-compose
4. Gradle

## Steps to run the application

1. Clone the repository 
2. From the terminal run gradle clean build buildDocker
3. From the terminal run docker-compose up -d e`

## Test URL's for java microservices
   http://localhost:8090/routes
   http://localhost:8090/product
   http://localhost:8090/customer

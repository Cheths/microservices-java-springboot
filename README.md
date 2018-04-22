# Simple application creating a Spring Cloud Microservice
Microservice written in Java with the help of Spring Cloud.

Microservices are able to communicate between each other through a gateway; an endpoint which is the entry point of the application. 
The gateway will redirect requests to a particular microservice based on endpoint it receives.

Short note on the frameworks used:
  - Spring Boot  - Application is built using Spring Boot framework
  - Spring Cloud - For Configuration Management and Service Discovery
  - Eureka Registry Service - To register all the services(phonebook to all the services within)

# Config files - <*.yml> files
Contains Configuration Files for Microservices with Java-Spring  Application to run.

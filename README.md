springboot-rabbitmq-microservices
===================

Event-Driven Microservices architecture with patterns using Spring Boot, RabbitMQ

## Required Software

* _Java 17_
* _Spring Boot 3.1.1_
* _RabbitMQ 3.12.1-management_

## Usage

```bash
$ docker pull rabbitmq:3.12.1-management
$ docker run --rm -it -p 15672:15672 -p 5672:5672 rabbitmq:3.10.50-management

# Start
1. order-service
2. stock-service
3. email-service
```
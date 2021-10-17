## Spring cloud stream using Kafka

A simple Spring Boot application to send and receive messages using Spring Cloud Stream with Kafka, Apache Avro and Confluent Schema Registry

To run the application:
1. After cloning the project, run `mvn clean compile` in the terminal
2. Execute the command - `curl -X POST localhost:9092/employees/1001/Harry/Potter` in terminal

Reference:
1. https://www.baeldung.com/spring-cloud-stream-kafka-avro-confluent
2. https://www.baeldung.com/ops/kafka-docker-setup

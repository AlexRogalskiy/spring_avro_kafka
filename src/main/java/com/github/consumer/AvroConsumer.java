package com.github.consumer;

import com.github.classes.avro.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AvroConsumer {

    @StreamListener(Processor.INPUT)
    public void consumeEmployeeDetails(Employee employeeDetails) {
        log.info("Let's process employee details: {}", employeeDetails);
    }
}

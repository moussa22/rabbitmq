package com.udemy.consumer.impl;

import com.udemy.consumer.consumer.IConsumer;
import com.udemy.consumer.json.Student;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class consumer implements IConsumer {

    @Override
    @RabbitListener (queues="${udemy.rabbitmq.queue}")
    public void consumerMessage(String message) {

        System.out.println("Receive message: ="+message);

    }

    @Override
    @RabbitListener (queues="${udemy.rabbitmq.queue}")
    public void consumerStudent(Student student) {

        System.out.println("Receive message: ="+student.toString());

    }
}

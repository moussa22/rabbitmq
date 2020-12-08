package com.udemy.consumer.consumer;

import com.udemy.consumer.json.Student;

public interface IConsumer {

    void consumerMessage(String message);
    void consumerStudent(Student student);
}

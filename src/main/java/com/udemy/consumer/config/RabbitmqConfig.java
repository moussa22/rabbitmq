package com.udemy.consumer.config;


import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitmqConfig {
@Bean
    MessageConverter messageConverter(){

        return new Jackson2JsonMessageConverter();

    }

    public SimpleRabbitListenerContainerFactory rabbitFactory(ConnectionFactory connectionFactory, SimpleRabbitListenerContainerFactoryConfigurer Configurer) {
        SimpleRabbitListenerContainerFactory factory=new SimpleRabbitListenerContainerFactory();
        Configurer.configure(factory,connectionFactory);
        factory.setMessageConverter(messageConverter());
        return factory;
    }



}

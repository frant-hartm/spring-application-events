package com.example;

import javax.annotation.PostConstruct;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyBean  {

    private ApplicationEventPublisher applicationEventPublisher;

    public MyBean(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @PostConstruct
    public void postConstruct() {
        publish("from postConstruct");
    }

    public void publish(String message) {
        applicationEventPublisher.publishEvent(new MyEvent(message));
    }
}

package com.example;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    private String value;

    public MyEvent(String value) {
        super(value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MyEvent{" +
               "value='" + value + '\'' +
               '}';
    }
}

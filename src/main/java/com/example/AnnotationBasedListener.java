package com.example;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationBasedListener {

    @EventListener
    public void handleEvent(MyEvent myEvent) {
        System.out.println("Annotation based sees event: " + myEvent);
    }
}

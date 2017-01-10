package com.example;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class InterfaceBasedListener implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("Interface based sees event: " + myEvent);
    }

}

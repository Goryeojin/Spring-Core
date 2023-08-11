package me.whiteship.demospring51;

import org.springframework.context.ApplicationEvent;

//public class MyEvent extends ApplicationEvent { // Spring 4.2 이전
public class MyEvent { // Spring 4.2 이후

    int data;
    Object source;

    public MyEvent(Object source, int data) {
        this.source = source;
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Object getSource() {
        return source;
    }
}

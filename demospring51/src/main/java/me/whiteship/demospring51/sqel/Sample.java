package me.whiteship.demospring51.sqel;

import org.springframework.stereotype.Component;

@Component
public class Sample {

    int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

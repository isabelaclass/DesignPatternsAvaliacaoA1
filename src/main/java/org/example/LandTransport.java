package org.example;

public class LandTransport implements Transport {

    @Override
    public void deliver() {
        System.out.println("LandTransport");
    }
}

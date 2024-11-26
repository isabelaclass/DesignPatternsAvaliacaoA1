package org.example;

public class AirTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("AirTransport");
    }
}

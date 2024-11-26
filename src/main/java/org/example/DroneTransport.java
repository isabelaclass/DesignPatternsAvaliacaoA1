package org.example;

public class DroneTransport implements Transport {
    @Override
    public void deliver() {
        System.out.println("DroneTransport");
    }
}

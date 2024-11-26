package org.example;

public class DroneTransportFactory extends TransportFactory {

    @Override
    public Transport createTransport(Package pkg) {
        return new DroneTransport();
    }
}
package org.example;

public class LandTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport(Package pkg) {
            return new LandTransport();
    }
}

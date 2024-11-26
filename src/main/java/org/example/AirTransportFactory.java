package org.example;


public class AirTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport(Package pkg) {
            return new AirTransport();
    }
}
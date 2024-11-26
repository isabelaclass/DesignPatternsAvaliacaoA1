package org.example;

public class SeaTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport(Package pkg) {
            return new SeaTransport();

    }
}
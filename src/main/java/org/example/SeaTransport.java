package org.example;

public class SeaTransport implements Transport {

    @Override
    public void deliver() {
        System.out.println("SeaTransport");
    }
}

package org.example;
public class Package {
    private double weight;
    private String dimensions;
    private String destination;
    private boolean isInternational;
    private boolean isMetropolitanArea;

    public Package(double weight, String dimensions, String destination, boolean isInternational, boolean isMetropolitanArea) {
        this.weight = weight;
        this.dimensions = dimensions;
        this.destination = destination;
        this.isInternational = isInternational;
        this.isMetropolitanArea = isMetropolitanArea;
    }

    public double getWeight() {
        return weight;
    }

    public String getDimensions() {
        return dimensions;
    }

    public String getDestination() {
        return destination;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public boolean isMetropolitanArea() {
        return isMetropolitanArea;
    }
}

package org.example;

public class TransportManager {
    public static void main(String[] args) {

        Package pkg1 = new Package(10.0, "50x30x20", "City A", true, false);
        Package pkg2 = new Package(55.0, "80x50x40", "City B", false, false);
        Package pkg3 = new Package(20.0, "100x80x50", "Country X", false, false);
        Package pkg4 = new Package(3.0, "20x20x20", "City C", false, true);

        try {
            deliverPackage(pkg1);
            deliverPackage(pkg2);
            deliverPackage(pkg3);
            deliverPackage(pkg4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void deliverPackage(Package pkg) {
        Transport transport = getTransportForPackage(pkg);
        transport.deliver();
    }

    private static Transport getTransportForPackage(Package pkg) {
        if (pkg == null) {
            throw new IllegalArgumentException("Package cannot be null.");
        }

        if (!pkg.isInternational() && pkg.getWeight() <= 5.0 && pkg.isMetropolitanArea()) {
            return new DroneTransport();
        } else if (!pkg.isInternational() && pkg.getWeight() >= 30.0) {
            return new LandTransport();
        } else if (pkg.getWeight() <= 30.0 && !pkg.isInternational()) {
            return new AirTransport();
        } else if (pkg.isInternational()) {
            return new SeaTransport();
        }

        throw new IllegalArgumentException("No suitable transport method available for this package.");
    }
}

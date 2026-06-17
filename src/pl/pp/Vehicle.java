package pl.pp;

public abstract class Vehicle {
    private final String registrationNumber;
    private final String vinNumber;
    private final String color;
    private final double price;
    private final double fuelConsumption;
    private final FuelType fuelType;
    private double fuelLevel;
    private double mileage;

    public Vehicle(
            String registrationNumber,
            String vinNumber,
            String color,
            double price,
            double fuelConsumption,
            double fuelLevel,
            double mileage,
            FuelType fuelType) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
        this.fuelType = fuelType;
    }

    public void drive() {
        double distance = 100.0;
        double requiredFuel = fuelConsumption;

        if (fuelLevel < requiredFuel) {
            System.out.println(getVehicleType() + " " + registrationNumber
                    + " cannot drive. Not enough fuel or charge.");
            return;
        }

        fuelLevel -= requiredFuel;
        mileage += distance;
        System.out.println(getVehicleType() + " " + registrationNumber
                + " drove " + distance + " km.");
    }

    public void refuel() {
        fuelLevel = 100.0;
        System.out.println(getVehicleType() + " " + registrationNumber
                + " refueled or charged to 100.");
    }

    public void displayInfo() {
        System.out.println("Vehicle type: " + getVehicleType());
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("VIN number: " + vinNumber);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Fuel type: " + fuelType.getFuelType());
        System.out.println("Fuel consumption: " + fuelConsumption);
        System.out.println("Fuel level: " + fuelLevel);
        System.out.println("Mileage: " + mileage);
    }

    protected abstract String getVehicleType();
}

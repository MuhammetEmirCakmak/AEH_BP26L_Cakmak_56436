package pl.pp;

public class PassengerCar extends Vehicle {
    private final int numberOfDoors;

    public PassengerCar(
            String registrationNumber,
            String vinNumber,
            String color,
            double price,
            double fuelConsumption,
            double fuelLevel,
            double mileage,
            FuelType fuelType,
            int numberOfDoors) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage, fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }

    @Override
    protected String getVehicleType() {
        return "Passenger car";
    }
}

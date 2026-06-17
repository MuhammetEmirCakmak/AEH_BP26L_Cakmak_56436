package pl.pp;

public class ConstructionEquipment extends Vehicle {
    private final double hoursWorked;

    public ConstructionEquipment(
            String registrationNumber,
            String vinNumber,
            String color,
            double price,
            double fuelConsumption,
            double fuelLevel,
            double mileage,
            FuelType fuelType,
            double hoursWorked) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage, fuelType);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Hours worked: " + hoursWorked);
    }

    @Override
    protected String getVehicleType() {
        return "Construction equipment";
    }
}

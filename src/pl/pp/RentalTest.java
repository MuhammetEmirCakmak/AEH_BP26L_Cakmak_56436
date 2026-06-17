package pl.pp;

public class RentalTest {
    public static void main(String[] args) {
        Vehicle passengerCar = new PassengerCar(
                "WA12345",
                "VINPASSENGER001",
                "Blue",
                85000,
                6.5,
                40,
                12500,
                new GasolineEngine(),
                5);

        Vehicle truck = new Truck(
                "WB98765",
                "VINTRUCK002",
                "White",
                180000,
                14.0,
                70,
                54000,
                new DieselEngine(),
                3500);

        Vehicle motorcycle = new Motorcycle(
                "WM45678",
                "VINMOTO003",
                "Black",
                42000,
                4.0,
                25,
                7800,
                new GasolineEngine(),
                false);

        Vehicle excavator = new ConstructionEquipment(
                "WC22222",
                "VINEQUIPMENT004",
                "Yellow",
                320000,
                18.0,
                85,
                900,
                new DieselEngine(),
                1350);

        Vehicle electricCar = new PassengerCar(
                "WE55555",
                "VINELECTRIC005",
                "Silver",
                160000,
                15.0,
                90,
                3200,
                new ElectricEngine(),
                4);

        Vehicle[] vehicles = {passengerCar, truck, motorcycle, excavator, electricCar};

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.drive();
            vehicle.refuel();
            System.out.println();
        }
    }
}

package pl.pp;

public class Warehouse {
    private int warehouseNumber;
    private int availableSpace;
    private int occupiedSpace;
    private String ownerName;
    private String email;
    private String phoneNumber;

    public Warehouse() {
        this.occupiedSpace = 0;
    }

    public int getWarehouseNumber() {
        return warehouseNumber;
    }

    public void setWarehouseNumber(int warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public int getAvailableSpace() {
        return availableSpace;
    }

    public void setAvailableSpace(int availableSpace) {
        this.availableSpace = availableSpace;
    }

    public int getOccupiedSpace() {
        return occupiedSpace;
    }

    public void setOccupiedSpace(int occupiedSpace) {
        this.occupiedSpace = occupiedSpace;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addGoods(int amount) {
        if (amount > availableSpace) {
            System.out.println("Not enough space in the warehouse. Remaining warehouse space: " + availableSpace + " units.");
        } else {
            availableSpace -= amount;
            occupiedSpace += amount;
            System.out.println("Added " + amount + " units of goods. Remaining warehouse space: " + availableSpace + " units.");
        }
    }

    public void removeGoods(int amount) {
        if (amount > occupiedSpace) {
            System.out.println("Not enough goods in the warehouse to remove.");
        } else {
            availableSpace += amount;
            occupiedSpace -= amount;
            System.out.println("Removed " + amount + " units of goods. Remaining warehouse space: " + availableSpace + " units.");
        }
    }

    public void checkOccupancy() {
        System.out.println("Occupied warehouse space: " + occupiedSpace + " units.");
        System.out.println("Available warehouse space: " + availableSpace + " units.");
    }

    public void updateContact(String newEmail, String newPhoneNumber) {
        this.email = newEmail;
        this.phoneNumber = newPhoneNumber;
        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + this.email);
        System.out.println("New phone number: " + this.phoneNumber);
    }
}

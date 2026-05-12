package pl.pp;

public class myNinthApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.setAvailableSpace(5000);
        warehouse.setOwnerName("Default Owner");
        warehouse.setEmail("default@example.com");
        warehouse.setPhoneNumber("+00 000 000 000");

        warehouse.addGoods(3000);
        warehouse.removeGoods(1000);
        warehouse.addGoods(2500);
        
        warehouse.checkOccupancy();
        
        warehouse.updateContact("owner@magazyn.pl", "+48 123 456 789");
        
        warehouse.addGoods(1000);
    }
}

package pl.pp;

public class mySeventhApp {
    public static void main(String[] args) {
        // Create a new Person instance
        Person person = new Person("Muhammet Emir Cakmak", 20, "Warsaw, Poland", 2006);

        System.out.println("Initial Person State:");
        person.displayInfo();
        System.out.println("-------------------------");

        // Test growOld method with an argument
        System.out.println("Calling growOld(10)...");
        person.growOld(10);
        person.displayInfo();
        System.out.println("-------------------------");

        // Test beYounger method
        System.out.println("Calling beYounger()...");
        person.beYounger();
        person.displayInfo();
        System.out.println("-------------------------");
        
        System.out.println("Calling beYounger()...");
        person.beYounger();
        person.displayInfo();
    }
}

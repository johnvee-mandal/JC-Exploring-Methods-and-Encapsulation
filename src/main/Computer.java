package main;
public class Computer {
    private String brand;
    private int ramInGB;


    public Computer() {
        this("Generic", 8); 
    }

    public Computer(String brand) {
        this(brand, 8); 
    }

    public Computer(String brand, int ramInGB) {
        this.brand = brand;
        this.ramInGB = ramInGB;
    }

    public void display() {
        System.out.println("Brand = " + this.brand + ", RAM = " + this.ramInGB + "GB");
    }

    public static void runChallenge() {
        Computer c1 = new Computer();
        System.out.print("Computer 1: ");
        c1.display();

        Computer c2 = new Computer("Dell");
        System.out.print("Computer 2: ");
        c2.display();

        Computer c3 = new Computer("Apple", 16);
        System.out.print("Computer 3: ");
        c3.display();
    }
}
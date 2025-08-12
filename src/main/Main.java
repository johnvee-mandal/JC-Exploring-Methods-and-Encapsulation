package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Exercise 1: Designing Methods ---");
        Car.runChallenge();
        System.out.println("\n---------------------------------------\n");

        System.out.println("--- Exercise 2: Passing Parameters ---");
        StudentChanger.runChallenge();
        System.out.println("\n---------------------------------------\n");

        System.out.println("--- Exercise 3: Using Varargs ---");
        LargestNumberFinder.runChallenge();
        System.out.println("\n---------------------------------------\n");

        System.out.println("--- Exercise 4: Access Specifiers ---");
        SmartDoor.runChallenge();
        System.out.println("\n---------------------------------------\n");

        System.out.println("--- Exercises 5 & 6: Static Methods and Overloading ---");
        Converter.runChallenge();
        System.out.println("\n---------------------------------------\n");

        System.out.println("--- Exercise 7: Constructors ---");
        Computer.runChallenge();
        System.out.println("\n---------------------------------------\n");

        System.out.println("--- Exercise 8: Encapsulation ---");
        User.runChallenge();
        System.out.println("\n---------------------------------------\n");
    }
}
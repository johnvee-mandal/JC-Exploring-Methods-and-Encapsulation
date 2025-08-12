package main;
public class SmartDoor {
    private boolean isLocked = false;

    public void lockDoor() {
        System.out.println("Locking the door...");
        this.isLocked = true;
    }

    public void unlockDoor() {
        System.out.println("Unlocking the door...");
        this.isLocked = false;
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    public static void runChallenge() {
        SmartDoor door = new SmartDoor();
        System.out.println("Is the door locked? " + door.isLocked());
        door.lockDoor();
        System.out.println("Is the door locked? " + door.isLocked());
        door.unlockDoor();
        System.out.println("Is the door locked? " + door.isLocked());
    }
}
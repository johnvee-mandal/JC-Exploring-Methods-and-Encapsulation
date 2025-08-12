package main;

public class LargestNumberFinder {
    public static int findLargest(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            return Integer.MIN_VALUE;
        }

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void runChallenge() {
        System.out.println("Largest in (10, 5, 25, 15) is: " + findLargest(10, 5, 25, 15));
        System.out.println("Largest in (-5, -1, -10) is: " + findLargest(-5, -1, -10));
        System.out.println("Largest with no numbers is: " + findLargest());
    }
}
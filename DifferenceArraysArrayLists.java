import java.util.ArrayList;

public class DifferenceArraysArrayLists {

    public static void main(String[] args) {

        // -------------------------------
        // 1. ARRAYS
        // -------------------------------
        System.out.println("=== ARRAY EXAMPLE ===");

        // Arrays have FIXED SIZE
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.print("Array contents: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // You CANNOT add or remove elements
        // numbers[5] = 60;  // ERROR: out of bounds


        // -------------------------------
        // 2. ARRAYLISTS
        // -------------------------------
        System.out.println("\n=== ARRAYLIST EXAMPLE ===");

        // ArrayLists are RESIZABLE
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements dynamically
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("ArrayList contents: " + list);

        // Add more elements anytime
        list.add(40);
        list.add(50);

        System.out.println("After adding more: " + list);

        // Remove elements
        list.remove(2); // removes element at index 2
        System.out.println("After removing index 2: " + list);

        // ArrayList automatically resizes
        list.add(99);
        list.add(77);
        System.out.println("After more additions: " + list);

        // Accessing elements is similar
        System.out.println("Element at index 1: " + list.get(1));

        // Size is dynamic
        System.out.println("ArrayList size: " + list.size());
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] original = {2, 3, 4, 5};
        int newElement = 1;

        // Create a new array with 1 extra space
        int[] newArray = new int[original.length + 1];

        // Add new element at beginning
        newArray[0] = newElement;

        // Copy original elements to new array starting from index 1
        for (int i = 0; i < original.length; i++) {
            newArray[i + 1] = original[i];
        }

        // Print result
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}

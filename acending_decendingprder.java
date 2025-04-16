//for decending order of array

import java.util.Arrays;
import java.util.Collections;
// change the file name 
public class Main {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 8, 1, 2};
        
        // Sort the array in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
//for ascending order
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 8, 1, 2};
        
        // Sort the array in descending order
        Arrays.sort(arr);
        
        // Print the sorted array
        System.out.println(arr));
    }
}
//ascending first half then decending next half 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        // Input elements
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Reverse the second half
        int half = n / 2;
        int left = half, right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // Output result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

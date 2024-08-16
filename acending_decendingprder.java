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

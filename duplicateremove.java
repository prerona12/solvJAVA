//advance way of sloving removal of array element which are duplicate


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element size:");
        int n = input.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        // Using a Set to remove duplicates
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        
        // Converting the Set back to an array
        int[] arr2 = new int[set.size()];
        int t = 0;
        for (int num : set) {
            arr2[t++] = num;
        }
        
        // Sorting the array (optional)
        Arrays.sort(arr2);
        
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
// another way to do this 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};

        // Convert array to set to remove duplicates
        Set<Integer> set = new LinkedHashSet<>(); // maintains insertion order
        for (int num : arr) {
            set.add(num);
        }

        // Print unique elements
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
// If you want the result back in an array:
Integer[] uniqueArr = set.toArray(new Integer[0]);

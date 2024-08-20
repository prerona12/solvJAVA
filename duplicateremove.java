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

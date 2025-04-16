//to find frequency of a digit in array 
import java.util.Scanner;
//change the file name
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = input.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println("Digit " + arr[i] + " frequency: " + count);
            }
        }
    }
}

//hashmap easy but complicated 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split(" ");
        
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : str) {
            list.add(Integer.parseInt(s));
        }

        // Frequency map
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : list) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Display frequencies
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}

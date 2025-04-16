import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

//change the file name 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = input.nextInt();
        
        // Use Integer instead of int for the array
        Integer[] arr = new Integer[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        // Reverse the array
        Collections.reverse(Arrays.asList(arr));
        
        // Print the reversed array
        System.out.println(Arrays.toString(arr));
    }
}


//strings input
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		String [] str = str1.split(" ");
		int[] arr = new int[str.length];
		int c=0;

        // Convert string array to int array
        for (int i = str.length-1; i >=0 ; i--) {
            arr[c] = Integer.parseInt(str[i]);
            c++;
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
	}
}


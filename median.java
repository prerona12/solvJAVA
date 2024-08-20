//median of a array  

import java.util.*;
import java.util.Collections;
import java.util.Arrays;
public class Main{
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.println("eneter the element size");
        int n = input.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int sum=n/2;
        Arrays.sort(arr);
        System.out.println(arr[sum]);
        
        
    }
}

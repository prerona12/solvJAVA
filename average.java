//the average of a array

import java.util.*;
public class Main{
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.println("eneter the element size");
        int n = input.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
             
        }
        double sum2=(double)sum/n;
        System.out.println(sum2);
    }
}

//the sum of array in java

import java.util.*;
public class Main{
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.println("eneter the element size");
        int a = input.nextInt();
        int [] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<a;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        
    }
}

//PAIR OF SUB ARRAY IS IN RANGE OR NOT CHECK 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int lower = input.nextInt();
        int upper = input.nextInt();
       
        int check =0; 
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                String combined = String.valueOf(arr[i]) + String.valueOf(arr[j]);
                int num = Integer.parseInt(combined);
                if(num>=lower && num<=upper){
                    check++;
                }
            }
        }
        
       System.out.println(check); 
    }
}
// ANOTHER MATERIAL EXPENDITURE ONE NEEDTO LOOK IYSELF

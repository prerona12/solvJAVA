//rotation of a array from k element

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
        System.out.println("eneter the element size K");
       int k= input.nextInt();
       int [] arru = new int[a];
       int o=0;
       for(int i=k;i<a;i++){
           arru[i]=arr[o];
           o++;
       }
       for(int j=0;j<k;j++){
           arru[j]=arr[o];
           o++;
       }
        for(int i=0;i<a;i++){
            System.out.print(arru[i]+" ");
        }
    }
}

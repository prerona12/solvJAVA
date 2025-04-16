import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b= reader.readLine();
        a=a.replaceAll("\\s","").toLowerCase();
        b=b.replaceAll("\\s","").toLowerCase();
        if(a.length()!=b.length()){
            System.out.println("false");
        }
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        
    }
}

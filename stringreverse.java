//reverse the string 


import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseString
class Main {
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);
        String input = i.next();

        StringBuilder input1 = new StringBuilder();

      
        input1.append(input);

       
        input1.reverse();

       
        System.out.println(input1);
    }
}

//reverse the string in java

import java.lang.StringBuilder;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String original = in.nextLine();
	    StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString(); 
        System.out.println(reversed);
		
	}
}
//another wayeasy

import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String res ="";
        for(int i=str.length()-1;i>=0;i--){
            res = res+str.charAt(i);
        }
        System.out.println(res);
    }
}
//when array size is not given 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String num[] = str.split(" ");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = num.length - 1; i >= 0; i--) {
            list.add(Integer.parseInt(num[i]));
        }
		for(int e : list){
		    System.out.print(e + " ");
		}
		
	}
}

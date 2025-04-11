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

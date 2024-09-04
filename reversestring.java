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

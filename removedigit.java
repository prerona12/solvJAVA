// remove the digit in string

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        List<Character> digits = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');
        StringBuilder res = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (!digits.contains(c)) {
                res.append(c);
            }
        }
        
        System.out.println(res.toString());
        scanner.close();
    }
}

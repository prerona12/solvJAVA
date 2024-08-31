//removal of vowels in string 

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        String res = "";
        for (char c : input.toCharArray()) {
            if (!vowels.contains(c)) {
                res = res + c;
            }
        }
        System.out.println(res);
    }
}

//change the first and last character into capital letter
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (input == null || input.isEmpty()) {
            System.out.println(input);
            return; 
        }

        char[] chars = input.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i++) {
            
            if (i == 0 || chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }

            
            if (i == n - 1 || chars[i + 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        String result = new String(chars);
        System.out.println("Result: " + result);
        scanner.close();
    }
}

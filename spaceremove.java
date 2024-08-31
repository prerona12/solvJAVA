//removal of space in strings

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String p = input.replace(" ", "");
        System.out.println(p);
    }
}

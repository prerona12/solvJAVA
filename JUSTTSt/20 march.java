
//sum of all prime number in the given range 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int last = input.nextInt();
        int sum = 0;

        for (int i = 2; i <= last; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    // Helper method to check for primality
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}




// another DAG GRAGH PAPER WHICH IS VERY HARD I DIDN'Y TRY THAT OUT 

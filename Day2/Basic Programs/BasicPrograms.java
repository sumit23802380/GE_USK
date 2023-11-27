import java.util.Scanner;

/*
 * Basic Programs
 */
public class BasicPrograms {
    public static void palindromNumber() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String numberString = Integer.toString(number);
        int lengthOfNumberString = numberString.length();
        int l = 0, r = lengthOfNumberString - 1;
        boolean isPalindrome = true;
        while (l < r) {
            if (numberString.charAt(l) == numberString.charAt(r)) {
                l++;
                r--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome == true) {
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Give number is not palindrome");
        }
        sc.close();
    }

    public static void checkIsPrime() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println("Give number is prime");
        } else {
            System.out.println("Given number is not prime");
        }
        sc.close();
    }

    public static void fibonacciSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number of sequence we want to");
        int n = sc.nextInt();
        int fib[] = new int[n + 2];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        sc.close();
    }

    public static void main(String[] args) {
        fibonacciSeries();
    }
}
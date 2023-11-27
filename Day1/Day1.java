import java.util.Scanner;

class Day1 {
	public static void flipCoin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times you want to flip the coin :");
		int numberOfTimesFlipCoin = sc.nextInt();
		if (numberOfTimesFlipCoin <= 0) {
			System.out.println("Please Enter the Positive Number");
			flipCoin();
		}
		int headCount = 0;
		int tailCount = 0;
		for (int i = 1; i <= numberOfTimesFlipCoin; i++) {
			double randomValue = Math.random();
			if (randomValue < 0.5) {
				tailCount++;
			} else {
				headCount++;
			}
		}
		System.out.println("Tail Count :" + tailCount);
		System.out.println("Head Count :" + headCount);
		System.out.println("Tail Percentage :" + ((tailCount * 1.000) / numberOfTimesFlipCoin) * 100);
		System.out.println("Tail Percentage :" + ((headCount * 1.000) / numberOfTimesFlipCoin) * 100);
		sc.close();
	}
	public static void leapYear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year :");
		int year = sc.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0)) {
			System.out.println("It is Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}
		sc.close();
	}
	public static void powerOfTwo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the which power of two want to get :");
		int n = sc.nextInt();
		if (n >= 31) {
			System.out.println("Please enter n less than 32");
			powerOfTwo();
		}
		int value = 1 << n;
		System.out.println("Power of two 2^" + n + " is :" + value);
		sc.close();
	}
	public static void nThHarmonicNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the which nth harmonic number to get :");
		int n = sc.nextInt();
		if (n == 0) {
			System.out.println("Please do not enter n = 0");
			nThHarmonicNumber();
		}

		double ans = 0.00;
		for (int i = 1; i <= n; i++) {
			ans += (1.00 / i);
		}
		System.out.println("nThHarmonicNumber is :" + ans);
		sc.close();
	}
	public static void factors() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of which you want to get all the factors :");
		int n = sc.nextInt();
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
	public static void computeQuotientAndRemainder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dividend ");
		int n = sc.nextInt();
		System.out.println("Enter divisor ");
		int m = sc.nextInt();
		int quotient = n / m;
		int remainder = n % m;
		System.out.println("Quotient is " + quotient + "Remainder " + remainder);
		sc.close();
	}
	public static void swapTwoNumbers() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		sc.close();
	}
	public static void checkEvenOdd() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
		sc.close();
	}
	public static void checkVowelOrConsonant() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c = s.charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("It is vowel");
		} else {
			System.out.println("It is consonant");
		}
		sc.close();
	}
	public static void maxAmongThree() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Max among three is " + Math.max(a , Math.max(b, c)));
		sc.close();
	}
	public static void main(String [] args) {
		flipCoin();
		// leapYear();
		// powerOfTwo();
		// nThHarmonicNumber();
		// factors();
		// computeQuotientAndRemainder();
		// swapTwoNumbers();
		// checkEvenOdd();
		// checkVowelOrConsonant();
		// maxAmongThree();
	}
}

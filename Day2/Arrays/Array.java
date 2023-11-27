import java.util.Scanner;

public class Array {
    public static void printLargestElement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want to enter");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        System.out.println("Max element in array is :" + maxElement);
        sc.close();
    }

    public static void printSecondLargest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int secondMaxElement = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxElement) {
                secondMaxElement = maxElement;
                maxElement = arr[i];
            } else if (arr[i] > secondMaxElement) {
                secondMaxElement = arr[i];
            }
        }
        System.out.println("Second max element in array is " + secondMaxElement);
        sc.close();
    }

    public static void checkLeftandRightHalfSum() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int leftHalfSum = 0;
        int rightHalfSum = 0;
        for (int i = 0; i < n; i++) {
            if (i < (n / 2)) {
                leftHalfSum += arr[i];
            } else {
                rightHalfSum += arr[i];
            }
        }
        if (leftHalfSum == rightHalfSum) {
            System.out.println("Left half sum and right half sum are equal");
        } else {
            System.out.println("Left Half Sum and right half sum are not equal");
        }
        sc.close();
    }

    public static void main(String[] args) {

    }
}
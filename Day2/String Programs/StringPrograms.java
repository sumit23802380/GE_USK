import java.util.Scanner;

/**
 * StringPrograms
 */
public class StringPrograms {
    public static void reverseString() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
            l++;
            r--;
        }
        s = new String(charArray);
        System.out.println(s);
        sc.close();
    }

    public static void checkAnagram() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean isAnagram = true;
        if (s.length() != t.length()) {
            isAnagram = false;
        } else {
            int count[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
            }
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }
        if (isAnagram == true) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        sc.close();
    }

    public static void main(String[] args) {
        checkAnagram();
    }
}
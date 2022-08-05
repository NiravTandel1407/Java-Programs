// How to reverse a String in java?

import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String str) {
        String revString = "";
        for (int i = 0; i < str.length(); i++) {
            revString = str.charAt(i) + revString;
        }
        return revString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        sc.close();
        String revString = reverseString(str);
        System.out.println("Reverse : " + revString);
    }
}

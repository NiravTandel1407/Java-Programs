// How to reverse a String in java?

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter String : ");
        String str = sc.nextLine();
        System.out.println(str.length());
        sc.close();
        String revString = "";
        for (int i = 0; i < str.length(); i++) {
            revString = str.charAt(i) + revString;
        }
        System.out.println("Reverse : " + revString);
    }
}
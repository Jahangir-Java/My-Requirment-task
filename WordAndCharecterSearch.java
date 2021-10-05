package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class WordAndCharecterSearch {

    public static void main(String[] args) {
        // find words
        Scanner x = new Scanner(System.in);

        // String s = "Bangladesh is a small but beautiful country Bangladesh is south east Asian country";
        System.out.println("enter a sengence ");
        String s = x.nextLine();

        String[] ar = s.split(" ");
        ArrayList a = new ArrayList();

        for (int i = 0; i < ar.length; i++) {
            if (ar[i].equalsIgnoreCase("is")) {
                a.add(i);
            }

        }
        System.out.println("'is' print " + a.size() + " times and indes position is: " + a);
        System.out.println("total words : " + ar.length);

        // finds charecter
        System.out.println("enter upper case charecter: ");
        char c = x.next().charAt(0);
        System.out.println("enter loyer case charecter: ");
        char c1 = x.next().charAt(0);

        char[] arr = s.toCharArray();

        ArrayList a1 = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c || arr[i] == c1) {
                a1.add(i);
            }

        }
        System.out.println(c1 + " print " + a1.size() + " times and indes position is: " + a1);
        System.out.println("total charecter : " + arr.length);
    }

}

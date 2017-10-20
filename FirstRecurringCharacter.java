/**
 * Created by HaMi on 2017-09-28.
 * This program prints the first recurring character in a given string
 * Solving this by using a HashTable to keep track of what characters have been seen
 * This way we only traverse the string once giving this program a runtime of O(n)
 */

import java.util.Hashtable;

public class FirstRecurringCharacter {
    public static void main(String[] args) {
        String a = "DBCABA";
        String b = "abcab";
        String c = "acbdef";

        System.out.print("The first recurring character in " + a + " is: ");
        firstRecurring(a);

        System.out.print("The first recurring character in " + b + " is: ");
        firstRecurring(b);

        System.out.print("The first recurring character in " + c + " is: ");
        firstRecurring(c);
    }

    public static void firstRecurring(String s) {
        Hashtable<Character, Integer> letters = new Hashtable<>();
        for (char c : s.toCharArray()) {
            // if we have not seen the character yet, we put it in the hash table
            if (!letters.containsKey(c)) {
                letters.put(c, 1);
                // if we have already seen this character, we will print it
            } else {
                System.out.println(c);
                return;
            }
        }
        System.out.println("there are no recurring characters in the string");
    }
}

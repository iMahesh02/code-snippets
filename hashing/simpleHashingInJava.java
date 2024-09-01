package hashing;

import java.util.Hashtable;

public class simpleHashingInJava {

    public static void main (String[] args) {

        // create a HashTable to store
        // String values corresponding to integer keys
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

        // input the values
        hm.put(1, "apple");
        hm.put(2, "pineapple");
        hm.put(4, "potato");

        System.out.print(hm + "\n");

        int maks = 0x000F;
        int value = 0x2222;
        System.out.println(value & maks);

        String[] b = "{}()".split(",");
        System.out.print(b[0]);
    }
}

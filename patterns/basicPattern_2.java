package patterns;

public class basicPattern_2 {

    public static void main (String[] args) {

        /* write a program to print below pattern
         *              $
         *            $ $
         *         $ $ $
         * */

        for (int i=1; i<=5; i++) {
            for (int j=1; j<=5; j++) {
               if (j >= 6-i) {
                   System.out.print("$");
               } else {
                   System.out.print(" ");
               }
            }
            /* change the row */
            System.out.print("\n");
        }
    }
}

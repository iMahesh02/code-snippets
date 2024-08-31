package patterns;

public class basicPattern_8 {

    public static void main (String[] args) {

//        $
//        $$
//        $$$
//        $$$$
//        $$$
//        $$
//        $

        int k = 0;
        for (int i=1; i<=5; i++) {
            /* k changes as i value progresses */
            if (i <= 3) {
                k++;
            } else {
                k --;
            }
            for (int j=1; j<=5; j++) {
                if (j <= k) {
                    System.out.print("$");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

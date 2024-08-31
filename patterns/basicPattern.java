package patterns;

public class basicPattern {

    public static void main (String[] args) {

        /* print n no. of rows */
        for (int i=0; i<3; i++) {

            /* below block can print one line ---> i.e. print n no of cols */
            for (int j=0; j<5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

}

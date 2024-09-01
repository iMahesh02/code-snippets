package arrays;

public class circularArray {

    public static void print(char a[], int n, int ind) {

        // create an auxiliary array
        char[] b = new char[(2 * n)];

        // copy a[] to b[]
        for (int i=0; i<n; i++) {
            b[i] = a[i];
            b[i+n] = a[i];
        }

        // print from ind-th index to (n+i)th index
        for (int i=ind; i<n+ind; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.print("\n");
    }

    public static void efficientPrint (char a[], int n, int ind) {
        for (int i=ind; i<n + ind; i++) {
            System.out.print(a[(i % n)]);
        }
        System.out.print("\n");
    }

    public static void main (String[] args) {
        char[] a = new char[]{'A', 'B', 'C', 'D'};

        int n = a.length;

        // print(a, n, 3);
        efficientPrint(a, n, 2);
    }
}

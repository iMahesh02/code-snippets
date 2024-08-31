public class towerOFHanoiAlgo {

    public static void main(String[] args) {
        System.out.println("Test is working !");

       // n = no. of discs
        towerOFHanoi(3, 'A', 'B', 'C');
    }

    public static void towerOFHanoi (int n, char src, char aux, char dest) {

        if (n==1) {
            System.out.println(src + " -> " + dest);
            return ;
        }

        towerOFHanoi(n-1, src, dest, aux);
        towerOFHanoi(1, src, aux, dest);
        towerOFHanoi(n-1, aux, src, dest);
    }
}

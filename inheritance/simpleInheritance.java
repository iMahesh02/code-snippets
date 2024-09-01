package inheritance;

import java.util.*;

public class simpleInheritance {
    public static void main(String[] args ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int breadth = sc.nextInt();

        Rectangle r = new Rectangle(length, breadth);
        r.area();
        sc.close();
    }

}

class Shape {
    public int length;
    public int breadth;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.print(this.length + " " + this.breadth);
    }
}

class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void area() {
        System.out.println(length + " " + breadth);
        System.out.print(length*breadth);
    }

}
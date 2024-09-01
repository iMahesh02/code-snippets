package inheritance;



import java.util.*;
import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.


// sample input
//  {}()   ----> true
//  ({()})  ----> true
//  {}(    ------> false

class Parser{
    static String isBalanced(String s)
    {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (c == '{' || c == '(') {
                stack.push(c);
            }

            /*
             *  if the stack is empty or the top of the stack doesn't match the closing bracket,
             *  return false;
             * */
            else if (c == '}' || c == ')') {
                if (stack.isEmpty()) {
                    return "false";
                }

                char top = stack.pop();
                if ((c == '}' && top != '{') || (c==')' && top != '(')) {
                    return "false";
                }
            }
        }

        /*
        *  if the stack is empty, all brackets were matched, otherwise the string in un-matched
        * */
        if (stack.isEmpty()) {
            return "true";
        } else {
            return "false";
        }
    }

}

class javaBraces {

    public static void main(String[] args) {
        Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }
        in.close();
    }
}


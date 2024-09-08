package contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class minimize {

    public static void main (String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

//        List<Integer> ans = new ArrayList<>();
        for (int i=0; i<n; i++) {
            String[] multipleInput = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(multipleInput[0]);
            int b = Integer.parseInt(multipleInput[1]);
//             ans.add((b-a));
            System.out.println(b - a);
        }

//        for (Integer an : ans) {
//            System.out.println(an);
//        }
    }
}

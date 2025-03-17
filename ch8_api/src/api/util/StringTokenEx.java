package api.util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {
        String str = "this is a test";
        StringTokenizer st = new StringTokenizer(str);

        // split()
        System.out.println(Arrays.toString(str.split(" ")));

        // StringTokenizer : String
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        str = "this/is/a/test";
        st = new StringTokenizer(str, "/");
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        String expression = "x=100*(200-300)/2";
        st = new StringTokenizer(expression, "+-*/=()", true);
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        String source = "1,김천재,100,100,100|2,박수재,95,88,90|3,이자바,80,70,85";
        st = new StringTokenizer(source, "|");
        while (st.hasMoreTokens()) {
            String token = st.nextToken(); // 1,김천재,100,100,100
            StringTokenizer st2 = new StringTokenizer(token, ",");
            // System.out.println(token);
            while (st2.hasMoreTokens()) {
                System.out.println(st2.nextToken());
            }

            System.out.println("-----------------");
        }

    }
}

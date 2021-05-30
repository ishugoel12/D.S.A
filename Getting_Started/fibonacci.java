// print fibonacci series till n terms

import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n <= 0)
        {
            scn.close();
            return;
        }
        int a = 0, b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        scn.close();
    }
}
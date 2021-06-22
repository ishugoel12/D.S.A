/*
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1	
*/

import java.util.*;
public class p11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int c = 1;
        for (int i = 0; i < n; i++) {
            c = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(c + "\t");
                c = c * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
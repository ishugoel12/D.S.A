/*
1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1
*/

import java.util.*;
public class p13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int c = 1, st = 1, sp = 2 * n - 3;
        for (int i = 0; i < n; i++) {
            c = 1;
            for (int j = 0; j < st; j++) {
                System.out.print(c++ + "\t");
            }
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < st; j++) {
                if (c == n + 1) {
                    c--;
                    j++;
                }
                System.out.print(--c + "\t");
            }
            st++;
            sp -= 2;
            System.out.println();
        }
    }
}
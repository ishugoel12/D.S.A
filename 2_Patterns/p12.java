/*
		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	
*/

import java.util.*;
public class p12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int sp = n / 2;
        int st = 1;
        int extc = 1;
        int intc;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            intc = extc;
            for (int j = 0; j < st; j++) {
                System.out.print(intc + "\t");
                if (j < st / 2)
                    intc++;
                else
                    intc--;
            }
            if (i < n / 2) {
                sp--;
                st += 2;
                extc++;
            } else {
                sp++;
                st -= 2;
                extc--;
            }
            System.out.println();
        }
    }
}
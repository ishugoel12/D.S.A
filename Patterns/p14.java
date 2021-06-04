/*
*	*	*	*	*	*	*	
	*				*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*	
*/

import java.util.*;

public class p14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int sp = 0, st = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < st; j++) {
                if (i < n / 2) {
                    if (i == 0)
                        System.out.print("*\t");
                    else if (j == 0 || j == st - 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                } else
                    System.out.print("*\t");
            }
            if (i < n / 2) {
                sp++;
                st -= 2;
            } else {
                sp--;
                st += 2;
            }
            System.out.println();
        }
    }
}
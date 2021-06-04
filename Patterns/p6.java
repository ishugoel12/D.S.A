/*
*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	
*/

import java.util.*;
public class p6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int st = n / 2 + 1, sp = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }
            if (i < n / 2) {
                st--;
                sp += 2;
            } else {
                sp -= 2;
                st++;
            }
            System.out.println();
        }
    }
}
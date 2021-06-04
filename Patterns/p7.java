/*
*	
	*	
		*	
			*	
				*	
********************
				*	
			*		
		*			
	*				
*
*/

import java.util.*;
public class p7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i)
                    System.out.print("*");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("************************************");
        int sp = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            sp--;
            System.out.println("*");
        }
    }
}
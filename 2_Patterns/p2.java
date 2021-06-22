/*
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*
*/
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

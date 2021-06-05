/*
[10, 20, 30] =>
10	
10	20	
10	20	30	
20	
20	30	
30	
*/

import java.util.*;

public class allSubarrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        scn.close();
        for (int i = 0; i < n; i++) {
            for (int k = i; k < n; k++) {
                for (int j = i; j <= k; j++) {
                    System.out.print(arr[j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
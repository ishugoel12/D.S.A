import java.util.*;
public class barchart {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int m = max;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == max || arr[i] > max)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            max--;
            System.out.println();
        }
    }

}
import java.util.*;

public class binarySearch {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        scn.close();
        int l = 0, r = arr.length - 1, m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (arr[m] == d) {
                System.out.print(m);
                return;
            }
            if (arr[m] < d)
                l = m + 1;
            else
                r = m - 1;
        }
        System.out.print("-1");
    }
}
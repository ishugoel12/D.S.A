import java.util.*;

public class ceilFloorBsearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int d = scn.nextInt();
        scn.close();

        int ceil = -1, floor = -1, l = 0, r = arr.length - 1, m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (arr[m] == d) {
                System.out.println(arr[m]);
                System.out.println(arr[m]);
                return;
            }
            if (arr[m] > d) {
                ceil = m;
                r = m - 1;
            } else {
                floor = m;
                l = m + 1;
            }
        }
        System.out.println(arr[ceil]);
        System.out.println(arr[floor]);
    }
}
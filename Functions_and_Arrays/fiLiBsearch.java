import java.util.*;

public class fiLiBsearch {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int d = scn.nextInt();
        scn.close();
        int fi = -1, l = 0, r = arr.length - 1, m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (arr[m] == d) {
                fi = m;
                r = m - 1;
            } else if (arr[m] > d) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        int li = -1;
        l = 0;
        r = arr.length - 1;
        m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (arr[m] == d) {
                li = m;
                l = m + 1;
            } else if (arr[m] > d) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        System.out.println(fi);
        System.out.println(li);
    }
}
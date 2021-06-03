import java.util.*;

public class differenceArrays {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }
        scn.close();
        int[] ans = new int[Math.max(n1, n2)];
        // a2-a1
        int i = arr1.length - 1, j = arr2.length - 1, k = ans.length - 1, c = 0;
        while (i >= 0) {
            int d = arr2[j--] - arr1[i--] - c;
            if (d < 0) {
                c = 1;
                d += 10;
            } else {
                c = 0;
            }
            ans[k--] = d;
        }
        while (j >= 0) {
            int d = arr2[j--] - c;
            if (d < 0) {
                c = 1;
                d += 10;
            } else {
                c = 0;
            }
            ans[k--] = d;
        }
        for (i = 0; i < ans.length; i++) {
            if (i == 0 && ans[i] == 0) {
            } else
                System.out.println(ans[i]);
        }
    }
}

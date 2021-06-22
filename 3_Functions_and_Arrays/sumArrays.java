import java.util.*;

public class sumArrays {
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
        int[] ans = new int[Math.max(n1, n2) + 1];
        int i = arr1.length - 1, j = arr2.length - 1, k = ans.length - 1, c = 0;
        while (i >= 0 && j >= 0) {
            int d = arr1[i--] + arr2[j--] + c;
            c = d / 10;
            int r = d % 10;
            ans[k--] = r;
        }
        while (i >= 0) {
            int d = arr1[i--] + c;
            c = d / 10;
            int r = d % 10;
            ans[k--] = r;
        }
        while (j >= 0) {
            int d = arr2[j--] + c;
            c = d / 10;
            int r = d % 10;
            ans[k--] = r;
        }
        for (i = 0; i < ans.length; i++) {
            if (i == 0 && ans[i] == 0) {
            } else
                System.out.println(ans[i]);
        }
    }
}
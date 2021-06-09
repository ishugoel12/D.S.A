// import java.util.*;
import java.io.*;

public class allIndices {
    public static int[] allIndicesfunc(int[] arr, int data, int idx, int fsf) {
        if (idx == arr.length) {
            int[] ans = new int[fsf];
            return ans;
        }
        if (arr[idx] == data)
            fsf++;
        int[] ans = allIndicesfunc(arr, data, idx + 1, fsf);
        if (arr[idx] == data)
            ans[--fsf] = idx;
        return ans;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndicesfunc(arr, x, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }
}
import java.util.*;
public class rotateArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int k = scn.nextInt();
        scn.close();
        k = k % n;
        if (k < 0)
            k = n + k;

        swap(0, n - 1, arr);
        swap(0, k - 1, arr);
        swap(k, n - 1, arr);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void swap(int s, int e, int[] arr) {
        int c = (e - s + 1) / 2;
        for (int i = 0; i < c; i++) {
            int t = arr[s];
            arr[s++] = arr[e - i];
            arr[e - i] = t;
        }
    }
}
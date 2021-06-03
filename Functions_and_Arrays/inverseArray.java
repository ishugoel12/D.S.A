import java.util.*;
public class inverseArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        scn.close();
        int[] res = inverse(arr);
        for (int i = 0; i < n; i++)
            System.out.print(res[i] + " ");
    }

    public static int[] inverse(int[] a) {
        int[] arr = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--)
            arr[a[i]] = i;
        return arr;
    }
}
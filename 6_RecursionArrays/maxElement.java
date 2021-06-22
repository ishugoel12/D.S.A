import java.util.*;

public class maxElement {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print(maxOfArray(arr, 0));
        scn.close();
    }

    public static int maxOfArray(int[] arr, int idx) {
        if (idx == arr.length)
            return -1;
        int max = maxOfArray(arr, idx + 1);
        if (max > arr[idx])
            return max;
        return arr[idx];
    }
}
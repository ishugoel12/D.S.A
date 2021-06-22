import java.util.*;

public class lastIdx {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int data = scn.nextInt();
        System.out.println(lastIndex(arr, arr.length - 1, data));
        scn.close();
    }

    public static int lastIndex(int[] arr, int idx, int data) {
        if (idx == -1)
            return -1;
        if (arr[idx] == data)
            return idx;
        return lastIndex(arr, idx - 1, data);
    }
}
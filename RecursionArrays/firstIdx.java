import java.util.*;

public class firstIdx {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        System.out.println(firstIndex(arr, 0, data));
        scn.close();
    }

    public static int firstIndex(int[] arr, int idx, int data) {
        if (idx == arr.length)
            return -1;
        if (arr[idx] == data)
            return idx;
        return firstIndex(arr, idx + 1, data);
    }

}
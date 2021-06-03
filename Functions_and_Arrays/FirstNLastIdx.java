import java.util.*;

public class FirstNLastIdx {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int d = scn.nextInt();
        scn.close();
        int i = 0, fi = 0, li = 0;
        boolean flag = false;
        for (i = 0; i < n; i++) {
            if (d == arr[i]) {
                fi = i;
                flag = true;
                break;
            }
        }
        if (flag == false) {
            fi = -1;
            li = -1;
        } else {
            for (; i < arr.length; i++) {
                if (arr[i] == d && arr[i + 1] != d) {
                    li = i;
                    break;
                }
            }
        }
        System.out.print(fi + "\n" + li);
    }
}
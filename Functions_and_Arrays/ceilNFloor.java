import java.util.*;

public class ceilNFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int d = scn.nextInt();
        scn.close();
        int ceil = -1, floor = -1, i;
        for (i = 0; i < n; i++) {
            if (arr[i] == d) {
                ceil = floor = i;
                break;
            } else if (arr[i] < d)
                ceil = floor = i;
            else // arr[i] > d
            {
                if (floor == -1)
                    ceil = floor = i;
                else
                    ceil = i;
                break;
            }
        }
        System.out.println(arr[ceil]);
        System.out.println(arr[floor]);
    }
}
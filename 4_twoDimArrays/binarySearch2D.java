import java.util.*;

public class binarySearch2D {
        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                int[][] arr = new int[n][n];
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                                arr[i][j] = scn.nextInt();
                        }
                }
                int data = scn.nextInt();
                scn.close();
                int i = 0;
                int j = n - 1;
                while (i >= 0 && i < n && j >= 0 && j < n) {
                        if (arr[i][j] == data) {
                                System.out.println(i);
                                System.out.println(j);
                                return;
                        }
                        if (data > arr[i][j]) {
                                i++;
                        } else
                                j--;
                }
                System.out.println("Not Found");
        }
}
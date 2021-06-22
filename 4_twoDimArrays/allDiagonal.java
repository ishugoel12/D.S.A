import java.util.*;

public class allDiagonal {
        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                int[][] a = new int[n][n];
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                                a[i][j] = scn.nextInt();
                        }
                }
                scn.close();
                for (int i = 0; i < (2 * n - 1); i++) {
                        if (i >= n - 1)// 3
                        {
                                for (int j = 0; j < 2 * n - 1 - i; j++) {
                                        System.out.println(a[j][i - n + 1 + j]);
                                }
                        } else {
                                for (int j = 0; j < i + 1; j++) {
                                        System.out.println(a[n - 1 - i + j][j]);
                                }
                        }
                }
        }

}
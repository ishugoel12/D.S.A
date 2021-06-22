import java.util.*;

public class exitPoint {
        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                int m = scn.nextInt();
                int[][] a = new int[n][m];
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                                a[i][j] = scn.nextInt();
                        }
                }
                scn.close();
                int row = 0, col = 0;
                while (row < n && col < m) {
                        while (row < n && col < m && a[row][col] == 0)
                                col++;
                        if (row >= n || col >= m) {
                                col--;
                                break;
                        }

                        row++;
                        while (row < n && col < m && a[row][col] == 0)
                                row++;
                        if (row >= n || col >= m) {
                                row--;
                                break;
                        }

                        col--;
                        while (row < n && col < m && a[row][col] == 0)
                                col--;
                        if (row >= n || col >= m) {
                                col++;
                                break;
                        }

                        row--;
                        while (row < n && col < m && a[row][col] == 0)
                                row--;
                        if (row >= n || col >= m) {
                                row++;
                                break;
                        }

                        col++;
                }
                System.out.println(row);
                System.out.println(col);
        }
}
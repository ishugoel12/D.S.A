import java.util.*;

public class exitPointii
{
        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                int m = scn.nextInt();
                int[][] arr = new int[n][m];
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                                arr[i][j] = scn.nextInt();
                        }
                }
                scn.close();
                int i = 0, j = 0, dir = 0;
                while (i >= 0 && i < n && j >= 0 && j < m) {
                        dir += arr[i][j];
                        if (dir % 4 == 0) {
                                j++;
                        } else if (dir % 4 == 1) {
                                i++;
                        } else if (dir % 4 == 2) {
                                j--;
                        } else {
                                i--;
                        }
                }
                if (i < 0) {
                        System.out.println(0);
                        System.out.println(j);
                } else if (i == n) {
                        System.out.println(n - 1);
                        System.out.println(j);
                } else if (j < 0) {
                        System.out.println(i);
                        System.out.println(0);
                } else if (j == m) {
                        System.out.println(i);
                        System.out.println(m - 1);
                }
        }
}
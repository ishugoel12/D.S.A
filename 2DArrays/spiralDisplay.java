import java.util.*;

public class spiralDisplay {
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
        int sr = 0, sc = 0, er = n - 1, ec = m - 1, c = 0;
        while (c < n * m) {
            for (int i = sr; i <= er; i++) {
                System.out.println(arr[i][sc]);
                c++;
            }
            sc++;
            if (c < n * m) {
                for (int i = sc; i <= ec; i++) {
                    System.out.println(arr[er][i]);
                    c++;
                }
            }
            er--;
            if (c < n * m) {
                for (int i = er; i >= sr; i--) {
                    System.out.println(arr[i][ec]);
                    c++;
                }
            }
            ec--;
            if (c < n * m) {
                for (int i = ec; i >= sc; i--) {
                    System.out.println(arr[sr][i]);
                    c++;
                }
            }
            sr++;
        }
    }
}
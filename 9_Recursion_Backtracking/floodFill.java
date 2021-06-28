import java.util.*;

public class floodFill {

        public static void main(String[] args) {
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
                boolean[][] mark = new boolean[n][m];
                floodfillfunc(arr, 0, 0, "", mark);
        }

        public static void floodfillfunc(int[][] arr, int sr, int sc, String asf, boolean[][] mark) {
                if (sr < 0 || sc < 0 || sr >= arr.length || sc >= arr[0].length || arr[sr][sc] == 1
                                || mark[sr][sc] == true)
                        return;

                if (sr == arr.length - 1 && sc == arr[0].length - 1) {
                        System.out.println(asf);
                        return;
                }

                mark[sr][sc] = true;
                floodfillfunc(arr, sr - 1, sc, asf + "t", mark);
                floodfillfunc(arr, sr, sc - 1, asf + "l", mark);
                floodfillfunc(arr, sr + 1, sc, asf + "d", mark);
                floodfillfunc(arr, sr, sc + 1, asf + "r", mark);
                mark[sr][sc] = false;
        }
}

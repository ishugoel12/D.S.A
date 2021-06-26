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
                floodfill(arr, 0, 0, "", mark);
        }

        public static void floodfill(int[][] arr, int sr, int sc, String asf, boolean[][] mark) {
                if (sr < 0 || sc < 0 || sr >= arr.length || sc >= arr[0].length || arr[sr][sc] == 1
                                || mark[sr][sc] == true)
                        return;

                if (sr == arr.length - 1 && sc == arr[0].length - 1) {
                        System.out.println(asf);
                        return;
                }

                mark[sr][sc] = true;
                floodfill(arr, sr - 1, sc, asf + "t", mark);
                floodfill(arr, sr, sc - 1, asf + "l", mark);
                floodfill(arr, sr + 1, sc, asf + "d", mark);
                floodfill(arr, sr, sc + 1, asf + "r", mark);
                mark[sr][sc] = false;
        }
}

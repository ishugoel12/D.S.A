import java.util.*;

public class printMazeJumpPaths {
        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                int m = scn.nextInt();
                scn.close();
                printMazePaths(0, 0, n - 1, m - 1, "");
        }

        public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
                if (sr == dr && sc == dc) {
                        System.out.println(psf);
                        return;
                }
                if (sr > dr || sc > dc)
                        return;
                int horizontals = dc - sc;
                int verticals = dr - sr;
                for (int i = 1; i <= horizontals; i++) {
                        printMazePaths(sr, sc + i, dr, dc, psf + "h" + i);
                }
                for (int i = 1; i <= verticals; i++) {
                        printMazePaths(sr + i, sc, dr, dc, psf + "v" + i);
                }
                int diagonals = Math.min(dc - sc, dr - sr);
                for (int i = 1; i <= diagonals; i++) {
                        printMazePaths(sr + i, sc + i, dr, dc, psf + "d" + i);
                }
        }
}
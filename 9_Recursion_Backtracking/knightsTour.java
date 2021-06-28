import java.util.*;

public class knightsTour {

        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                int i = scn.nextInt();
                int j = scn.nextInt();
                scn.close();
                int[][] arr = new int[n][n];
                printKnightsTour(arr, i, j, 1);
        }

        public static void printKnightsTour(int[][] arr, int r, int c, int count) {
                if (r < 0 || c < 0 || r >= arr.length || c >= arr.length || arr[r][c] != 0)
                        return;
                if (count == arr.length * arr.length) {
                        arr[r][c] = count;
                        displayBoard(arr);
                        arr[r][c] = 0;
                        return;
                }

                arr[r][c] = count;
                printKnightsTour(arr, r - 2, c + 1, count + 1);
                printKnightsTour(arr, r - 1, c + 2, count + 1);
                printKnightsTour(arr, r + 1, c + 2, count + 1);
                printKnightsTour(arr, r + 2, c + 1, count + 1);
                printKnightsTour(arr, r + 2, c - 1, count + 1);
                printKnightsTour(arr, r + 1, c - 2, count + 1);
                printKnightsTour(arr, r - 1, c - 2, count + 1);
                printKnightsTour(arr, r - 2, c - 1, count + 1);
                arr[r][c] = 0;
        }

        public static void displayBoard(int[][] chess) {
                for (int i = 0; i < chess.length; i++) {
                        for (int j = 0; j < chess[0].length; j++) {
                                System.out.print(chess[i][j] + " ");
                        }
                        System.out.println();
                }
                System.out.println();
        }
}
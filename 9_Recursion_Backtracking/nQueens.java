// package 9_Recursion_Backtracking;
import java.util.*;

public class nQueens {

        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                scn.close();
                boolean[][] arr = new boolean[n][n];
                printNQueens(arr, "", 0);
        }

        public static void printNQueens(boolean[][] arr, String qsf, int row) {
                if (row == arr.length) { // all rows traversed
                        System.out.println(qsf + ".");
                        return;
                }
                for (int i = 0; i < arr.length; i++) // columns
                {
                        if (queenSafe(row, i, arr) == true) {
                                arr[row][i] = true; // place queen
                                printNQueens(arr, qsf + row + "-" + i + ", ", row + 1); // place in next row
                                arr[row][i] = false; // unplace queen
                        }
                }
        }

        public static boolean queenSafe(int r, int c, boolean[][] arr) {
                // check column
                for (int i = 0; i < r; i++) {
                        if (arr[i][c] == true) {
                                return false;
                        }
                }
                // check left diagonal
                for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
                        if (arr[i][j] == true) {
                                return false;
                        }
                }
                // check right diagonal
                for (int i = r - 1, j = c + 1; i >= 0 && j < arr.length; i--, j++) {
                        if (arr[i][j] == true) {
                                return false;
                        }
                }
                return true;
        }
}
import java.util.*;

public class rotateMatrixBy90 {
        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                int[][] arr = new int[n][n];
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                                arr[i][j] = scn.nextInt();
                        }
                }
                scn.close();
                transpose(arr);
                rotate(arr);
                display(arr);
        }

        public static void rotate(int[][] arr) {
                int n = arr.length;
                for (int j = 0; j < n / 2; j++) {
                        for (int i = 0; i < n; i++) {
                                int t = arr[i][j];
                                arr[i][j] = arr[i][n - 1 - j];
                                arr[i][n - 1 - j] = t;
                        }
                }
        }

        public static void transpose(int[][] arr) {
                int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                                int t = arr[i][j];
                                arr[i][j] = arr[j][i];
                                arr[j][i] = t;
                        }
                }
        }

        public static void display(int[][] arr) {
                for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++)
                                System.out.print(arr[i][j] + " ");
                        System.out.println();
                }
        }
}
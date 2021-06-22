import java.util.*;

public class ringRotate {
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
                int ring = scn.nextInt();
                int rotation = scn.nextInt();
                scn.close();
                int rmin = 0 + ring - 1, rmax = n - ring, cmin = 0 + ring - 1, cmax = m - ring;
                int tEle = (cmax - cmin + 1) * 2 + (rmax - rmin - 1) * 2;
                rotation = rotation % tEle;
                if (rotation < 0)
                        rotation += tEle;
                int[] arr = new int[tEle];
                int c = 0;
                for (int i = rmin; i <= rmax; i++)
                        arr[c++] = a[i][cmin];
                cmin++;
                for (int i = cmin; i <= cmax; i++)
                        arr[c++] = a[rmax][i];
                rmax--;
                for (int i = rmax; i >= rmin; i--)
                        arr[c++] = a[i][cmax];
                cmax--;
                for (int i = cmax; i >= cmin; i--)
                        arr[c++] = a[rmin][i];
                rmin++;
                reverse(arr, 0, arr.length - 1);
                reverse(arr, 0, rotation - 1);
                reverse(arr, rotation, arr.length - 1);
                rmin = 0 + ring - 1;
                cmin = 0 + ring - 1;
                rmax = n - ring;
                cmax = m - ring;
                c = 0;
                for (int i = rmin; i <= rmax; i++)
                        a[i][cmin] = arr[c++];
                cmin++;
                for (int i = cmin; i <= cmax; i++)
                        a[rmax][i] = arr[c++];
                rmax--;
                for (int i = rmax; i >= rmin; i--)
                        a[i][cmax] = arr[c++];
                cmax--;
                for (int i = cmax; i >= cmin; i--)
                        a[rmin][i] = arr[c++];
                rmin++;
                display(a);
        }

        public static void reverse(int[] arr, int i, int j) {
                while (i < j) {
                        int t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                        i++;
                        j--;
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
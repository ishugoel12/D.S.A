// 3 3 ==>  [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]

import java.util.*;

public class mazePath
{
        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                int m = scn.nextInt();
                scn.close();
                ArrayList<String> al = getMazePaths(0, 0, n - 1, m - 1);
                System.out.print(al);
        }

        // sr - source row, sc - source column
        // dr - destination row, dc - destination column
        public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
                if (sr == dr && sc == dc) {
                        ArrayList<String> ma = new ArrayList<>();
                        ma.add("");
                        return ma;
                }
                if (sr > dr || sc > dc) {
                        ArrayList<String> ma = new ArrayList<>();
                        return ma;
                }
                ArrayList<String> al1 = getMazePaths(sr, sc + 1, dr, dc);
                ArrayList<String> al2 = getMazePaths(sr + 1, sc, dr, dc);
                ArrayList<String> ma = new ArrayList<>();
                for (int i = 0; i < al1.size(); i++) {
                        ma.add("h" + al1.get(i));
                }
                for (int i = 0; i < al2.size(); i++) {
                        ma.add("v" + al2.get(i));
                }
                return ma;
        }
}
// In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or 
// more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
// 2,2 ==> [h1v1, v1h1, d1]

import java.util.*;

public class mazePathJumps {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();
        ArrayList<String> al = getMazePaths(0, 0, n - 1, m - 1);
        System.out.print(al);
    }

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

        int horizontals = dc - sc;
        int verticals = dr - sr;
        ArrayList<String> ma = new ArrayList<>();

        // HORIZONTALS
        for (int i = 1; i <= horizontals; i++) {
            ArrayList<String> al1 = getMazePaths(sr, sc + i, dr, dc);
            for (int j = 0; j < al1.size(); j++)
                ma.add("h" + i + al1.get(j));
        }

        // VERTICALS
        for (int i = 1; i <= verticals; i++) {
            ArrayList<String> al2 = getMazePaths(sr + i, sc, dr, dc);
            for (int j = 0; j < al2.size(); j++)
                ma.add("v" + i + al2.get(j));
        }

        // DIAGONALS
        int diagonals = Math.min(dr - sr, dc - sc);
        for (int i = 1; i <= diagonals; i++) {
            ArrayList<String> al3 = getMazePaths(sr + i, sc + i, dr, dc);
            for (int j = 0; j < al3.size(); j++)
                ma.add("d" + i + al3.get(j));
        }
        return ma;
    }
}
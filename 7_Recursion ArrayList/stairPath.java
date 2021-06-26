/*
You are allowed to climb 1 step, 2 steps or 3 steps in one move.
 3 ==> [111, 12, 21, 3]
*/

import java.util.*;
public class stairPath
{
        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                scn.close();
                ArrayList<String> al = getStairPaths(n);
                System.out.print(al);
        }

        public static ArrayList<String> getStairPaths(int n) {
                if (n < 0) {
                        ArrayList<String> al = new ArrayList<>();
                        return al;
                }
                if (n == 0) {
                        ArrayList<String> al = new ArrayList<>();
                        al.add("");
                        return al;
                }
                if (n == 1) {
                        ArrayList<String> al = new ArrayList<>();
                        al.add("1");
                        return al;
                }
                ArrayList<String> al1 = getStairPaths(n - 1);
                ArrayList<String> al2 = getStairPaths(n - 2);
                ArrayList<String> al3 = getStairPaths(n - 3);
                ArrayList<String> ma = new ArrayList<>();
                for (int i = 0; i < al1.size(); i++)
                        ma.add("1" + al1.get(i));
                for (int i = 0; i < al2.size(); i++)
                        ma.add("2" + al2.get(i));
                for (int i = 0; i < al3.size(); i++)
                        ma.add("3" + al3.get(i));
                return ma;
        }
}
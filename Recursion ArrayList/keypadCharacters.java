// 7 -> tu, 8 -> vwx
// 78 ==> [tv, tw, tx, uv, uw, ux]

import java.util.*;

public class keypadCharacters {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        ArrayList<String> al = getKPC(str);
        System.out.print(al);
    }

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> ma = new ArrayList<>();
            ma.add("");
            return ma;
        }
        String[] num = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
        ArrayList<String> rr = getKPC(str.substring(1));
        ArrayList<String> ma = new ArrayList<>();
        String alpha = num[str.charAt(0) - '0'];
        for (int i = 0; i < alpha.length(); i++) {
            char c = alpha.charAt(i);
            for (int j = 0; j < rr.size(); j++) {
                ma.add(c + rr.get(j));
            }
        }
        return ma;
    }
}
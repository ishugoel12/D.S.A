import java.util.*;

public class subsequences {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        ArrayList<String> al = gss(str);
        System.out.print(al);
    }

    public static ArrayList<String> gss(String str)
    {
        if(str.length() == 0)
        {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        ArrayList<String> al = gss(str.substring(1));
        int s = al.size();
        for(int i=0 ; i<s ; i++)
        {
            al.add(str.charAt(0) + al.get(i));
        }
        return al;
    }
}
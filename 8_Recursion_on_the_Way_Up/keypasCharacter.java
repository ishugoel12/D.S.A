import java.util.*;

public class keypasCharacter {

        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                String str = scn.next();
                scn.close();
                printKPC(str, "");
        }

        public static void printKPC(String str, String asf) {
                if (str == "") {
                        System.out.println(asf);
                        return;
                }
                String[] nums = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
                String s = nums[str.charAt(0) - '0'];
                for (int i = 0; i < s.length(); i++) {
                        printKPC(str.substring(1), asf + s.charAt(i));
                }
        }
}
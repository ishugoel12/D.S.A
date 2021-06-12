import java.util.*;

public class encodings {
        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                String str = scn.next();
                scn.close();
                printEncodings(str, "");
        }

        public static void printEncodings(String str, String asf) {
                if (str == "") {
                        System.out.println(asf);
                        return;
                }
                if (str.charAt(0) == '0')
                        return;
                char ans = (char) ('a' + str.charAt(0) - '0' - 1);
                printEncodings(str.substring(1), asf + ans);
                if (str.length() >= 2) {
                        int x = Integer.parseInt(str.substring(0, 2));
                        if (x <= 26) {
                                ans = (char) ('a' + x - 1);
                                printEncodings(str.substring(2), asf + ans);
                        }
                }
        }
}
import java.util.*;

public class subsequence {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		scn.close();
		printSS(str, "");
	}

	public static void printSS(String str, String ans) {
		if (str == "") {
			System.out.println(ans);
			return;
		}
		printSS(str.substring(1) , ans + str.charAt(0));
		printSS(str.substring(1) , ans);
	}
}
// abc	==>	abc, acb, bac, bca, cab, cba

import java.util.*;
public class permutations {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		scn.close();
		printPermutations(str, "");
	}

	public static void printPermutations(String str, String asf) {
		if (str == "") {
			System.out.println(asf);
			return;
		}
		if (str.length() == 1) {
			System.out.println(asf + str);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			String st = str.substring(0, i);
			String end = str.substring(i + 1, str.length());
			printPermutations(st + end, asf + str.charAt(i));
		}
	}
}
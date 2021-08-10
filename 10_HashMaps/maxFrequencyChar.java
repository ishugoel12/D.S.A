import java.util.*;
// package 10_HashMaps;

public class maxFrequencyChar {
        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                String str = scn.nextLine();
                scn.close();
                HashMap<Character, Integer> hm = new HashMap<>();
                int freq = 0;
                char character = '-';
                for (int i = 0; i < str.length(); i++) {
                        char c = str.charAt(i);
                        if (hm.containsKey(c)) {
                                hm.put(c, hm.get(c) + 1);
                        } else
                                hm.put(c, 1);
                        if (hm.get(c) > freq) {
                                character = c;
                                freq = hm.get(c);
                        }
                }
                System.out.print(character);
        }
        
}
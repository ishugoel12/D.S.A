// print longest sequence of consecutive elements array (ignoring duplicates).

import java.util.*;
public class longestConsecutiveSequence {
        public static void main(String[] args) throws Exception {
                Scanner scn = new Scanner(System.in);
                HashMap<Integer, Boolean> hm = new HashMap<>();
                int n = scn.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++)
                        arr[i] = scn.nextInt();        
                scn.close();
                // 1. sequence can start from any element - benefit of doubt
                for (int i = 0; i < n; i++)
                        hm.put(arr[i], true);
        
                // 2. sequence : a b c => b is not the starting point if b-1 i.e. a exists
                for (Integer key : hm.keySet()) {
                        if (hm.containsKey(key - 1) == true) {
                                hm.put(key, false);
                        }
                }
        
                // 3.
                Integer gstart = -1;
                Integer gcount = 0;
                for (Integer key : hm.keySet()) {
                        if (hm.get(key) == true) {
                                Integer count = 1;
                                while (hm.containsKey(key + count))
                                        count++;
                                if (count > gcount) {
                                        gcount = count;
                                        gstart = key;
                                }
                        }
                }
                int i = 0;
                while (i < gcount) {
                        System.out.println(gstart + i);
                        i++;
                }
        }       
}
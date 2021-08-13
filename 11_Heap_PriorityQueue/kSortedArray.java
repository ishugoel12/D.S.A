import java.io.*;
import java.util.*;

public class kSortedArray {
        public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(br.readLine());
                int[] arr = new int[n];
                for (int i = 0; i < n; i++)
                        arr[i] = Integer.parseInt(br.readLine());
                int k = Integer.parseInt(br.readLine());

                PriorityQueue<Integer> pq = new PriorityQueue<>();
                for (int i = 0; i <= k; i++)
                        pq.add(arr[i]);
                for (int i = k + 1; i < arr.length; i++) {
                        arr[i - k - 1] = pq.remove();
                        pq.add(arr[i]);
                }
                for (int i = arr.length - k - 1; i < arr.length; i++) {
                        arr[i] = pq.remove();
                }
                for (int i = 0; i < n; i++)
                        System.out.println(arr[i]);
        }
}
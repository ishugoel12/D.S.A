import java.util.*;

public class allSubsets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        scn.close();

        for (int i = 0; i < (int) Math.pow(2, n); i++) {
            int b = toBinary(i);
            int mul = n - 1;
            int idx = 0;
            while (idx < n) {
                int r = b / (int) Math.pow(10, mul);
                b = b % (int) Math.pow(10, mul);
                mul--;
                if (r != 0)
                    System.out.print(arr[idx] + "\t");
                else
                    System.out.print("-\t");
                idx++;
            }
            System.out.println();
        }
    }

    public static int toBinary(int n) {
        int ans=0,mul=0;
        while(n>0)
        {
            int r = n%2;
            n=n/2;
            ans+= r*(int)Math.pow(10,mul);
            mul++;
        }
        return ans;
    }
}
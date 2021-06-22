import java.util.*;

public class lcmGcd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        int gcd = 0, lcm = 0, small = 0;
        if (n1 < n2) {
            small = n1;
            gcd = n2;
        } else {
            small = n2;
            gcd = n1;
        }

        while (small > 0) {
            gcd = gcd % small;
            int t = gcd;
            gcd = small;
            small = t;
        }

        lcm = (n1 * n2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
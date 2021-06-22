import java.util.*;

public class power {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        scn.close();
        System.out.print(pow2(x, n));
    }
    //linear
    public static int pow1(int x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        return x * pow1(x, n - 1);
    }
    //logarthmic
    public static int pow2(int x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        int p = pow2(x, n / 2);
        if (n % 2 == 0)
            return p * p;
        return p * p * x;
    }
}
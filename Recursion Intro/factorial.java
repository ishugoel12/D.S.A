import java.util.*;

public class factorial {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        System.out.print(fact(n));
    }
    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }
}
import java.util.*;

public class towerOfHanoi {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int disk = scn.nextInt();
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        scn.close();
        toh(disk, a, b, c);
    }

    public static void toh(int n, int t1, int t2, int t3) {
        if (n == 0)
            return;
        toh(n - 1, t1, t3, t2);
        System.out.println(n + "[" + t1 + " -> " + t2 + "]");
        toh(n - 1, t3, t2, t1);
    }
}
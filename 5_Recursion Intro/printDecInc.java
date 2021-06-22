import java.util.*;

public class printDecInc {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        printDI(n);
    }

    public static void printDI(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printDI(n - 1);
        System.out.println(n);
    }
}
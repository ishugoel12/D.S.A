import java.util.*;

public class anyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        scn.close();
        int d = toDecimal(n, b);
        System.out.println(d);
    }

    public static int toDecimal(int n, int b) {
        int mul = 0, num = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            num += r * Math.pow(b, mul);
            mul++;
        }
        return num;
    }
}
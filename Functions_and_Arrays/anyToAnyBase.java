import java.util.*;

public class anyToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sbase = scn.nextInt();
        int dbase = scn.nextInt();
        scn.close();
        int dec = toDecimal(n, sbase);
        System.out.print(decimaltoDes(dec, dbase));
    }

    public static int toDecimal(int n, int base) {
        int mul = 0, ans = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            ans += r * Math.pow(base, mul);
            mul++;
        }
        return ans;
    }

    public static int decimaltoDes(int n, int base) {
        int ans = 0, mul = 0;
        while (n > 0) {
            int r = n % base;
            n = n / base;
            ans += Math.pow(10, mul) * r;
            mul++;
        }
        return ans;
    }
}
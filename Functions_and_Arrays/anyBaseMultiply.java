import java.util.*;

public class anyBaseMultiply {    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int ans = 0, mul = 0;
        while (n2 > 0) {
            int r = n2 % 10;
            n2 = n2 / 10;
            int tans = multiply(n1, r, b);
            ans = add(ans, tans * (int) Math.pow(10, mul), b);
            mul++;
        }
        return ans;
    }

    public static int add(int a, int b, int base) {
        int c = 0, ans = 0, mul = 0;
        while (a > 0 || b > 0) {
            int r1 = a % 10;
            int r2 = b % 10;
            a = a / 10;
            b = b / 10;
            int r = (r1 + r2 + c) % base;
            c = (r1 + r2 + c) / base;
            ans = r * (int) Math.pow(10, mul) + ans;
            mul++;
        }
        if (c != 0)
            ans = ans + c * (int) Math.pow(10, mul);
        return ans;
    }

    public static int multiply(int n, int digit, int base) {
        int ans = 0, c = 0, mul = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            int r = (digit * d + c) % base;
            c = (digit * d + c) / base;
            ans = ans + r * (int) Math.pow(10, mul);
            mul++;
        }
        if (c != 0)
            ans = ans + c * (int) Math.pow(10, mul);
        return ans;
    }
}
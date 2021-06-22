// print digits of the number sequentially 7895 => 7 8 9 5

import java.util.*;
public class printDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int n = num;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        while (num > 0) {
            int digit = num / (int) Math.pow(10, count - 1);
            num = num % (int) Math.pow(10, count - 1);
            System.out.println(digit);
            count--;
        }
        while (count != 0) {
            System.out.println("0");
            count--;
        }
        scn.close();
    }
}
// OR reverse the number, then print in opposite order
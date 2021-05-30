import java.util.*;
public class printDigitsReverseOrder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        while (num > 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
        scn.close();
    }
}

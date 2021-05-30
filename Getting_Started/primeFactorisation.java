// print prime  factorisation : 1440 => 2 2 2 2 2 3 3 5
import java.util.*;
public class primeFactorisation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        scn.close();
        int i = 2;
        while (num != 1) {
            if (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            } else
                i++;
        }
    }
}
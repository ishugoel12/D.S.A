/*
You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive,
rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value 
of k. Also k can have an absolute value larger than number of digits in n.
*/

import java.util.*;
public class rotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int num = n, size = 0;
        while (num > 0) {
            num = num / 10;
            size++;
        }
        k = k % size;
        if (k < 0)
            k = k + size;
        int right = n % (int) Math.pow(10, k);
        n = n / (int) Math.pow(10, k);
        n = n + (int) Math.pow(10, size - k) * right;
        System.out.print(n);
        scn.close();
    }
}
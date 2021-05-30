/*
1. given number :
The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 
without missing any and without repeating any. e.g. 23415.
3. The inverse of a number is defined as the number created by interchanging the face value and index 
of digits of number.e.g. for 426135 (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is 
in place 3, 6 is in place 4, 2 is in place 5 and 4 is in place 6), the inverse will be 416253 (reading 
from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4, 1 is in place 5 
and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153 is 24153    
*/

import java.util.*;
public class inverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int newnum = 0;
        int idx = 1;
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            newnum = newnum + idx * (int) Math.pow(10, digit - 1);
            idx++;
        }
        System.out.println(newnum);
        scn.close();
    }
}
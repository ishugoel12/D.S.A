/*
1. You are given n number of bulbs. They are all switched off. A weird voltage fluctuation hits the 
circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is 
toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be 
switched on after n fluctuations.
*/

/*
After 20 fluctuations, the bulbs that end up being turned on are 1 4 9 16 which experienced an odd 
number of fluctuations through them. Rest all numbers experienced an even number of fluctuations 
and hence, they are turned off. All of these bulb numbers are perfect squares.

The problem comes down to the question that how many factors does the number have, or comprises of.
If a bulb had even number of factors, then it would participate in even number of cycles, thus, 
it would then keep the bulb off.
If a bulb had odd number of factors, then it would participate in odd number of cycles and hence,
otherwise would be kept on.
So, all perfect square numbers have odd numbers of factors.
*/

import java.util.*;
public class benjaminBulbs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
        scn.close();
    }
}
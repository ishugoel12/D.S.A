/*
1. Take a number "k" representing count of input numbers to be tested.
2. Test k numbers.
3. For each input value, print "prime" if the number is prime and "not prime" otherwise.
*/

import java.util.*;

public class prime
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int[] arr = new int[k];
        for(int i=0 ; i<k ; i++)
            arr[i] = scn.nextInt();
        for(int i=0 ; i<k ; i++)
        {
            boolean isPrime = isPrimeFunc(arr[i]);
            if(isPrime == true)
                System.out.println("prime");
            else
                System.out.println("not prime");
        }
        scn.close();
    }
    
    public static boolean isPrimeFunc(int n)
    {
        if(n<0) return false;
        for(int i=2 ; i*i<=n ; i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
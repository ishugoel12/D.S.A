import java.util.*;
  
public class anyBaseSubt
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println(getDifference(b, n1, n2));
        scn.close();
    }
    
    public static int getDifference(int b, int n1, int n2){
        int c=0,ans=0,mul=0;
        while(n2>0)
        {
            int r1 = n1%10;
            n1/=10;
            int r2 = n2%10;
            n2/=10;
            int s = r2-r1-c;
            if(s<0)
            {
                s+=b;
                c=1;
            }
            else
                c=0;
            ans += Math.pow(10,mul)*s;
            mul++;
        }
        return ans;
    }
}
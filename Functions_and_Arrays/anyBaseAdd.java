import java.util.*;
  
public class anyBaseAdd
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();  //base
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println(getSum(b, n1, n2));
        scn.close();
    }
  
    public static int getSum(int b, int n1, int n2){
        int ans=0, r1=0, r2=0, c=0, s=0, mul=0;
        while(n1>0 && n2>0)
        {
            r1 = n1 % 10;
            n1 = n1 / 10;
            r2 = n2 % 10;
            n2 = n2 / 10;
            s = (r1+r2+c) % b;
            c = (r1+r2+c) / b;
            ans += s*Math.pow(10,mul);
            mul++;
        }
        while(n1>0)
        {
            r1 = n1 % 10;
            n1 = n1 / 10;
            s = (r1+c) % b;
            c = (r1+c) / b;
            ans += s*Math.pow(10,mul);
            mul++;            
        }
        while(n2>0)
        {
            r2 = n2 % 10;
            n2 = n2 / 10;
            s = (r2+c) % b;
            c = (r2+c) / b;
            ans += s*Math.pow(10,mul);
            mul++;            
        }
        if(c != 0)
        {
            ans += c*Math.pow(10,mul);           
        }
        return ans;
    }
}
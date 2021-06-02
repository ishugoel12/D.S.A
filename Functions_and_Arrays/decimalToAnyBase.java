import java.util.*;
public class decimalToAnyBase {
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      System.out.println(getValueInBase(n, b));
      scn.close();
   }
  
    public static int getValueInBase(int n, int b){
        int num=0, mul = 1;
        while(n>0)
        {
            int r = n % b;
            n=n/b;
            num = num + r*mul;
            mul *= 10;
        }
        return num;
    }
  }
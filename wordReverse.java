// import java.util.*;

public class wordReverse {
        public static void main(String[] args) {
                String str = "i am a student";
                String[] arr = retarray(str);
                for (int i = arr.length - 1; i >= 0; i--) {
                        System.out.print(arr[i] + " ");
                }
        }
        public static String[] retarray(String str){
                int cnt = 0;
                for(int i=0;i<str.length();i++){
                        if(str.charAt(i) == ' ')
                                cnt++;
                }
                cnt++;
                String[] arr= new String[cnt];
                cnt=0;
                String word = "";
                for(int i=0;i<str.length();i++){
                        if(str.charAt(i) != ' ')
                                word += str.charAt(i);
                        else{
                                arr[cnt++] = word;
                                word="";
                        }
                }
                arr[cnt] = word;
                return arr;
        }
}
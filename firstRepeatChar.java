import java.util.HashSet;

public class firstRepeatChar {
        public static void main(String[] args){
                String name = "geksforgeeks";
                System.out.print(firstChar(name));
        }
        public static char firstChar(String str){
                HashSet<Character> hs = new HashSet<>();
                for(int i=0;i<str.length();i++){
                        char c = str.charAt(i);
                        if(hs.contains(c))
                                return c;
                        else
                                hs.add(c);
                }
                return '\0';
        }
}
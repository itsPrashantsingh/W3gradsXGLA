import java.util.ArrayList;

public class subsequencestring {
    public static void generate(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        generate(s.substring(1), ans+ch);
        generate(s.substring(1), ans);
        



    }
    public static void main(String[] args) {
        String s = "abc";
        String ans = "";
        generate(s, ans);
        
    }





}

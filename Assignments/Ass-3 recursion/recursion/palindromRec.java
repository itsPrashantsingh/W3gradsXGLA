import java.util.Scanner;

public class palindromRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(gen(s, 0, s.length()-1));


    }

    public static boolean gen(String s, int si, int ei){

        if(si>ei){
            return true;
        }
        if(s.charAt(si)!=s.charAt(ei)){
            return false;
        }
        return gen(s, si+1, ei-1);

    }
    
}

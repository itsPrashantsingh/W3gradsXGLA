import java.util.ArrayList;
import java.util.List;

public class binarystring {
    public static void main(String[] args) {
        int N = 3;
         List< String > ll = new ArrayList<String>();
        String ans = "";
        generate(ll, ans, N);
        System.out.println(ll);
    }

    public static void generate(List<String> ll, String ans, int N ){
        if(N==0){
            ll.add(ans);
            return;
        }
        generate(ll, ans+'0', N-1);
        if(ans.length()-1 < 0 || ans.charAt(ans.length()-1)!=){
            generate(ll, ans+'1', N-1);
        }
        return;
        


    }
}

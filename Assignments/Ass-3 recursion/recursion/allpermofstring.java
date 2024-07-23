import java.util.*;
public class allpermofstring {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] str = s.toCharArray();
        List<String> fx = new ArrayList<String>();
        gen(str, 0, s, fx);
        Collections.sort(fx);
        for(int i = 0; i<fx.size(); i++){
            System.out.println(fx.get(i));
        }

    }
    public static void gen(char[] str, int i, String s, List<String> fx){
        if(i==str.length-1){
            String f = "";
            for(int k = 0; k<str.length; k++){
                f+=str[k];
            }
            if(f.compareTo(s)>0){
                fx.add(f);
                
            }

            return;
        }
        for(int j = i; j<str.length; j++){
            swap(str, i, j);
            gen(str, i+1, s, fx);
            swap(str,i,j);
            
        }


    }

    public static void swap(char[]str, int i, int j){
        char ch = str[i];
        str[i] = str[j];
        str[j] = ch;
    }
}


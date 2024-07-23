import java.util.*;

public class dicecombination {
    static int count = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        gen(n, 0);
        System.out.println(count);


        
    }

    public static void gen(int n, int sum){
        if(sum==n){
            count++;
            return;
        }
        if(sum>n){
            return;

        }

        for(int i = 1; i<=6; i++){
            gen(n, sum+i);
        }

    }
    
}

import java.util.Scanner;

public class zeroNo {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        gen(n, 0);
        System.out.println(min);
    }

    public static void gen(int n, int count){
        if(n==0){
            min  = Math.min(count, min);
           
            return;
        }
       
        if(n<0){
            return;
        }
        int a = n;
        while(n>0){
            int r = n%10;
            if(r!=0)
            gen(a-r, count+1);
            n/=10;
        }


    }

    
}

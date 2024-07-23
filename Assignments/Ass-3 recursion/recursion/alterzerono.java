import java.util.Scanner;

public class alterzerono {
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
        int max = Integer.MIN_VALUE;
        while(n>0){
            max = Math.max(max, n%10);
            n/=10;
        }
        gen(a-max, count+1);


    }

    
}

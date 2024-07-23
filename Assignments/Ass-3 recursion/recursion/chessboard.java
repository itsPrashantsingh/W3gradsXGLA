import java.util.*;
public class chessboard {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        long [] count = new long[1];
        int n = sc.nextInt();
        String s = "";

        gen(n, 0, 0, s, count);
        System.out.println();
        System.out.println(count[0]);
    }
    public static void gen(int n, int H, int V, String s, long[] count){
        if(H==n-1 && V == n-1){
            System.out.print(s+"{"+H+"-"+V+"}"+" ");
            count[0] = count[0]+1;
            return ;
        }
        if(H>n-1 || V>n-1){
            return ;
        }

        gen(n, H+1, V+2, s+"{"+H+"-"+V+"}"+"K", count);
        gen(n, H+2, V+1, s+"{"+H+"-"+V+"}"+"K", count);


        if(H==0 || V==0 || H==n-1 || V==n-1){
            for(int i = 1; i<n; i++){
                gen(n, H, V+i, s+"{"+H+"-"+V+"}"+"R", count);
                gen(n, H+i, V, s+"{"+H+"-"+V+"}"+"R", count);
            }
        }

        if(H==V){
            for(int j = 1; j<n; j++){
                gen(n, H+j, V+j, s+"{"+H+"-"+V+"}"+"B", count);
            }
        }
        
    }
}

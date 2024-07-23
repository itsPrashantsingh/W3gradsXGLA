
import java.util.Scanner;

public class nqueens {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        boolean[][] arr = new boolean[n][n];

      
            gen(arr, 0, 0, n-1);

       
        
        System.out.println(count);


        
    }
    public static void gen(boolean[][] arr, int row, int c, int n){
        
        if(n==0){
            count++;
        }
        if(row >arr.length-1){
            return;
        }

        for(int r = row; r<arr.length; r++){
        
        for(int col = 0; col<arr[0].length; col++){
            if(safehere(arr, r, col)){
                arr[r][col] = true;
                gen(arr, r+1, c, n-1);
                arr[r][col] = false;
            }
               
        }
    }

    }

    public static boolean safehere(boolean[][] arr, int r, int c)
    {

        int row = r;

        while(row>=0){
            if(arr[row][c]==true){
                return false;
            }
            row--;
        }

        int rc = r;
        int cc = c;

        while(rc>=0 && cc>=0 ){
            if(arr[rc][cc]==true){
                return false;
            }
            rc--;
            cc--;
        }
        while(r>=0 && c<=arr[0].length-1 ){
            if(arr[r][c]==true){return false;}
            r--;
            c++;
        }
        return true;

    }
    
    
}

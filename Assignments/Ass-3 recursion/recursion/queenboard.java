import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'queensBoard' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY board as parameter.
     */

    public static int queensBoard(List<String> board) {
    // Write your code here
        
        int r = board.size();
        String x = board.get(0);
        // System.out.print(board);
        int c = x.length();
        
        long[] count = new long[1];
        boolean[][] arr = new boolean[r][c];
        
        gen(arr, 0, 0, 0, count, board);
        long z = count[0];
        
        return (int)(z % 1000000007);
       
        
        
        
    }
    
     public static void gen(boolean[][] arr, int r, int c, int n, long[] count, List<String> board){
      
         if(r> arr.length-1){
             if(n>=1){
                count[0] = (count[0]+1)%1000000007;
             }
           
            return;
        }
           
           
         if(c>arr[0].length-1){
             gen(arr, r+1, 0, n, count, board);
             return;
         }
         
         // System.out.println(r+" "+c);
          
         
            if(board.get(r).charAt(c)!='#' && safehere( arr, r,  c, board  ) ){
                arr[r][c] = true;
                gen(arr, r, c+1, n+1, count, board); 
                arr[r][c] = false;
            }
                       
          gen(arr, r, c+1,  n, count, board); 

    }
    
    public static boolean safehere(boolean[][] arr, int r, int c, List<String> board)
    {
        
        // System.out.println(r+" "+c);
        
        
        // String a = board.get(r);
        // if(a.charAt(c)=='#'){
        //     return false;
        // }
        
        int col = c;
        while(col>=0){
           
            String j = board.get(r);
            if(j.charAt(col)=='#'){
                   break;
                }
                
                    
            if(arr[r][col]==true  ){
                
                return false;
            }
            col--;
        }
        

        int row = r;

        while(row>=0){
           
            String b = board.get(row);
            if(b.charAt(c)=='#'){
                   break;
                }
                
                    
            if(arr[row][c]==true  ){
                
                return false;
            }
            row--;
        }

        int rc = r;
        int cc = c;

        while(rc>=0 && cc>=0 ){
            String z = board.get(rc);

            if(z.charAt(cc)=='#'){
                    break;
                }
                
            if(arr[rc][cc]==true ){
                
                return false;
            }
            rc--;
            cc--;
        }
        while(r>=0 && c<=arr[0].length-1 ){
            String d = board.get(r);
          
            
            if(d.charAt(c)=='#'){
                    break;
                }
                
            
            if(arr[r][c]==true ){
                
                return false;
            }
            r--;
            c++;
        }
        return true;

    }
    

}

public class queenboard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                List<String> board = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());

                int result = Result.queensBoard(board);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

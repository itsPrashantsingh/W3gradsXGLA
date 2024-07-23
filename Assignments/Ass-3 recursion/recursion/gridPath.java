import java.util.Scanner;

public class gridPath {
    // static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        long[][] visit = new long[n][n];
        for(int i = 0; i<n; i++){
            String s = sc.next();
            for(int j = 0; j<n; j++){
                grid[i][j] = s.charAt(j);
            }
        }
        // for(int i= 0; i<n; i++){
        //     for(int j = 0; j<n; j++){
        //         visit[i][j] = -1;
        //     }
        // }
        long a = gen(grid, 0, 0, visit);
        System.out.println(a);


    }

    public static long gen(char[][] grid, int i, int j, long[][] visit){
        if(i>grid.length-1 || j>grid[0].length-1){
            return 0;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            if(grid[i][j]=='*'){
                return 0;
            }
            return 1;
        }
        if(visit[i][j] != 0){
            return visit[i][j];
        }
        
      
        if(grid[i][j]=='*'){
                return 0;
            
        }

       
        long x = gen(grid, i+1, j, visit) % 1000_000_007;
        long y = gen(grid, i, j+1, visit) % 1000_000_007;

        visit[i][j] = (x+y) % 1000_000_007;


        return visit[i][j];
       


    }
    
}

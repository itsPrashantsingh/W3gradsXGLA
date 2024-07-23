import java.util.Scanner;

public class knightDialer {
    static int[][] board = {{1,2,3}, {4,5,6}, {7,8,9}, {-1, 0, -1}};
    
    public static void main(String[] args) 
        
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] check = new int[4][3];
        for(int i = 0; i<4; i++){
            for(int j = 0; j<3; j++){
                
                check[i][j] = -1;
            }
        }
        int count = 0;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<3; j++){
                if(board[i][j]!=-1){

                    count  = count + gen(n-1, i, j, check);

                }

               
            }}
               
        

        System.out.println(count);


       
        
    }

    public static int gen(int n, int i, int j, int[][] check){
        if(i>3 || i<0 || j>2 || j<0 || board[i][j]== -1  ){
            return 0;
        }
        if(n==0){

            return 1;
        }
        // if(check[i][j] != -1){
        //     return check[i][j];
        // }


        int a = gen(n-1, i-2, j-1, check)%1000000007;
        int b = gen(n-1, i-2, j+1, check)%1000000007;
        int c = gen(n-1, i-1, j-2, check)%1000000007;
        int d = gen(n-1, i-1, j+2, check)%1000000007;

        int e = gen(n-1, i+2, j-1, check)%1000000007;
        int f = gen(n-1, i+2, j+1, check)%1000000007;
        int g = gen(n-1, i+1, j-2, check)%1000000007;
        int h = gen(n-1, i+1, j+2, check)%1000000007;

       

        return  (a+b+c+d+e+f+g+h) % 1000000007;

        

    

    }
    
}

import java.util.*;
public class x {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
       
        char[][] ch = {
            {'O', 'X', 'O', 'O'},
            {'O', 'O', 'O', 'X'},
            {'X', 'O', 'X', 'O'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'O'},
            {'X', 'X', 'O', 'O'},
            {'X', 'X', 'O', 'O'},
        };
        int [][] arr = new int[r][c];
       
        gen(r, c, ch, arr, 0, 0);

    }

    public static void gen(int r, int c, char[][] ch, int[][] arr, int H, int V){
        if(H==c-1 && V==r-1){
            arr[V][H] = 1;
            for(int i = 0; i<r; i++){
                for(int j = 0; j<c; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            
            return;
            }

        

        if(H > c-1 || V > r-1){
            return;
        }
        if(ch[V][H]=='X'){
            return;
        }
        arr[V][H] = 1;
        gen(r, c, ch, arr, H+1, V);
        gen(r, c, ch, arr, H, V+1);
        arr[V][H] = 0;


    }
}
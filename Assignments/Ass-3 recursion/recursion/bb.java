import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
       
        char [][] ch = new char[r][c];
        int [][] arr = new int[r][c];
       
        for(int i = 0; i<r; i++){
            String data = "";
            if(sc.hasNext()){
                data = sc.next();
            }
            else{break;}
            for(int j = 0; j<c; j++){
                
                ch[i][j] = data.charAt(j);

            }
        }
        
        
        
        gen(r, c, ch, arr, 0, 0);
        if(arr[r-1][c-1]==0){System.out.print("NO PATH FOUND");}

    }

    public static void gen(int r, int c, char[][] ch, int[][] arr, int H, int V){
        if(H==c-1 && V==r-1){
            if(ch[V][H]=='X'){
                return ;
            }
            arr[V][H] = 1;
            for(int i = 0; i<r; i++){
                for(int j = 0; j<c; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            return;

        }

        if(H > c-1 || V > r-1 || H<0 || V<0){
            return ;
        }
        if(ch[V][H]=='X'){
            return ;
        }
        arr[V][H]=1;
        
        gen(r, c, ch, arr, H+1, V);
       
        gen(r, c, ch, arr, H, V+1);
        arr[V][H]=0;

        


    }
}
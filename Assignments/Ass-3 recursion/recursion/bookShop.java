import java.util.Scanner;

public class bookShop {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] pages = new int[n];
        int[] books = new int[n];
        for(int i = 0; i<n; i++){
            books[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            pages[i] = sc.nextInt();
        }
        gen(pages, books, 0, 0, 0, target);
        System.out.println(max);

    }
    
    public static void gen(int[] pages, int[] books, int i, int ps, int bs, int target){
       
        if(i>pages.length-1){
            return;
        }
        if(bs > target){
            return;
        }
        if(max <= ps){
            max = ps;
        }
      
       
        gen(pages, books, i+1, ps+pages[i], bs+books[i], target);
        gen(pages, books, i+1, ps, bs, target);
    }
    
}

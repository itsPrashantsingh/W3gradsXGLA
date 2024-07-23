import java.util.Scanner;

public class minimizingcoin {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        gen(arr, 0, target, 0);
        if(min != Integer.MAX_VALUE)
        System.out.println(min);
        else
        System.out.println(-1);
    }
 
    public static void gen(int[] arr, int sum, int target, int count){
        if(sum==target){
            min  = Math.min(count, min);
            return;
        }
        if(sum>target ){
            return;
        }
        for(int i = 0; i<arr.length; i++){
            gen(arr, sum+arr[i], target, count+1);
        }

    }
    
}

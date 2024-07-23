import java.util.*;
public class sumCount{
    static int count = 0;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            
            arr[i] = sc.nextInt();
        }

        
        gen(arr, target, 0, 0);
        System.out.println(count);
        
        

     }

     public static void gen(int [] arr, int target, int sum, int idx){
        if(sum==target){
            count++;
            return;
        }
        if(sum>target){
            return;
        }
        for(int i = idx; i<arr.length; i++){
            if(i>idx)
            gen(arr, target, sum+arr[i], i+1);

        }
        


     }
    
}

import java.util.ArrayList;
import java.util.List;

public class subsetsum {
    public static void main(String[] args) {
        int[] arr = {1,4,6,5,3};
        int target = 10;
        List<Integer> ll = new ArrayList<Integer>();
        gen(ll, 0, arr, target);
        
    }


    public static void gen(List<Integer> ll, int x, int[] arr, int target){
        if(x>arr.length-1){
            
            int sum = 0;
            for(int i = 0; i<ll.size(); i++){
                sum+=ll.get(i);

            }
            if(sum==target){
                for(int z = ll.size()-1; z>=0; z--){
                    System.out.print(ll.get(z)+" ");
                }
                System.out.println();
               
            }
           
            return;
        }
        gen(ll, x+1, arr, target);
        ll.add(arr[x]);
        gen(ll, x+1, arr, target);
        ll.remove(ll.size()-1);
       



    }
    
}

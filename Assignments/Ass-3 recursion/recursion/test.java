import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] nums = {1,2,3};


        List <Integer> arr = new ArrayList<>();
        List <List<Integer>> list = new ArrayList<List<Integer>>();
        int n = nums.length;
        
        generate(nums,arr, list, 0, n);
        System.out.println(list);

    }


     public static void generate(int[] nums, List<Integer> arr,List <List<Integer>> list, int i, int n){
        if(i==n){
            list.add(new ArrayList<>(arr));
            
            return;
        }
        arr.add(nums[i]);
        generate(nums, arr, list, i+1,n);
        arr.remove(arr.size()-1);
        generate(nums, arr, list, i+1, n);



    }
}

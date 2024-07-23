public class revrsearr {
    public static void rev(int[] arr, int i, int j){
        if(i>j){return;}
        int c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
        rev(arr, i+1, j-1);


    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        rev(nums, 0, nums.length-1);
        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

    }
    
}

public class checksortedarr {
    public static boolean check(int[] arr, int i){
        if(i==arr.length){
            return true;
        }
        else if(arr[i-1]>arr[i]){
            return false;
        }
        return check(arr, i+1);
        

    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 3};
        boolean x = check(nums, 1);
        System.out.println((x));

        

    }
    
}

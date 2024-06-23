
class Solution {

    public void rotate(int[] nums, int k) {
     int n = nums.length;
     k=k%n;
     reverse_r(nums, 0, n-1-k);
     reverse_r(nums, n-k, n-1);
     reverse_r(nums, 0, n-1);
     }   

    public static void reverse_r(int [] nums, int a, int b){
        int i = a;
        int j = b;
        while(i<j){
            int c = nums[i];
            nums[i] = nums[j];
            nums[j] = c;
            i++;
            j--;
        }
        }       
    
    }



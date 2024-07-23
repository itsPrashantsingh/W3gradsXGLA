public class cointargetsum {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5};
        int target = 8;
        int sum = 0;
        String s = "";
        gen(arr, target, sum, s);
        

     }

     public static void gen(int [] arr, int target, int sum, String s){
        if(sum==target){
            System.out.println(s);
            return;
        }
        if(sum>target){
            return;
        }
        for(int i = 0; i<arr.length; i++){
            gen(arr, target, sum+arr[i], s+arr[i]);

        }
        

     }
    
}

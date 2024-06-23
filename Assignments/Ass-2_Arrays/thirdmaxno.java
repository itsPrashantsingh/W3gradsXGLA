import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
     
        for(int i = 0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        System.out.print(hs);
       
        ArrayList<Integer> ll = new ArrayList<>();
      for(Integer a:hs){
       
       ll.add(a);
    
      }
      Collections.sort(ll);
      if(ll.size()<=2){
        return ll.get(ll.size()-1);
      }

      return ll.get(ll.size()-3) ;
    }

    
}
class Solution {
    public boolean isPalindrome(int x) {
        
        
        int rev = 0;
        int a = x;
        if(x<0 ){
            return false;
        }
        while(x>0){
            rev = (rev*10) + (x%10);
            x/=10;
        }
      if(rev==a){
        return true;
      }
      return false;
        
        
        
        
    }
}

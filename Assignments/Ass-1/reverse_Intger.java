class Solution {
    public int reverse(int x) {
        int a = x;
        long rev = 0;
        int f = 0;
        if(a<0){
            a = Math.abs(a);
            f = 1;
        }
        while(a>0){
            rev = (rev*10)+(a%10);
            a/=10;
        }
        if(f==1){
            rev*=-1;
        }
        if(rev<Integer.MAX_VALUE && rev>Integer.MIN_VALUE){

            return (int)(rev);
        }
        return 0;
        
    }
}
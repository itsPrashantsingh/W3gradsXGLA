public class combinations {
    public static void main(String[] args) {
        int n = 2;
        String ans= "";
        int seat = 4;
        boolean [] arr = new boolean[seat];
        gen(0, n, ans, seat, arr, 0);
        
    }

    public static void gen(int curr, int n, String ans, int seat,boolean [] arr, int idx ){
        if(curr==n){
            System.out.println(ans);
            return;
        }
        for(int i = idx; i<seat; i++){
            if(arr[i]==false){
                arr[i]=true;
                gen(curr+1, n, ans+"s"+i, seat,arr, i+1);
                arr[i]=false;
            }
           
        }

    }
    
}

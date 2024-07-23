public class permuatation {
    public static void main(String[] args) {
        int n = 2;
        String ans= "";
        int seat = 4;
        boolean [] arr = new boolean[seat];
        gen(0, n, ans, seat, arr);
        
    }

    public static void gen(int curr, int n, String ans, int seat,boolean [] arr ){
        if(curr==n){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i<seat; i++){
            if(arr[i]==false){
                arr[i]=true;
                gen(curr+1, n, ans+"s"+i+"P"+curr, seat,arr);
                arr[i]=false;
            }
           
        }

    }
    
}

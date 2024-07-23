// public class firstnno {
    
//     public static void sum(int n, int s){  
//         if(n<1){
//             System.out.println(s);
//             return;
//         }
//         sum(n-1, n+s);


         
//     }
//     public static void main(String[] args) {
        
//         sum(5, 0);
        
//     }
    
// }



public class firstnno {
    
    public static int sum(int n){  
        if(n==0){
            return 0;
        }
        return n + sum(n-1);


         
    }
    public static void main(String[] args) {
        
        int n = sum(5);
        System.out.println(n);
        
    }
    
}

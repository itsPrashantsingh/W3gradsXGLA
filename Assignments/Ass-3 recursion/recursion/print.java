public class print {

    public static void rec(int n){
      if (n==0){return ;}

      System.out.println("hello");
      rec(n-1);


    }
    
    public static void main(String[] args) {
        
        rec(5);
        

        
    }
}

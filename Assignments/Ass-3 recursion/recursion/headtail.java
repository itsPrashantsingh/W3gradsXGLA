public class headtail {

    public static int generate(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return 1;
        }
        int a = generate(n-1, ans+"h");
        int b = generate(n-1, ans+"t");

        return a+b;




    }





    public static void main(String[] args) {
        String ans = "";
        System.out.println(generate(3, ans));

        
    }
}

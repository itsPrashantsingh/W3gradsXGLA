public class towerofhanoi {
    public static void main(String[] args) {
        int n = 3;
        gen("A", "B", "C", n);
        
    }

    public static void gen(String from, String to, String help, int n){
        if(n==0){
            return;
        }
        gen(from, help, to, n-1);
        System.out.println("Move disk "+ n + " " +  from + " to "+ to);
        gen(help, to, from, n-1);


    }
    
}

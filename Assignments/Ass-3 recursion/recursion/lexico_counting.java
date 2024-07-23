public class lexico_counting {
    public static void main(String[] args) {
        generate(0, 1000);

        
    }

    public static void generate(int curr, int n){
        if(curr>n){
            return;
        }

        int i = 0;
        System.out.println(curr);
        if(curr==0){i = 1;}
        for(;i<=9; i++){
            generate(curr*10+i, n);

        }

    }
    
}

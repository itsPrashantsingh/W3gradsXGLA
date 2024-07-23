package trees;

public class preorderonarray {
    public static void main(String[] args) {
        int[] arr = {17, 8, 7, 5, 10, 6};
        recurse(0, arr);
    }

    public static void recurse(int i, int[]a){
        if(i>a.length || a[i]==-1){
            return;
        }

        recurse(2*i+1, a);
        System.out.println(a[i]);
        recurse(2*i+2, a);

    }
    
}

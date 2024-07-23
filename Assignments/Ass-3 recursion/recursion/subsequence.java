import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsequence {
    public static void generate(int[] ary, ArrayList<Integer> arr, int i, int n){
        if(i==n){
            for(int j = 0; j<arr.size(); j++){
                System.out.print(arr.get(j));

            }
            System.out.println();
            return;
        }
        arr.add(ary[i]);
        generate(ary, arr, i+1,n);
        arr.remove(arr.size()-1);
        generate(ary, arr, i+1, n);



    }
 

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] ary = {1,2,3};

        generate(ary, arr, 0,3);

    }
    
}

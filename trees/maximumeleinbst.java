public class maximumeleinbst {
    public static void main(String[] args) {

    
    }
    public static int gen(TreeNode n, int max){
        if(n==null){
            return 0;
        }
        max = Math.max(max, n.val);
        gen(n.left, max);
        gen(n.right, max);

        return max;


    }

    
}

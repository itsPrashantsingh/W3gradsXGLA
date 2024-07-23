package trees;
import java.util.*;

public class unevennodes{
    /**
     * 
     * @param root      Root Node
     * @param k         Minimum difference in height of subtrees for uneven node
     * @return          Number of uneven nodes
     */
     static int c = 0;
    public static int countUneven(Node root, int k){
        gen(root, k);
        // System.out.print(count);
        return c;
    }
    public static int gen(Node root, int k){
         if(root==null){
            return 0;
        }
        int a = gen(root.left, k);
        int b = gen(root.right, k);

        if(Math.abs(a-b)>=k){
            c++;
        }
        return Math.max(a, b) + 1;
    }
    public static Node createTree(int a[], int i){
        if(i >= a.length || a[i] == -1) return null;
        Node newnode = new Node(a[i]);
        newnode.left = createTree(a, 2*i+1);
        newnode.right = createTree(a, 2*i+2);
        return newnode;
    }
    public static void main(String args[]){
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int a[] = new int[n];
        // read values
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        sc.close();
        Node root = createTree(a, 0);
        
        System.out.println(countUneven(root, k));
    }
}

class Node {
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}



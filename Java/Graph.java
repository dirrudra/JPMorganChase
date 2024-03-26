import java.util.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Graph {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            map.getOrDefault(t1, t2);
            
        }
        for(int key : map.keySet()){
            System.out.println(key);

        }

    }
}

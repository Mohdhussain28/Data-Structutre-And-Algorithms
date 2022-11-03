import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class InorderTraversal{
    private static boolean isSum(Node root){
        if(root==null)return true;
        if(root.left==null&&root.right==null){
            return true;
        }
        int sum =0;
        if(root.left!=null){
            sum+=root.left.key;
        }
        if(root.right!=null){
            sum+=root.right.key;
        }
        return (root.key==sum && isSum(root.left)&&isSum(root.right));
    }
    private static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+"->");
            inorder(root.right);
        }
    }
    private static int height(Node root){
        if(root==null){
            return 0;
        }
        //+1 for one stack1
        return Math.max(height(root.left),height(root.right))+1;
    }
    private static void printKDist(Node root,int k){
        if(root==null)
        return;
        if(k==0){
            System.out.print(root.key+"->");
        }else{
            printKDist(root.left, k-1);
            printKDist(root.right, k-1);
        }
    }

    private static void levelOrdertraversal(Node root){
        if(root==null)return;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            Node curr=q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
    private static void printSpiral(Node root){
         if(root==null)return;
        Queue<Node> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        boolean reverse=false;
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
            Node curr=q.poll();
            if(reverse)
                s.add(curr.key);
            else
                System.out.print(curr.key+"->");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
            }
            if(reverse){
                while(s.isEmpty()==false){
                    System.out.print(s.pop()+"->");
                }
            }
        reverse=!reverse;
        System.out.println();
        }
        }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        System.out.println(height(root));
        inorder(root);
        System.out.println();
        levelOrdertraversal(root);
        System.out.println("spiral");
        printSpiral(root);
        System.out.println();
        System.out.println("print k dist:->");
      printKDist(root, 2);
      System.out.println();
      System.out.println(isSum(root));

    }
}
class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key=k;
    }
}
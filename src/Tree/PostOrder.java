package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(postorderTraversal(root));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        st1.push(root);

        while (!st1.isEmpty()){
            root = st1.peek();
            st1.pop();
            st2.push(root);

            if(root.left!=null){
                st1.push(root.left);
            }

            if(root.right!=null){
                st1.push(root.right);
            }
        }

        while (!st2.isEmpty()){
            list.add(st2.peek().val);
            st2.pop();
        }

        return list;
    }
}

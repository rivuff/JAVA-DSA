package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerializeDeserialize {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right  = new TreeNode(5);

        System.out.println(serialize(root));
        String str = new String();
        System.out.println(deserialize(str));
    }

    private static List<String> list;
    public static String serialize(TreeNode root) {
        String str = new String();
        if(root==null){
            return str;
        }
        list = new ArrayList<>();
        PreOrder(root);


        int n = list.size();
        for(int i =0;i<n;i++){
            str+= list.get(i) + " ";

        }

        return str;

    }

    public static void PreOrder(TreeNode root){
        if(root==null){
            list.add("null");
            return;
        }

        list.add(String.valueOf(root.val));
        PreOrder(root.left);
        PreOrder(root.right);

    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if(list == null){
            return null;
        }
        Collections.reverse(list);

        return helper(list);
    }

    public static TreeNode helper(List<String> list){
        String val = list.remove(list.size()-1);

        if(val.charAt(0)== 'n'){
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(val));

        root.left = helper(list);
        root.right = helper(list);

        return root;

    }
}

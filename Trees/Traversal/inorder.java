class Solution {
    public void fun(TreeNode node,List<Integer> res){
        if(node==null)
            return;
        fun(node.left,res);
        res.add(node.val);
        fun(node.right,res);
        return;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        fun(root,res);
        return res;
    }
}
class Solution {
    public void fun(TreeNode node,List<Integer> res){
        if(node==null)
            return;
        fun(node.left,res);
        fun(node.right,res);
        res.add(node.val);
        return;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> res=new ArrayList<>();
        fun(root,res);
        return res;
    }
}
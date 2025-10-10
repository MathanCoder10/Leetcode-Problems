class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;        // Both empty
        if (p == null || q == null) return false;       // One is null
        if (p.val != q.val) return false;               // Value mismatch

        // Recurse for left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
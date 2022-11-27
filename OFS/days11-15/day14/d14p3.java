/*
class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left, right;

    public BinaryTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class d14p3 {
    public BinaryTreeNode combinedReport(BinaryTreeNode root1, BinaryTreeNode root2) {
        // implement your logic here.
        if (root1 == null || root1.data == -1)
            return root2;
        if (root2 == null || root2.data == -1)
            return root1;
        root1.data += root2.data;
        root1.left = combinedReport(root1.left, root2.left);
        root1.right = combinedReport(root1.right, root2.right);
        return root1;
    }
}
*/
// Tree Node reference
class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left, right;

    public BinaryTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class d15p3 {
    public int sumOfBinaryNums(BinaryTreeNode root) {
        // implement your code here.
        int sum = sumOfNums(root, 0);
        return sum;
    }

    int sumOfNums(BinaryTreeNode root, int n) {
        if (root == null || root.data == -1)
            return 0;
        n = n * 2 + root.data;
        if (root.left == null && root.right == null)
            return n;
        int left = sumOfNums(root.left, n);
        int right = sumOfNums(root.right, n);
        return left + right;
    }
}
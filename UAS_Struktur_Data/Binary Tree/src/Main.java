class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    // Root dari binary tree
    Node root;

    // Constructor
    BinaryTree() {
        root = null;
    }

    // Fungsi untuk menambahkan elemen baru ke binary tree
    public void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to insert a new key in
       Binary Tree */
    Node insertRec(Node root, int key) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // Fungsi untuk melakukan traversal in-order
    public void traversalOrder() {
        inOrder(root);
    }

    // Fungsi rekursif untuk traversal in-order
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }

    // Fungsi untuk mencari nilai maksimum dalam binary tree
    public int max() {
        return maxValue(root);
    }

    public int maxValue(Node root) {
        int maxValue = Integer.MIN_VALUE;
        if (root != null) {
            int leftMax = maxValue(root.left);
            int rightMax = maxValue(root.right);
            if (leftMax > rightMax) {
                maxValue = leftMax;
            } else {
                maxValue = rightMax;
            }
            if (root.key > maxValue) {
                maxValue = root.key;
            }
        }
        return maxValue;
    }

    // Fungsi untuk mencari nilai minimum dalam binary tree
    public int min() {
        return minValue(root);
    }

    public int minValue(Node root) {
        int minValue = Integer.MAX_VALUE;
        if (root != null) {
            int leftMin = minValue(root.left);
            int rightMin = minValue(root.right);
            if (leftMin < rightMin) {
                minValue = leftMin;
            } else {
                minValue = rightMin;
            }
            if (root.key < minValue) {
                minValue = root.key;
            }
        }
        return minValue;
    }

    public int size() {
        return size(root);
    }

    public int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            return (size(root.left) + 1 + size(root.right));
        }
    }
}

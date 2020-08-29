// Method to print the tree in pre-order traversal
void preOrderDFS(Node node) {
        if (node == null)
        return;

        // visit the parent node (parent of left & right children)
        System.out.print(node.data + " ");

        // recursively go to left subtree
        preOrderDFS(node.left);

        // recursively go to right subtree
        preOrderDFS(node.right);
        }

// Method to print the tree in in-order traversal
        void inOrderDFS(Node node) {
        if (node == null)
        return;

        // recursively go to left subtree
        inOrderDFS(node.left);

        // visit the parent node (parent of left & right children)
        System.out.print(node.data + " ");

        // recursively go to right subtree
        inOrderDFS(node.right);
        }

// Method to print the tree in post-order traversal
        void postOrderDFS(Node node) {
        if (node == null)
        return;

        // recursively go to left subtree
        postOrderDFS(node.left);

        // recursively go to right subtree
        postOrderDFS(node.right);

        // visit the parent node (parent of left & right children)
        System.out.print(node.data + " ");
        }
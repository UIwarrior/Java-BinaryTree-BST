int height(Node root) {
        if (root == null)
        return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (leftHeight > rightHeight)
        return leftHeight + 1;
        else
        return rightHeight + 1;
        }

// Method to traverse the elements of a tree using BFS (level-order traversal) in recursive way
        void levelOrderOrBFS() {
        int h = height(root);
        for (int i = 1; i <= h; i++)
        printNodesAtLevel(root, i, 1);
        }

// Method to print nodes at the given level
        void printNodesAtLevel (Node root, int level, int currentLevel) {
        if (root == null)
        return;
        if (level == currentLevel)
        System.out.print(root.data + " ");
        else {
        printNodesAtLevel(root.left, level, currentLevel + 1);
        printNodesAtLevel(root.right, level, currentLevel + 1);
        }
        }
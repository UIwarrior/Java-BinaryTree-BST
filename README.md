# Java-BinaryTree-BST


All the elements in a tree are called nodes. In the tree given above, the nodes are the ones with the values 1, 2, 3, 4, 5, 6, and 7.

Nodes can be of different types. The topmost node in a tree is called the root node.

From the root node, descend some other nodes. 
The root node is called a parent if there is atleast one or more node descending from it directly. 
In that case, we can call root node 1 as parent node having node 2 as a child node. 

A node which does not have any child is called a leaf node. 

A binary tree is a tree which has atmost 2 children. In other words, each node can have either 0 or 1 or 2 children.

When it comes to the vocabulary of binary tree which can have a maximum of two children, we call the child on the left side as left child and the child on the right side as the right child.


 1) The maximum number of nodes at level ‘l’ of a binary tree is 2l.
 Here level is number of nodes on path from root to the node (including root and node). Level of root is 0.
 This can be proved by induction.
 For root, l = 0, number of nodes = 20 = 1
 Assume that maximum number of nodes on level ‘l’ is 2l
 Since in Binary tree every node has at most 2 children, next level would have twice nodes, i.e. 2 * 2l
 
  
 2) Maximum number of nodes in a binary tree of height ‘h’ is 2h – 1.
 Here height of a tree is maximum number of nodes on root to leaf path. Height of a tree with single node is considered as 1.
 This result can be derived from point 2 above. A tree has maximum nodes if all levels have maximum nodes. So maximum number of nodes in a binary tree of height h is 1 + 2 + 4 + .. + 2h-1. This is a simple geometric series with h terms and sum of this series is 2h – 1.
 In some books, height of the root is considered as 0. In this convention, the above formula becomes 2h+1 – 1
 
  
 3) In a Binary Tree with N nodes, minimum possible height or minimum number of levels is  ? Log2(N+1) ?  
 This can be directly derived from point 2 above. If we consider the convention where height of a leaf node is considered as 0, then above formula for minimum possible height becomes   ? Log2(N+1) ? – 1
 
  
 4) A Binary Tree with L leaves has at least   ? Log2L ? + 1   levels
 A Binary tree has maximum number of leaves (and minimum number of levels) when all levels are fully filled. Let all leaves be at level l, then below is true for number of leaves L.
 
 
1. In a full binary tree, every node has 2 child nodes except the leaf nodes.
2. In a complete binary tree, all the levels are completely filled. 
The exception to this exists for the last level meaning that the last level may or may not be completely filled. This means that the second last level may or not have both the children.
With this exception, it is also must that the last level must have all the keys as left as possible. 
In other words, a node in the second-last level cannot have a right child without having all the nodes in its left side. 




Tree Traversal: Depth-First Search (DFS)
There are two ways of traversing a tree:

1. Depth First Search (DFS)

2. Breadth First Search (BFS)

Following points summarize this idea well:

Inorder (stage 2, stage 1, stage 3)
Preorder (stage 1, stage 2, stage 3)
Postorder (stage 2, stage 3, stage 1)

In a DFS, the nodes along the depth of the tree are traversed first. So, if there are two nodes at the same level of the tree, all the child nodes of one of these nodes are visited before visiting the other node at the same level. 
On the other hand, in a BFS, all the nodes at the same level are traversed before moving on to the nodes on the next level.


To summarise, the two types of tree data structures we discussed till now are as follows:

Binary Tree:
In this tree, every node can have at most two children. 
 

Binary Search Tree:
A Binary Seach Tree is also called an ordered binary tree because of the following properties:

1. The values of all the nodes in the left subtree are less than the root node.

2. The values of all the nodes in the right subtree are greater than the root node.

3. Each subtree in the binary search tree is itself a binary search tree.



 Searching in a BST is a log2N operation. This is because every time we move onto the next node, we
conclusively ignore the remaining half of the tree from our search space. Following was discussed
• We compare the search key with the root.
• If the search key is greater than the root, we move onto the right subtree of the root. Else we move onto the
left subtree of the root, thus ignoring one half of the tree.
• In case search key = root, we return the root itself.
• When we move onto the left or right subtree, we again compare the search key with the node we are at.
• Depending upon the search key is greater or less than the current node, we move onto the left or right of this
node and so on.
• So at every step the remaining half of the tree is ignored thus giving it a logN efficiency.


Adding a node to a BST in principle is very similar to the search operation. You learnt that while adding a node to a
BST, you first must figure out the position at which the node can be added. It was discussed that a new node can only
be added as a leaf node. So, adding a node with a given value is like finding the node with this value in the binary tree.
Since this node does not exists in the tree, you will end up at a leaf node where you can add this node. This gives a fair
intuition as to why adding a node is also a logN operation.


Next, you learnt about deleting a node from a BST. You learnt that the deletion of data from binary search
trees can be carried out in three ways:
1. If the node to be deleted is a leaf node, it is directly removed from the tree.
2. If the node has one child, the node itself is deleted, and its child node is connected to its parent
node.
3. If the node has two children, you find its successor to replace it. The successor node is the minimum
node in the right subtree or the maximum node in the left subtree.
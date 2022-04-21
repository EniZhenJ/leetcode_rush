## 二叉搜索树

### 二叉查找树（英语：Binary Search Tree），也称为 二叉搜索树、有序二叉树（Ordered Binary Tree）或排序二叉树（Sorted Binary Tree），是指一棵空树或者具有下列性质的二叉树：

- 若任意节点的左子树不空，则左子树上所有节点的值均小于它的根节点的值；
- 若任意节点的右子树不空，则右子树上所有节点的值均大于它的根节点的值；
- 任意节点的左、右子树也分别为二叉查找树；
- 没有键值相等的节点。
### 虽然二叉查找树的最坏效率是 O(n)，但它支持动态查询，且有很多改进版的二叉查找树可以使树高为 O(logn)，从而将最坏效率降至 O(logn)，如 AVL 树、红黑树等。
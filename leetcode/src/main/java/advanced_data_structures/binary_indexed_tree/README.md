## 树状数组

### 树状数组或二叉索引树（Binary Indexed Tree），又以其发明者命名为 Fenwick 树。其初衷是解决数据压缩里的累积频率的计算问题，现多用于高效计算数列的前缀和、区间和。

### 它可以以 O(logn) 的时间得到任意前缀和：

### 并同时支持在 O(logn) 时间内支持动态单点值的修改。空间复杂度 O(n)。
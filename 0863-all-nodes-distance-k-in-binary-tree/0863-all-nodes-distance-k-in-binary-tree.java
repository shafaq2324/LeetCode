class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // 1. Build a parent map to allow upward traversal
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        markParents(root, parentMap);

        // 2. BFS setup
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode, Boolean> visited = new HashMap<>();
        
        queue.offer(target);
        visited.put(target, true);
        int currentDistance = 0;

        // 3. Traverse until distance k
        while (!queue.isEmpty()) {
            if (currentDistance == k) break;
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                // Check Left
                if (node.left != null && !visited.containsKey(node.left)) {
                    visited.put(node.left, true);
                    queue.offer(node.left);
                }
                // Check Right
                if (node.right != null && !visited.containsKey(node.right)) {
                    visited.put(node.right, true);
                    queue.offer(node.right);
                }
                // Check Parent (Upward)
                TreeNode parent = parentMap.get(node);
                if (parent != null && !visited.containsKey(parent)) {
                    visited.put(parent, true);
                    queue.offer(parent);
                }
            }
            currentDistance++;
        }

        // 4. Everything left in the queue is at distance k
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll().val);
        }
        return result;
    }

    private void markParents(TreeNode root, Map<TreeNode, TreeNode> parentMap) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr.left != null) {
                parentMap.put(curr.left, curr);
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                parentMap.put(curr.right, curr);
                queue.offer(curr.right);
            }
        }
    }
}
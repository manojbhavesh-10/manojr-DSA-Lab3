package labsession_3.question2.service;

import java.util.HashSet;

public class FindSumPair {

    public Node insert(Node root, int val) {
        if(root == null) {
            return new Node(val);
        }
        if(val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);

    }

    public boolean findPair(Node root, int sum, HashSet<Integer> set) {

        if(root == null) {
            return false;
        }

        if(findPair(root.left, sum, set)) {
            return true;
        }

        if(set.contains(sum - root.val)) {
            System.out.println("Pair is found (" + (sum - root.val) + ", " + root.val + ")");
            return true;
        } else {
            set.add(root.val);
        }

        return findPair(root.right, sum, set);
    }

    public void findPairWithGivenSum(Node root, int sum) {
        HashSet<Integer> set = new HashSet<>();
        if(!findPair(root, sum, set)) {
            System.out.println("Nodes are not found ");
        }
    }
}

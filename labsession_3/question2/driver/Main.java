package labsession_3.question2.driver;

import labsession_3.question2.service.FindSumPair;
import labsession_3.question2.service.Node;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Node root = null;

        FindSumPair findSumPair = new FindSumPair();

        root = findSumPair.insert(root, 40);
        root = findSumPair.insert(root, 20);
        root = findSumPair.insert(root, 60);
        root = findSumPair.insert(root, 10);
        root = findSumPair.insert(root, 30);
        root = findSumPair.insert(root, 50);
        root = findSumPair.insert(root, 70);

        System.out.println("Inorder traversal: ");
        findSumPair.inorder(root);

        System.out.println("\nEnter sum: ");
        int sum = in.nextInt();

        findSumPair.findPairWithGivenSum(root, sum);

    }
}

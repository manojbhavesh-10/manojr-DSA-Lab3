package labsession_3.question1.driver;

import labsession_3.question1.service.BalancingBrackets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BalancingBrackets balancingBrackets = new BalancingBrackets();

        System.out.println("Enter expression: ");
        String input = in.next();

        boolean status = balancingBrackets.isBalance(input);

        if(status)
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered String do not contain Balanced Brackets");

    }
}

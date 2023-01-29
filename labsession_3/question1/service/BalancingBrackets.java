package labsession_3.question1.service;

import java.util.Stack;

public class BalancingBrackets {
    public boolean isBalance(String input) {
        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '<' || ch == '{') {
                stack.push(ch);
            }

            if(ch == ')' || ch == ']' || ch == '>' || ch == '}') {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if(ch == ')' && top != '(' ||
                   ch == ']' && top != '[' ||
                   ch == '>' && top != '<' ||
                   ch == '}' && top != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}

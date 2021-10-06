package com.company;

import java.util.Stack;

class RemoveOutermostParenthesis {
        public static void main(String[] args) {
	// write your code here
        String str = "(()())(())";
        StringBuilder sb = new StringBuilder("");
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') { //push every opening parenthesis
                st.push(ch);
                if (st.size() > 1) { //but add it to string only if stack size is > 1 because only one bracket is useless
                    sb.append(ch);
                }
            } else if (ch == ')') {
                if (st.size() > 1 && st.peek() == '(') { //add closed one if st.size()>1 and theres opening parenthesis present at top
                    sb.append(ch);
                    st.pop();
                } else if (st.size() == 1 && st.peek() == '(') { //one opening bracket in stack is of no use
                    st.pop();
                }
            }
        }
        System.out.println(sb);
    }
}
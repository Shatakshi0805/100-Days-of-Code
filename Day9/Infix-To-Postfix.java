import java.util.*;

public class Infix-To-Postfix{


    public static void main(String[] args) throws Exception {
        String exp = "a*(b-c+d)/e";

        Stack<Character> operator = new Stack<>();
        String result = "";

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result = result + ch;
            }
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operator.push(ch);
                if (exp.charAt(i+1) != '(')
                result += exp.charAt(i+1);
                result += operator.pop();
            }
            if (ch == '(') {
                while (ch != ')') {
                    if (ch != '+' || ch != '-' || ch == '*' || ch == '/') {
                        result += exp.charAt(i+1);
                    } else {//if ch == any-operator
                        
                    }

                }

            }
        }

    }

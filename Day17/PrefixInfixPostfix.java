class PrefixInfixpostfix {


public static void main(String[] args) throws Exception {
    String exp = "-+2/*6483";
    String str = "";
    Stack<Character> values = new Stack<>();

    //producing wrong result incorrect approach
    for (int i = exp.length()-1; i >= 0; i--) {
        char ch = exp.charAt(i);
        if (Character.isDigit(ch)) {
            values.push(ch);
        } else {
            str = performOperation(ch, str, values);
        }
    }
    System.out.println(str);
}

public static String performOperation(char ch, String str, Stack<Character> stack) {
    if (ch == '+') {
        if (!stack.isEmpty() && str.equals("")) {
            char ch1 = stack.pop();
            char ch2 = stack.pop();
            str = ch2 + '+' + ch1 + str;
        } else if (!str.equals("")) {
            str = stack.pop() + '+' + str;
         }

    }
    if (ch == '-') {
        if (!stack.isEmpty() && str.equals("")) {
            char ch1 = stack.pop();
            char ch2 = stack.pop();
            str = ch2 + '-' + ch1 + str;
        } else if (!str.equals("")) {
            str = str + '-' + stack.pop();
        }

    }
    if (ch == '*') {
        if (!stack.isEmpty() && str.equals("")) {
            char ch1 = stack.pop();
            char ch2 = stack.pop();
            str = ch1 + '*' + ch2 + str;
        } else if (!str.equals("")) {
            str = stack.pop() + '*' + str;
        }

    }
    if (ch == '/') {
        if (!stack.isEmpty() && str.equals("")) {
            char ch1 = stack.pop();
            char ch2 = stack.pop();
            str = ch1 + '/' + ch2 + str;
        } else if (!str.equals("")) {
            str = str + '/' + stack.pop();
        }

    }
    return str;
}

}
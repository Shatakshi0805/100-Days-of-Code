import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> st1 = new Stack<>();
    Stack<Character> st2 = new Stack<>();
    for (int i = 0; i < exp.length(); i++) {
        // char c = exp.charAt(i);
        if (exp.charAt(i) >= 0 && exp.charAt(i) <= 9) {
            st1.push(exp.charAt(i));
        } else if (exp.charAt(i) == '+' || exp.charAt(i) == '-') {
            st2.push(exp.charAt(i));
        } else if (exp.charAt(i) == '*') {
            st1.push(st1.pop() * exp.charAt(i));
            i += 1;
        } else if (exp.charAt(i) == '/') {
            st1.push(st1.pop() / exp.charAt(i));
            i += 1;
        }
    }
    
    while (!st1.isEmpty() && !st2.isEmpty()) {
        if (st2.pop() == '+') {
            st1.push(st1.pop() + st1.pop());
        } else if (st2.pop() == '-') {
            st1.push(st1.pop() - st1.pop());
        }
    }
    
    if (st2.isEmpty()) {
        int ele = st1.pop();
        System.out.println(ele);
    }
 }
}
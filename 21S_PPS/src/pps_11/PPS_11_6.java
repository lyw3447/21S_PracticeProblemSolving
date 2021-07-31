package pps_11;

import java.util.Stack;

//https://leetcode.com/problems/min-stack/

public class PPS_11_6 {
	Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void MinStack() {
        s2.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        s1.push(x);
        if (s2.peek() >= x) s2.push(x);
    }

    public void pop() {
        int tmp = s1.pop();
        if (tmp == s2.peek()) s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();
    }
}

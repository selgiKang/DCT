package day7;

import java.util.Stack;

//Stack 활용
public class Q1_Stack {
/*    public int solution(String s) {
        String[] list = s.split(" ");
        int answer = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("Z")) {
                list[i] = "0";
                list[i-1] = "0";
            }
        }
        for (int i = 0; i < list.length; i++) {
            answer += Integer.parseInt(list[i]);
        }
        return answer;
    }*/
public int solution(String s) {
    int answer = 0;
    Stack<Integer> stack = new Stack<>();

    for (String w : s.split(" ")) {
        if (w.equals("Z")) {
            stack.pop();
        } else {
            stack.push(Integer.parseInt(w));
        }
    }
    for (int i : stack) {
        answer += i;
    }
    return answer;
}
}

package day19;

import java.util.Arrays;
import java.util.Stack;

public class Q11 {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for(int num : arr){
            //peek() - 스택 맨 위 요소 반환, 큐에서는 맨 앞 요소 반환 / 스택이나 큐에서 제거되지는 않음.
            if(stack.empty() || stack.peek() != num){
                stack.push(num);
            }
        }

        int[] result = new int[stack.size()];
        for(int i = stack.size() -1; i >= 0; i--){
            //stack에서 제거하고 반환
            result[i] = stack.pop();
        }
        return result;
    }
}

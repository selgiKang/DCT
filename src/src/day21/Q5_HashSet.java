package day21;

import java.util.Arrays;
import java.util.HashSet;

public class Q5 {
    public int[] solution(int[] numbers){
        HashSet<Integer> numArr = new HashSet<>();


        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                numArr.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[numArr.size()];
        int i = 0;
        for(int n : numArr){
            answer[i] = n;
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }
}

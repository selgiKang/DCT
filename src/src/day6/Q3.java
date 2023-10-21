package day6;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public int[] solution(int[] numbers) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            result.add(numbers[i]*2);
        }

        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

package day5;

import java.util.ArrayList;
import java.util.List;

public class Q4 {
    public int[] solution(int[] num_list, int n){
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<n;i++){
            result.add(num_list[i]);
        }
        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

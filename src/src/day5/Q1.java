package day5;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> numList = new ArrayList<>();
        for(int i=n-1;i<num_list.length;i++){
            numList.add(num_list[i]);
        }
        int[] result = numList.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}

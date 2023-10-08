package day3;

import java.util.ArrayList;
import java.util.List;

public class Q8 {
    public int[] solution(int[]arr, int[][] intervals){
        List<Integer> result_1 = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            for(int j=intervals[i][0];j<=intervals[i][1];j++){
                result_1.add(arr[j]);
            }
        }
        int [] answer = result_1.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

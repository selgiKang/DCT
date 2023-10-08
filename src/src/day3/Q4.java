package day3;

import java.util.ArrayList;
import java.util.List;

public class Q4 {
    public int[] solution(int start, int end_num){
        List<Integer> numList = new ArrayList<>();
        for(int i=0;i<=(start-end_num);i++){
            if((start-i)!= end_num){
                numList.add(start-i);
            }
        }
        numList.add(end_num);
        int[] answer = numList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

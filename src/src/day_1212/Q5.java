package day_1212;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
    public int[] solution(int[] numlist, int n){
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for(Integer num : numlist){
            list.add(num);
        }

        int len = list.size();
        for(int i = 0; i < len; i++){
            int minDif = 10000;
            int minNum = 0;

            for(int j = 0; j < list.size(); j++){
                if(Math.abs(minDif) > Math.abs(list.get(j)-n)){
                    minNum = list.get(j);
                    minDif = Math.abs(list.get(j) - n);
                }else if(Math.abs(minDif) == Math.abs(list.get(j)-n)){
                    if(minNum < list.get(j)){
                        minNum = list.get(j);
                    }
                }
            }
            answer.add(minNum);
            list.remove(Integer.valueOf(minNum));
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

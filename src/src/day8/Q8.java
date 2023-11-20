package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8 {
    public int[] solution(int n){

        List<Integer> numList = new ArrayList<>();
        for(int i = 1; i <= n ; i++){
            if(n%i == 0){
                numList.add(i);
            }
        }

        int[] result = numList.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(result);
        return result;
    }
}

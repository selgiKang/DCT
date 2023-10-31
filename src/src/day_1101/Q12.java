package day_1101;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q12 {
    public int[] solution(int n){
        HashSet<Integer> numList = new HashSet<>();
        int num = n;
        for(int i = 2; i <= n; i++){
            if(num % i == 0){
                numList.add(i);
                num = num/i;
                i -= 1;
            }
        }
        int[] answer = numList.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }

}

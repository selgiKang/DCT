package day_1129;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q10 {
    public int[] solution(int n, int[] numlist){
        List<Integer> numarr = new ArrayList<>();
        for(int i : numlist){
            if(i%n == 0){
                numarr.add(i);
            }
        }

        return numarr.stream().mapToInt(Integer::intValue).toArray();
    }
}

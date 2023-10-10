package day3;

import java.util.Arrays;

public class Q10 {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) { //i = 인덱스
            if (i % 2 == 0) {                 //인덱스가 짝수면
                arr = Arrays.copyOfRange(arr,0,query[i]+1);
            }else{
               arr = Arrays.copyOfRange(arr,query[i],arr.length);
            }
        }
        return arr;
    }
}

package day18;

import java.util.Arrays;

public class Q10 {
    public int[] solution(int[] arr){
        int[] answer = {};
        if(arr.length == 1){
            return new int[]{-1};
        }

        int minValue = Arrays.stream(arr).min().getAsInt();

        // 최소값을 제외한 새로운 배열 생성
        int[] resultArray = Arrays.stream(arr)
                .filter(num -> num != minValue)
                .toArray();

        return resultArray;
    }
}

package day_1212;

import java.util.Arrays;

public class Q1 {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int i = 1;

        //sides[1]이 최장일 경우
        while(i < sides[1]){
            //만약 두 변 플러스가 최장보다 크면
            if(i + sides[0] > sides[1]){
                answer++;
            }
            i++;
        }
        // i가 sides[0]+sides[1]보다 작고
        while(i < sides[0]+sides[1]){
            //i가 최장
            if(i >= sides[1]){
                answer++;
            }
            i++;
        }

        return answer;
    }
}

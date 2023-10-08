package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
    public int[] solution(int n, int k){
        ArrayList<Integer> s = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%k==0){
                s.add(i);
            }
        }
                                //Integer를 int로 변경
        int[] answer = s.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

package day20;

import java.util.Arrays;

public class Q2 {
    public int solution(int[] d, int budget){
        Arrays.sort(d);
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i < d.length; i++){
            if(sum + d[i] <= budget){
                sum += d[i];
                cnt++;
            }
        }
        return cnt;
    }
}

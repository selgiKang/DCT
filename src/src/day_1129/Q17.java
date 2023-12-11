package day_1129;

import java.util.Arrays;

public class Q17 {
    public int solution(int[] array) {

        int cnt = 0;

        String num = Arrays.toString(array);
        String[] strArr = num.split("");

        for(String i : strArr){
            if(i.equals("7")){
                cnt ++;
            }
        }

        return cnt;
    }
}

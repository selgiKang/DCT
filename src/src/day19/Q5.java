package day19;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Q5 {
    public String solution(String s){
       String answer = "";
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for(String a : str){
            answer += a;
        }
        return answer;
    }
}

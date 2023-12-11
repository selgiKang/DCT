package day_1129;

import java.util.Arrays;
import java.util.stream.Stream;

public class Q16 {
    public String solution(String my_string){
        String result = my_string.toLowerCase();
        String[] strArr = result.split("");

        Arrays.sort(strArr);
        return String.join("", strArr);
    }
}


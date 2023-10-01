package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q34 {
    public String[] solution(String my_string) {
        List<String> word = new ArrayList<>();

        word.add(my_string);
        for(int i=1;i<my_string.length();i++){
            word.add(my_string.substring(my_string.length()-i,my_string.length()));
        }
        String[] answer = new String[word.size()];
        //배열에 리스트 추가
       word.toArray(answer);
       //알파벳 순서대로 정렬
        Arrays.sort(answer);

        return answer;
    }
}

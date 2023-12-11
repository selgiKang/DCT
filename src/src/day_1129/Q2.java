package day_1129;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public String[] solution(String[] names){
        List <String> sb = new ArrayList<>();
        for(int i = 0; i < names.length; i += 5){
            sb.add(names[i]);
        }

        String[] answer = sb.toArray(new String[sb.size()]);

        return answer;
    }
}

package day21;

import java.util.*;

public class Q1 {
    public String[] solution(String[] strings, int n){
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();

        for(int i = 0; i < strings.length; i++){
            arr.add(""+strings[i].charAt(n)+strings[i]);
        }

        Collections.sort(arr);
        answer = new String[arr.size()];
        for(int i = 0; i < arr.size();i++){
            answer[i] = arr.get(i).substring(1);
        }
        return answer;
    }
}

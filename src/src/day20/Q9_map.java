package day20;

import java.util.HashMap;
import java.util.Map;

public class Q9_map {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastIndexMap = new HashMap<>();

        // 각 문자의 가장 최근 인덱스를 저장
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (lastIndexMap.containsKey(currentChar)) {
                answer[i] = i - lastIndexMap.get(currentChar);
            } else {
                answer[i] = -1;
            }
            lastIndexMap.put(currentChar, i);
        }

        return answer;
    }
}

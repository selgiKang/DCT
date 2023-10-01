package day2;

import java.util.ArrayList;
import java.util.List;

public class Q31 {
        public int[] solution(String[] intStrs, int k, int s, int l) {
            List<Integer> answer = new ArrayList<>();
            for (int i = 0; i < intStrs.length; i++) {
                if (intStrs[i].length() >= s + l) {
                    try {
                        int string = Integer.parseInt(intStrs[i].substring(s, s + l));
                        if (string > k) {
                            answer.add(string);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("올바른 숫자 형식이 아닙니다: " + intStrs[i].substring(s, s + l));
                    }
                }
            }
            int [] result = new int[answer.size()];
            for(int j=0;j<answer.size();j++){
                result[j] = answer.get(j);
            }
            return result;
        }
}


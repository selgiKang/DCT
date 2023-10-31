package day_1101;


import java.util.Arrays;

public class Q10 {
    public int[] solution(String my_string){
        StringBuilder result = new StringBuilder();
        //정규표현식
        //String intStr= my_string.replaceAll("[^0-9]", "");
        // [^0-9] == [^\\d]

        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(48 <= ch && ch <= 57){
                int numericValue = Character.getNumericValue(ch);
                result.append(numericValue);
            }
        }

        int[] answer = new int[result.length()];
        for(int i = 0; i < answer.length ; i++){
            answer[i] = Integer.parseInt(String.valueOf(result.charAt(i)));
        }

        Arrays.sort(answer);
        return answer;
    }
}

package day3;

public class Q1_1 {
    public int[] solution(String my_string) {
        int answer [] = new int[52];
        for(int i=0;i<answer.length;i++){
            answer[i]=0;
        }
        for(char ch : my_string.toCharArray()){
            //아스키 코드 이용해서 배열 위치 찾기. 소문자는 아스키코드 97부터이므로 6을 추가로 뺌
            answer[ch- 'A' - (Character.isLowerCase(ch)?6:0)]++;
        }
        return answer;
    }
}

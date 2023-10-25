package day_1027;

public class Q7 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        int k = answer.length-1;
        while(k >= 0){
            answer[k] = 1;
            k--;
        }
        for (int i = 0; i < emergency.length; i++) {
            for (int j = i + 1; j < emergency.length; j++) {
                if(emergency[i] > emergency[j]){
                    answer[j]++;
                }else{
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}

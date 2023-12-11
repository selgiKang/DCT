package day_1212;

public class Q6 {
    public int[] solution(int[][] score){
        float[] avg = new float[score.length];
        int[] answer = new int[score.length];

        for(int i = 0; i < score.length; i++){
            avg[i] = (float) (score[i][0] + score[i][1]) /2;
        }

        for(int i = 0; i < avg.length; i++){
            int num = 1;
            for(int j = 0; j < avg.length; j++){
                if(avg[i] < avg[j]){
                    num++;
                }
            }
            answer[i] = num;
        }
        return answer;
    }
}

package day_1129;

public class Q6 {
    public int[] solution(int[] array) {
        int max = 0;
        int index = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }

        int[] answer = {max, index};
        return answer;
    }
}

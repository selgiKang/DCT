package day_1129;

public class Q22 {
    public int solution(int[] numbers){
        int max = -10000000;
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers.length == 2){
                    max = numbers[0] * numbers[1];
                }
                if(numbers[i] * numbers[j] > max){
                    max = numbers[i] * numbers[j];
                }
            }
        }
        return max;
    }
}

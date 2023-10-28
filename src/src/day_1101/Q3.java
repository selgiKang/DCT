package day_1101;

public class Q3 {
    public int solution(int[] numbers, int k){
        int j = 0;
        int result = 0;
        for(int i = 0; i < k; i++){
            if(j >= numbers.length){
                j = j - numbers.length;
            }
            result = numbers[j];
            j = j+2;
        }
        return result;
    }
}

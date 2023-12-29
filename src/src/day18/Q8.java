package day18;

public class Q8 {
    public int solution(int[] numbers){
        int[] numArr = new int[10];
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            numArr[numbers[i]] += 1;
        }

        for(int i = 0; i < numArr.length; i++){
            if(numArr[i] == 0){
                sum += i;
            }
        }
        return sum;
    }
}

package day_1129;

public class Q1 {
    public int solution(int[] num_list) {

        int sumOdd = 0;
        int sumEven = 0;

        for(int i = 1; i <= num_list.length; i++){
            if(i%2 == 0){
                sumEven += num_list[i-1];
            }else{
                sumOdd += num_list[i-1];
            }
        }

        return Math.max(sumEven, sumOdd);
    }
}

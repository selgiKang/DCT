package day8;

public class Q1 {

    //Math.abs = 절대값 반환
    public int solution(int[] array, int n){
        int num = 0;
        int min = 999;
        int result = -1;

        for(int n1: array){
            if(n1 - n < 0){
                num = -(n1 - n);
            }else{
                num = n1 - n;
            }
            if(num < min){
                min = num;
                result = n1;
            }else if(num == min){
                if(n1 < result){
                    result = n1;
                }
            }
        }
        return result;
    }
}

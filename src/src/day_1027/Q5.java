package day_1027;

import java.util.Arrays;

public class Q5 {
    public int[] solution(int[] number, int num1, int num2){
        return Arrays.copyOfRange(number,num1,num2+1);
    }
}

package day_1027;

import java.math.BigInteger;

public class Q12 {
    public int solution(int balls, int share){
        int a = 1;
        if(balls == share){
            return a;
        }
        // 변수 선언
        BigInteger num1 = new BigInteger("1");

        for(int i = 0;i<share ; i++){
            BigInteger num2 = new BigInteger(Integer.toString(1+i));
            BigInteger num3 = new BigInteger(Integer.toString(balls - i));
            // 곱하기
            num1 = num1.multiply(num3);
            // 나누기
            num1 = num1.divide(num2);
        }
        //형변환
        a = num1.intValue();
        return a;
    }
}

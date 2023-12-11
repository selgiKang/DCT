package day_1129;

public class Q11 {
    public int solution(int n){
        String num = Integer.toString(n);
        String[] numArr = num.split("");
        int sum = 0;

        for(int i=0; i < numArr.length; i++){
            sum += Integer.parseInt(numArr[i]);
        }

        return sum;
    }
}

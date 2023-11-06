package day7;

public class Q4 {
    public int solution(int[] sides){
        int max = 0;
        int sum = 0;

        //Arrays.sort로 정렬해도 됨

        for(int i = 0; i < sides.length; i++){
            if(sides[i] > max){
                max = sides[i];
            }
            sum += sides[i];
        }

        if(sum-max > max){
            return 1;
        }else{
            return 2;
        }
    }
}

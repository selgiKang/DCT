package day_1101;

//Arrays.sort로 애초에 정렬해서 뒤에 2개를 곱해도 된다.
public class Q7 {
    public int solution(int[] numbers){
        int max = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length;j++){
                int div = numbers[i]*numbers[j];
                if(div > max){
                    max = div;
                }
            }
        }

        return max;
    }
}

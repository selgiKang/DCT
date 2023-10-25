package day_1027;

//약수 구하기
public class Q8_divisor {
    public int solution(int n){
        int answer = 0;
        for(int i = 1; i <= n; i++){
           if(n % i == 0){
               answer += 1;
           }
        }
        return answer;
    }
}

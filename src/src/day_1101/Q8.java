package day_1101;

public class Q8 {
    public int solution(int n ){
        if(n <= 1) return 1;

        int div = 1;
        int answer = -1;

        for(int i = 1; i <= n; i++){
            div *= i;
            if(div == n){
                answer = i;
                break;
            }
            else if(div > n){
                answer = i-1;
                break;
            }
        }
        return answer;
    }
}

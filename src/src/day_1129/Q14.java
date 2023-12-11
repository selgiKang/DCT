package day_1129;

//Math.qart()
public class Q14 {
    public int solution(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                int j = n / i;
                if(i == j){
                    return 1;
                }
            }
        }
        return 2;
    }
}

package day22;

public class Q5{
    // 제한수치 limit / power 제한 초과한 기사가 가진 공격력
    public int solution(int number, int limit, int power){

        int sum = 0;

        for(int i = 1; i <= number; i++){

            int cnt = getNumCount(i);

            if(cnt > limit){
                sum += power;
            }else{
                sum += cnt;
            }
        }
        return sum;
    }

    private static int getNumCount(int num){
        int cnt = 0;
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                if(num / i == i){
                    cnt++;
                }else{
                    cnt += 2;
                }
            }
        }
        return cnt;
    }
}

package day19;

public class Q6 {
    public long solution(int price, int money, int count){
        long sum = 0;
        long sumMoney = price;

        for(int i = 0; i < count; i++){
            sum += sumMoney;
            sumMoney += price;
        }
        long answer = money - sum;
        return answer >= 0 ? 0 : -answer;
    }
}

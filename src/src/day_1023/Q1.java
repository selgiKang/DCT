package day_1023;

// 큰 숫자부터 if문 잡으면 더 간결하게 가능
public class Q1 {
    public int solution(int price){
        double reusltPrice = 0;
        if(price >= 100000 && price < 300000){
            reusltPrice = price * 0.95;
        }else if(price >= 300000 && price < 500000){
            reusltPrice = price * 0.9;
        }else if(price >= 500000){
            reusltPrice = price * 0.8;
        }else{
            reusltPrice = price;
        }
        int answer = (int)reusltPrice;
        return answer;
    }
}

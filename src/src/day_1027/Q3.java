package day_1027;

public class Q3 {
    public int solution(int n, int k){
        int service = 0;
        if(n >= 10){
            service = n/10;
        }
        if(k>0){
            k -= service;
        }
        int answer = n*12000 + k*2000;
        return answer;
    }
}

package day17;

public class Q7 {
    public long solution(long n){
        for(int i = 1; i <= n; i++){
            if(n == Math.pow(i, 2)){
                return (long)Math.pow(i+1,2);
            }
        }
        return -1;
    }
}

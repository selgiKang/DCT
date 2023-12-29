package day18;

public class Q4 {
    public int solution(long num) {
        int count = 0;

        if(num == 1){
            return 0;
        }

        return anInt(num, count);
    }

    private int anInt(long n, int count){
        if(count >= 500){
            return -1;
        }
        if(n == 1){
            return count;
        }
        count++;

        if(n % 2 == 0){
            return anInt(n / 2, count);
        }else{
            return anInt(n * 3 + 1, count);
        }

    }
}

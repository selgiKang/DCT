package day_1027;

public class Q4 {
    public int solution(int n) {
        int sum = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                sum += n;
            }
            n--;
        }
        return sum;
    }
}

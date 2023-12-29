package day17;

public class Q3 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = 0;
        int i = 0;

        while (i != n) {
            answer[i] = x + num;
            num += x;
            i++;
        }

        return answer;
    }
}

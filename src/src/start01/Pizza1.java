package start01;

public class Pizza1 {
    public int solution(int n) {
        int pice = -1;
        for (int i = 1; i <= n; i++) {
            if (i % n == 0) {
                pice = i;
                break;
            }
        }
        return pice % 7 != 0 ? pice / 7 + 1 : pice / 7;
    }
}

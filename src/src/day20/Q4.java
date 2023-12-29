package day20;

public class Q4 {
    public int solution(String t, String p) {
        int cnt = 0;
        int pLen = p.length();
        long num = Long.parseLong(p);

        for (int i = 0; i <= t.length()-pLen; i++) {

            if (Long.parseLong(t.substring(i, i + pLen)) <= num) {
                cnt++;
            }
        }

        return cnt;
    }
}

package day17;

public class Q6 {
    //StringBuilder 써서 reverse()로 역순 만들어 넣어도 됨.
    public int[] solution(long n) {
        String sn = String.valueOf(n);
        int[] answer = new int[sn.length()];
        int i = 0;

        while (i < sn.length()) {
            answer[i] = Integer.parseInt(sn.substring(sn.length() - i - 1, sn.length() - i));
            i++;
        }
        return answer;
    }
}

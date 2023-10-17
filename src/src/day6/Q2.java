package day6;

public class Q2 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int top = numer1 * denom2 + numer2 * denom1;
        int bottom = denom1 * denom2;

        int a = top;
        int b = bottom;
        if(b>a){
            int emp = b;
            b = a;
            a = emp;
        }

        int result = gcd(a, b);

        int numer = top / result;
        int denom = bottom / result;

        int[] answer = {numer, denom};
        return answer;

    }

    public static int gcd(int a, int b) {


        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }


}

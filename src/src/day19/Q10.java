package day19;

public class Q10 {
    public int[] soluion(int n, int m){
        int[] answer = new int[2];

        if(m > n){
            int temp = m;
            m = n;
            n = temp;
        }

        int result = gcd(n,m);
        answer[0] = result;
        answer[1] = (n * m) / result;

        return answer;
    }

    public int gcd(int n, int m){
        if(n % m == 0){
            return m;
        }
        return gcd(m, n % m);
    }
}

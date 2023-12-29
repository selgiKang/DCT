package day_1212;

public class Q10 {
 /*   public int solution(int i, int j, int k){
        int answer = 0;
        String kStr = String.valueOf(k);

        int[] num = new int[j - i + 1];
        for (int n = 0; n < num.length; n++) {
            num[n] = i + n;
        }

        for (int m = 0; m < num.length; m++) {
            String s = String.valueOf(num[m]);

            String[] sList = s.split("");

            for (String string : sList) {
                if (string.equals(kStr)) {
                    answer++;
                }
            }
        }
        return answer;
    }*/

    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n=i; n<=j; n++){
            int num = n;
            while(num != 0){
                if(num % 10 == k){
                    answer++;
                }
                num /= 10;
            }
        }
        return answer;
    }
}

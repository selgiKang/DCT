package day_1212;

public class Q9 {
    public int solution(String A, String B){
        int answer = 0;

        String im = A;
        for(int i = 0; i < A.length(); i++){
            if(im.equals(B)){
                return answer;
            }
            String a = im.substring(im.length()-1);
            im = a + im.substring(0,im.length()-1);
            answer++;
        }
        return -1;
    }
}

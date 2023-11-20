package day8;

public class Q3 {
    public String solution(String cipher, int code){
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < cipher.length()/code+1; i++){
            int num = i * code;
            sb.append(cipher.charAt(num-1));
        }
        return sb.toString();
    }
}

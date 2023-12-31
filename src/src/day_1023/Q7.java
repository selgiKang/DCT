package day_1023;

public class Q7 {
/*    public String solution(String my_string, int n){
        String answer = "";
        for(int i = 0;i<my_string.length();i++){
            for(int j = 0; j < n; j++){
                answer = answer + (my_string.substring(i,i+1));
            }
65        }
        return answer;
    }*/
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}

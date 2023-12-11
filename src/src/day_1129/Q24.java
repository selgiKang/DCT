package day_1129;

public class Q24 {
    public int solution(String my_string){
        int answer = 0;
        String[] str = my_string.replaceAll("[a-zA-Z]"," ").split(" ");

        for(String s : str){
            if(!s.equals("")){
                answer += Integer.parseInt(s);
            }
        }

        return answer;
    }
}

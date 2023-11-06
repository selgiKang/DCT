package day7;

public class Q3 {
    public String solution(String my_string){
        String answer = "";

        for(int i = 0; i < my_string.length(); i++){
            //indexOf = 주어진 문자열이 시작되는 인덱스 값 리턴
           if(my_string.indexOf(my_string.charAt(i))==i){
               answer += my_string.charAt(i);
           }
        }
        return answer;
    }
}

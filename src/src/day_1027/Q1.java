package day_1027;

public class Q1 {
    public String solution(String my_string, String letter){
        StringBuilder sb = new StringBuilder();
        for(char answer : my_string.toCharArray()){
            if(answer != letter.charAt(0)){
                sb.append(answer);
            }
        }
        return sb.toString();
    }

    //my_string.replace(letter,"");
}

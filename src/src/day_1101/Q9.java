package day_1101;

public class Q9 {
    public String solution(String my_string){
     /*   StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            if(c == 97 || c == 105 || c == 101 || c == 111 || c == 117){
                sb.append("");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();*/

        return my_string.replaceAll("a | e | i | o | u", "");
    }


}

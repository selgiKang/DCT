package day2;

public class Q38 {
    public String solution(String my_string, int s, int e) {
            String first = my_string.substring(0,s);
            //reverse = 문자열 뒤집는 것(역순)
            String list = new StringBuilder(my_string.substring(s,e+1)).reverse().toString();
            String listlast = my_string.substring(e+1);


            String result = first + list + listlast;
            return result;
    }
}

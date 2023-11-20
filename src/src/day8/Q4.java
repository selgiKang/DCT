package day8;

public class Q4 {
    //대문자 A - 65 / 소문자 a - 97
    //Chracter.isUpperCase(c);
    public String solution(String my_string) {

        StringBuilder sb = new StringBuilder();

        for (char n : my_string.toCharArray()) {
            if (n < 97) {
                n = (char) (n + 32);
            } else {
                n = (char) (n - 32);
            }
            sb.append(n);
        }
        return sb.toString();
    }
}

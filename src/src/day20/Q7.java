package day20;

public class Q7 {
    public String solution(String s, int n){
        StringBuilder sb = new StringBuilder();

        for(char a : s.toCharArray()) {
            if (Character.isUpperCase(a)) {
                char en = (char) ('A' + (a - 'A' + n) % 26);
                sb.append(en);
            } else if (Character.isLowerCase(a)) {
                char en = (char) ('a' + (a - 'a' + n) % 26);
                sb.append(en);
            } else {
                sb.append(a);
            }

        }
        return sb.toString();
    }
}

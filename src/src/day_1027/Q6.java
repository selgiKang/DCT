package day_1027;

public class Q6 {
    public String solution(int age){
        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(age);
        String[] arr = s.split("");
        for(String value : arr){
            //아스키코드 97
            sb.append((char)((Integer.parseInt(value))+97));
        }
        return sb.toString();
    }
}

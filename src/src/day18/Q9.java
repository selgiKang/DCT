package day18;

public class Q9 {
    public String solution(String phone_number) {

        String answer = "";
        String front = phone_number.substring(0, phone_number.length()-4);
        String back = phone_number.substring(phone_number.length()-4);
        for(int i = 0; i < front.length(); i++){
            answer += "*";
        }
        answer += back;
        return answer;
    }
}

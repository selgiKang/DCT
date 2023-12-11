package day_1129;

public class Q7 {
    public int solution(String my_string) {
        String[] list = my_string.split(" ");
        int answer = Integer.parseInt(list[0]);

        for(int i = 1; i < list.length; i++){
            if(list[i].equals("+")){
                answer += Integer.parseInt(list[i+1]);
            }else if(list[i].equals("-")){
                answer -= Integer.parseInt(list[i+1]);
            }
        }
        return answer;
    }
}

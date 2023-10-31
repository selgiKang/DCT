package day_1101;

public class Q11 {
    public int solution(String my_string){
       String[] numList = my_string.replaceAll("[A-Z|a-z]","").split("");
        int sum = 0;
        for(int i = 0; i < numList.length; i++){
            sum += Integer.parseInt(numList[i]);
        }
        return sum;
    }
   /* public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]","");

        for(char ch : str.toCharArray()) {
            answer += Character.getNumericValue(ch);
        }

        return answer;
    }*/
}

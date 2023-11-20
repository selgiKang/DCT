package day8;

public class Q7 {
    public String solution(String s){

        StringBuilder sb = new StringBuilder();
        int[] numList = new int[26];

        for(char n : s.toCharArray()){
            numList[n-97] = numList[n-97] + 1;
        }

        for(int i = 0; i < numList.length; i++){
            if(numList[i] == 1){
                sb.append((char)(i+97));
            }
        }

        return sb.toString();
    }
}

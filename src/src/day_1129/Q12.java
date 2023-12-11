package day_1129;

import java.util.ArrayList;
import java.util.List;

public class Q12 {
    public String[] solution(String[] quiz){

        List<String> result = new ArrayList<>();

        for(int i = 0; i < quiz.length; i++){
            String[] nList = quiz[i].split(" ");

            if(nList[1].equals("+")){
               int n = Integer.parseInt(nList[0])+ Integer.parseInt(nList[2]);
               int answer = Integer.parseInt(nList[4]);
               if(n == answer){
                   result.add("O");
               }else{
                   result.add("X");
               }
            } else if (nList[1].equals("-")) {
                int n = Integer.parseInt(nList[0]) - Integer.parseInt(nList[2]);
                int answer = Integer.parseInt(nList[4]);
                if(n == answer){
                    result.add("O");
                }else{
                    result.add("X");
                }
            }
        }

        return result.toArray(new String[0]);
    }
}

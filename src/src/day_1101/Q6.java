package day_1101;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public int solution(int n){
        List<Integer> result = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for(int i = 1; i <= n; i++){
          for(int j = 1; j <= i; j ++){
              if(i % j==0){
                  result.add(j);
              }
          }
          if(result.size() >= 3){
              answer.add(i);
          }
          result.clear();
        }
        return answer.size();
    }
}

import java.util.ArrayList;
import java.util.List;

//런타임 오류

public class Q22 {
    public int[] solution(int l,int r){
        int[] answer;
        List<Integer> resultList = new ArrayList<>();
        int i = l;
        while(i<=r){
            if(numbers(i)){
                resultList.add(i);
            }
            i++;
        }
        if(resultList.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }else{
            answer = new int[resultList.size()];
            for(i=0;i<resultList.size();i++){
                answer[i] = resultList.get(i);
            }
            return answer;
        }
    }

    private boolean numbers(int num){
        while(num > 0){
            int result = num%10;
            if(result != 0 && result != 5){
                return false;

            }
            result /=10;
        }
        return true;
    }
}

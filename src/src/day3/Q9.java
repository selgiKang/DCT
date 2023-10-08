package day3;

import java.util.ArrayList;
import java.util.List;

public class Q9 {
    public int[] solution(int[] arr) {
        int start = -1; //0으로 했을 때 오류남. -1이 '찾지 못했음' 또는 '아직 값이 설정되지 않음'을 뜻한다 함.
        int last = -1;
        List<Integer> listNum = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] == 2) {
                last = j;
                break;
            }
        }
        if (start != -1 && last != -1) {
            for (int i = start; i <= last; i++) {
                listNum.add(arr[i]);
            }
        } else if(start != -1){
            listNum.add(arr[start]);
        }else{
            listNum.add(-1);
        }
        int[] answer = listNum.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Q23 {
    public int[] solution(int start_num, int end_num) {
        List<Integer> result = new ArrayList<>();
        int i = start_num;
        while (i <= end_num) {
            result.add(i);
            i += 1;
        }
        int[] answer = new int[result.size()];
        for (int j = 0; j < result.size(); j++) {
            answer[j] = result.get(j);
        }
        return answer;
    }
}

package start01;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int i = 0;
        while (i <= n) {
            if (i % 2 != 0) {
                answer.add(i);
            }
            i++;
        }
        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

}

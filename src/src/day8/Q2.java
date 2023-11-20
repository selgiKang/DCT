package day8;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public int solution(int order){
        int num = 0;
        List<Integer> numArr = new ArrayList<>();
        while(order > 0){
            numArr.add(order%10);
            order /= 10;
        }

        for (Integer i : numArr) {
            if (i == 3 || i == 6 || i == 9) {
                num += 1;
            }
        }
        return num;
    }
}

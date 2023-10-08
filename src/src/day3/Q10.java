package day3;

import java.util.ArrayList;
import java.util.List;

public class Q10 {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < query.length; i++) {
            int index = query[i];
            if (i % 2 == 0) {
                for (int j = index + 1; j < arr.length; j++) {
                    arr[j - 1] = arr[j];
                }
            } else {
                for (int j = index; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }

        for (int i = 0; i < arr.length - query.length; i++) {
            result.add(arr[i]);
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}

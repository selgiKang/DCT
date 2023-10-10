package day5;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public int[] solution(int[] num_list, int n){
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for(int i=n;i<num_list.length;i++){
            arr1.add(num_list[i]);
        }
        for(int i=0;i<n;i++){
            arr2.add(num_list[i]);
        }
        arr1.addAll(arr2);
        int[] result = arr1.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}

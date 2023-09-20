import java.util.Arrays;

public class Q20 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] arr1 = new int[queries.length];
        Arrays.fill(arr1, Integer.MAX_VALUE);
        for(int i = 0; i < queries.length; i++) { // 쿼리의 길이만큼 반복
            for (int j = queries[i][0]; j <= queries[i][1]; j++){
                // 각 쿼리의 s <= i <= e의 조건을 for문을 이용해 충족
                if( arr[j] > queries[i][2]) { // i > k의 조건
                    if(arr1[i] > arr[j]) // 가장 작은 arr[i] 조건
                        arr1[i] = arr[j];
                }
            }
            if(arr1[i] == Integer.MAX_VALUE)
                arr1[i] = -1;
        }
        return arr1;
    }
}

/*
    Arrays.fill() - 배열의 모든 값을 같은 값으로 초기화
    Integer.MAX_VALUES - 32비트로 표현할 수 있는 최대 양의 정수값(2147483647)
*/

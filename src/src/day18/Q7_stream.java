package day18;

import java.util.Arrays;

public class Q7_stream {
    public int[] solution(int[] array, int divisor) {
        // divisor로 나누어 떨어지는 값을 저장할 동적 배열
        int[] resultArray = Arrays.stream(array)
                .filter(num -> num % divisor == 0)
                .sorted()
                .toArray();

        // 나누어 떨어지는 값이 없으면 -1을 포함한 배열 반환
        return (resultArray.length == 0) ? new int[]{-1} : resultArray;
    }
}

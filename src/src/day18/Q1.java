package day18;

import java.util.Arrays;
import java.util.Collections;

public class Q1 {
    public long solution(long n) {
        // long을 문자열로 변환
        String numStr = String.valueOf(n);

        // 문자열을 문자 배열로 변환
        char[] charArray = numStr.toCharArray();

        // 문자 배열을 내림차순으로 정렬
        Arrays.sort(charArray);
        // 역순으로 정렬하여 큰 것부터 작은 순으로 정렬
        char[] reversedArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            reversedArray[i] = charArray[charArray.length - 1 - i];
        }

        // 문자 배열을 다시 문자열로 변환하여 long으로 파싱
        long answer = Long.parseLong(new String(reversedArray));

        return answer;
    }
}

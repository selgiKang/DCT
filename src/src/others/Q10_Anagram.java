package others;

import java.util.Arrays;

public class Q10_Anagram {
    public static boolean checkAnagram(String str1, String str2) {
        //공백 제거
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        //미리 문자열의 길이가 같은지 계산하여 1차적인 결과 수행
        if (str1.length() != str2.length())
            return false;


        // 두 단어다 소문자로 변환 후 char 형식으로 변환해주는 toCharArray() 메서드 활용
        char[] char1 = str1.toLowerCase().toCharArray();
        char[] char2 = str2.toLowerCase().toCharArray();

        // Arrays.sort()를 이용하여 정렬을 한다.
        Arrays.sort(char1);
        Arrays.sort(char2);

        // String 비교를 위해 character 배열을 String으로 변환한다.
        String _str1 = new String(char1);
        String _str2 = new String(char2);

        // 비교한 결과를 리턴한다.
        return _str1.equals(_str2);
    }

}

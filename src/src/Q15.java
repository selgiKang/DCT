public class Q15 {

    class Solution {
        public int solution(int[] num_list) {
            int result = 0;
            String a = null;
            String b = null;

            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 == 0) {
                    String r = String.valueOf(num_list[i]);
                    if (a != null) {
                        a += r;
                    } else {
                        a = r;
                    }

                } else {
                    String r = String.valueOf(num_list[i]);
                    if (b != null) {
                        b += r;
                    } else {
                        b = r;
                    }
                }
            }
            assert a != null;
            assert b != null;
            result = Integer.parseInt(a) + Integer.parseInt(b);
            return result;
        }
    }

    /*assert : 디버깅 모드에서 개발자가 오류가 생기면 치명적일 것이라는 곳에 심어 놓는 에러 검출용 코드*/
}

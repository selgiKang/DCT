
//다시 풀어보기
public class Q30 {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        char temp;
        for(int j = 0; j < queries.length; j++){
            for(int i = queries[j][0]; i <= (queries[j][0]+queries[j][1]) / 2; i++) {
                temp = arr[i];
                arr[i] = arr[queries[j][0]+queries[j][1]-i];
                arr[queries[j][0]+queries[j][1]-i] = temp;
            }
        }
        return String.valueOf(arr);
    }
}

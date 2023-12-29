package day19;

public class Q8 {
    public int[][] solution(int[][] arr1, int[][] arr2){
        // 길이가 같으니 answer = arr1으로 해서 넣어버려도 됨.
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}

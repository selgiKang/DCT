package day_1101;

public class Q2 {
    public int[][] solution(int[] num_list, int n){

        int x = num_list.length / n;
        int k = 0;
        int [][] answer = new int[x][n];

        for(int i = 0 ; i < x; i++){
            for(int j = 0; j < n; j++){
                   answer[i][j] = num_list[k++];
            }
        }

        return answer;
    }
}

public class Q19 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int e;
        for(int i=0;i<queries.length;i++){
            e = arr[queries[i][0]];
            arr[queries[i][0]]=arr[queries[i][1]];
            arr[queries[i][1]]=e;
        }
        return arr;
    }
}

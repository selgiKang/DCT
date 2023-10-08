package day3;

public class Q5 {
    public int solution(int[]arr, int idx){
        int min = -1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==1 && i>=idx){
                min = i;
            }
        }
        return min;
    }
}

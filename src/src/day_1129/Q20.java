package day_1129;

public class Q20 {
    public int solution(int[] array, int height){
        int cnt = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > height){
                cnt++;
            }
        }
        return cnt;
    }
}

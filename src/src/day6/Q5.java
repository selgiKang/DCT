package day6;

public class Q5 {
    public int solution(int[] array) {
        int answer = array[0];
        int max = 0;
        int[] fre= new int [1000];

        for(int i=0; i<array.length; i++){
            fre[array[i]]++;

            if(max < fre[array[i]]){
                max = fre[array[i]];
                answer = array[i];
            }
        }

        int temp = 0;
        for(int i=0; i<1000; i++){
            if(max == fre[array[i]]){
                temp ++;
            }
            if(temp > 1){
                answer = -1;
            }
        }
        return answer;
    }
}

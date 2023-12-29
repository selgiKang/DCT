package day17;

public class Q2 {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i : arr){
            answer += i;
        }
        answer = answer / arr.length;
        return answer;
    }
    //Arrays.stream(arr).average().getAsDouble();
}

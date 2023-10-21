package start01;

public class ArrTotal {
    public double solution(int[] numbers) {
        double answer = 0;
        int add = 0;
        for(int i : numbers){
            add += i;
        }
        double total = (double) add;
        answer = total / numbers.length;
        return answer;
    }
}

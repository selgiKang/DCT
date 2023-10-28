package day_1101;

public class Q4 {
    public int[] solution(int[] numbers, String direction){
        int [] answer = new int[numbers.length];
        switch (direction){
            case "right":
                for(int i = 0; i < numbers.length;i++){
                    if(i == 0){
                        answer[0] = numbers[numbers.length-1];
                    }else{
                        answer[i] = numbers[i-1];
                    }
                }
                break;
            case "left":
                for(int i = 0; i < numbers.length;i++){
                    if(i == answer.length-1){
                        answer[answer.length-1] = numbers[0];
                    }else{
                        answer[i] = numbers[i+1];
                    }
                }
                break;
        }
        return answer;
    }
}

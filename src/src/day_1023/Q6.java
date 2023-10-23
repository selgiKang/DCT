package day_1023;

public class Q6 {
    public int[] solution(int[] num_list){
        int i=0, num=0, other = 0;
        while (i < num_list.length){
            if(num_list[i] % 2 == 0){
                num += 1;
            }else{
                other += 1;
            }
            i++;
        }
        int [] answer = {num, other};
        return answer;
    }
}

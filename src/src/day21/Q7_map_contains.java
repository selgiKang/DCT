package day21;

public class Q7 {
    public int[] solution(String[] name, int[] yearning, String[][] photo){

        int[] answer = new int[photo.length];
        int k = 0;
        for(String[] n : photo){
            int sum = 0;
            for(int i = 0; i < n.length; i++){
                for(int j = 0; j < name.length; j++){
                    if(n[i].equals(name[j])){
                        sum += yearning[j];
                    }
                }
            }
            answer[k] = sum;
            k++;
        }

        return answer;
    }
}

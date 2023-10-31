package day_1101;

public class Q5 {
    public int solution(int[] box, int n){
        int result = 1;
      for(int i=0;i<box.length;i++){
          result *= (box[i] /n);
      }
      return result;
    }
}

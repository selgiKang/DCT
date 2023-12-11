package day_1129;

public class Q9 {
    public int solution(int num, int k){
        String numS = Integer.toString(num);
        String[] s = numS.split("");

        for(int i = 0; i < s.length; i++){
            if(s[i].equals(Integer.toString(k))){
                return i+1;
            }
        }

        return -1;
    }
}

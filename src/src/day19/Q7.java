package day19;

public class Q7 {
    public boolean solution(String s){

        if(s.length() == 4 || s.length()==6){
            for(char a : s.toCharArray()){
                if(a >= 65){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

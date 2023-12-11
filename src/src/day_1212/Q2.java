package day_1212;

public class Q2 {
    public int solution(String[] spell, String[] dic) {

        boolean word = false;
        for(String s : dic){
            int count = 0;
            for(String sp : spell){
                if(s.contains(sp)) count++;
            }
            if(count == spell.length){
                word = true;
                break;
            }
        }

        return word ? 1 : 2;
    }
}

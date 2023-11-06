package day7;

public class Q2 {
    public int[] solution(String[] strlist){
        int[] answer = new int[strlist.length];
        int i = 0;
        for(String str : strlist){
            answer[i] = str.length();
            i++;
        }
        return answer;
    }

    //Arrays.stream(strList).mapToInt(String::length).toArray();
}

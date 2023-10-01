package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q37 {
    public int solution(String my_string, String is_prefix) {
        List<String> word = new ArrayList<>();
        int answer = 0;

        word.add(my_string);
        for(int i=my_string.length();i>0;i--){
            word.add(my_string.substring(0,my_string.length()-i));
        }
        String []wordList = new String[word.size()];
        word.toArray(wordList);

        for(String str: wordList){
            System.out.println(str);
            if(str.equals(is_prefix)){
                answer=1;
            }
        }
        return answer;
    }
    public static void main(String[]args){
        Q37 q = new Q37();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int result = q.solution(a,b);

        System.out.println(result);
    }
}

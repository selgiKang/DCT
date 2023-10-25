package day_1027;

import java.util.Arrays;

public class Q10 {
    public String solution(String letter){
        StringBuilder sb = new StringBuilder();
        String[] arr = letter.split(" ");
        for(String s : arr){
            switch (s){
                case ".-" : sb.append("a"); break;
                case "-..." : sb.append("b"); break;
                case "-.-." : sb.append("c"); break;
                case "-.." : sb.append("d"); break;
                case "." : sb.append("e"); break;
                case "..-." : sb.append("f"); break;
                case "--." : sb.append("g"); break;
                case "...." : sb.append("h"); break;
                case ".." : sb.append("i"); break;
                case ".---" : sb.append("j"); break;
                case "-.-" : sb.append("k"); break;
                case ".-.." : sb.append("l"); break;
                case "--" : sb.append("m"); break;
                case "-." : sb.append("n"); break;
                case "---" : sb.append("o"); break;
                case ".--." : sb.append("p"); break;
                case "--.-" : sb.append("q"); break;
                case ".-." : sb.append("r"); break;
                case "..." : sb.append("s"); break;
                case "-" : sb.append("t"); break;
                case "..-" : sb.append("u"); break;
                case "...-" : sb.append("v"); break;
                case ".--" : sb.append("w"); break;
                case "-..-" : sb.append("x"); break;
                case "-.--" : sb.append("y"); break;
                case "--.." : sb.append("z"); break;
            }
        }
        return sb.toString();
    }
//    public String solution(String letter) {
//        String answer = "";
//        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
//        String[] word = letter.split(" ");
//
//        for(int i=0;i<word.length;i++){
//            for(int j=0;j<morse.length;j++){
//                if(word[i].equals(morse[j])) answer+=(char)(j+97);
//            }
//        }
//
//        return answer;
//    }
}

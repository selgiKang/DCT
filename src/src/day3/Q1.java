package day3;

//아닐 거 알지만 막노동이라도 푼다..
public class Q1 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(int i=0; i<answer.length;i++){
            answer[i] = 0;
        }

        for(int i=0;i<my_string.length();i++){
            switch (my_string.charAt(i)){
                case 'A' : answer[0] +=1;break;
                case 'B' : answer[1] +=1;break;
                case 'C' : answer[2] +=1;break;
                case 'D' : answer[3] +=1;break;
                case 'E' : answer[4] +=1;break;
                case 'F' : answer[5] +=1;break;
                case 'G' : answer[6] +=1;break;
                case 'H' : answer[7] +=1;break;
                case 'I' : answer[8] +=1;break;
                case 'J' : answer[9] +=1;break;
                case 'K' : answer[10] +=1;break;
                case 'L' : answer[11] +=1;break;
                case 'M' : answer[12] +=1;break;
                case 'N' : answer[13] +=1;break;
                case 'O' : answer[14] +=1;break;
                case 'P' : answer[15] +=1;break;
                case 'Q' : answer[16] +=1;break;
                case 'R' : answer[17] +=1;break;
                case 'S' : answer[18] +=1;break;
                case 'T' : answer[19] +=1;break;
                case 'U' : answer[20] +=1;break;
                case 'V' : answer[21] +=1;break;
                case 'W' : answer[22] +=1;break;
                case 'X' : answer[23] +=1;break;
                case 'Y' : answer[24] +=1;break;
                case 'Z' : answer[25] +=1;break;
                case 'a' : answer[26] +=1;break;
                case 'b' : answer[27] +=1;break;
                case 'c' : answer[28] +=1;break;
                case 'd' : answer[29] +=1;break;
                case 'e' : answer[30] +=1;break;
                case 'f' : answer[31] +=1;break;
                case 'g' : answer[32] +=1;break;
                case 'h' : answer[33] +=1;break;
                case 'i' : answer[34] +=1;break;
                case 'j' : answer[35] +=1;break;
                case 'k' : answer[36] +=1;break;
                case 'l' : answer[37] +=1;break;
                case 'm' : answer[38] +=1;break;
                case 'n' : answer[39] +=1;break;
                case 'o' : answer[40] +=1;break;
                case 'p' : answer[41] +=1;break;
                case 'q' : answer[42] +=1;break;
                case 'r' : answer[43] +=1; break;
                case 's' : answer[44] +=1;break;
                case 't' : answer[45] +=1;break;
                case 'u' : answer[46] +=1;break;
                case 'v' : answer[47] +=1;break;
                case 'w' : answer[48] +=1;break;
                case 'x' : answer[49] +=1;break;
                case 'y' : answer[50] +=1;break;
                case 'z' : answer[51] +=1;break;
            }
        }
        return answer;
    }
}

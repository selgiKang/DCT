package day2;

public class Q32 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<my_strings.length;i++){
            int [] part = parts[i];
            int x = part[0];
            int y = part[1];
            String result = my_strings[i].substring(x,y+1);
            sb.append(result);
        }
        return sb.toString();
    }
}

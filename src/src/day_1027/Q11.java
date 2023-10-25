package day_1027;

public class Q11 {
    public String solution(String rsp){
        StringBuilder sb = new StringBuilder();
        String[] arr = rsp.split("");

        for(String s : arr){
            switch (Integer.parseInt(s)){
                case 2: sb.append("0");break;
                case 0: sb.append("5");break;
                case 5: sb.append("2");break;
            }
        }
        return sb.toString();
    }
}

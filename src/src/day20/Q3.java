package day20;

public class Q3 {
    public String solution(String s){
        String[] strArr = s.split(" ",-1);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strArr.length; i++){
            for(int j = 0; j < strArr[i].length();j++){
                if(j % 2 == 0){
                    String str = String.valueOf(strArr[i].charAt(j));
                    sb.append(str.toUpperCase());
                }else{
                    String str = String.valueOf(strArr[i].charAt(j));
                    sb.append(str.toLowerCase());
                }
            }
            if(i != strArr.length-1){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}

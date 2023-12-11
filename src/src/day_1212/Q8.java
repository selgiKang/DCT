package day_1212;

public class Q8 {
    public String solution(String[] id_pw, String[][] db) {

        String answer = "";

        for(int i = 0; i < db.length; i++){

            if(!id_pw[0].equals(db[i][0])){
                answer = "fail";
            }else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])){
                answer = "wrong pw";
                break;
            }else{
                answer = "login";
                break;
            }
        }

        return answer;
    }
}

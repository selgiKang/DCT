package day17;

public class Q4_charAt {
    boolean solution(String s) {

        int pCnt = 0;
        int yCnt = 0;

        String newS = s.toLowerCase();
        //newS.charAt(i) 로 비교하면 됨...
        String[] sList = newS.split("");


        for (String i : sList) {
            if (i.equals("p")) {
                pCnt++;
            } else if (i.equals("y")) {
                yCnt++;
            }
        }

        if (pCnt == yCnt) {
            return true;
        } else if (pCnt == 0 & yCnt == 0) {
            return true;
        } else {
            return false;
        }
    }
}

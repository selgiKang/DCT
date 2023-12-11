package day_1129;

public class Q23 {
    public String solution(String polynomial) {
        String[] strArr = polynomial.split(" ");

        int num = 0;
        int other = 0;
        String answer = "";

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("+")) {
                if (strArr[i].contains("x")) {
                    if (strArr[i].length() == 1) {
                        num += 1;
                    } else {
                        String n = strArr[i].substring(0, strArr[i].length() - 1);
                        num = num + Integer.parseInt(n);
                    }
                } else {
                    other += Integer.parseInt(strArr[i]);
                }
            }
        }

        if (num != 0 && other == 0) {
            if (num == 1) {
                answer = "x";
            } else {
                answer = num + "x";
            }
        }

        if (num != 0 && other != 0) {
            if (num == 1) {
                answer = "x" + " + " + other;
            } else {
                answer = num + "x" + " + " + other;
            }
        }

        if (num == 0 && other != 0) {
            answer = String.valueOf(other);
        }

        return answer;
    }
}

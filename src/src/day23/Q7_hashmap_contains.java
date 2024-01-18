package day23;

public class Q7 {
    public int[] solution(String[] keymap, String[] targets) {

        int cnt = 0;
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            //a,b,c,d
            String[] targetArr = targets[i].split("");

            //a
            for (String str : targetArr) {
                int k = 0;
                while(true){

                    String[] keyArr = keymap[k].split("");

                    for (int j = 0; j < keymap[i].length(); j++) {
                        cnt++;
                        if (str.equals(keyArr[j])) {
                            break;
                        }
                    }

                    if(cnt == keymap[i].length() && k != keymap.length -1){
                        cnt = 0;
                        k++;
                    }else if(cnt == keymap[i].length() && k == keymap.length -1){
                       cnt = 0;
                        break;
                    }else{
                        break;
                    }
                }
            }

            if (cnt == 0) {
                answer[i] = -1;
            } else {
                answer[i] = cnt;
            }
        }

        return answer;

    }
}

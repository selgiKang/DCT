package day_1212;
//char도 정렬이 된다! sort....
public class Q11 {
    public int solution(String before, String after){
        int[] aski = new int[26];
        int[] aski2 = new int[26];

        for(char c : before.toCharArray()){
            int num = c - 'a';
            aski[num] += 1;
        }
        for(char c2: after.toCharArray()){
            int num = c2 - 'a';
            aski2[num] += 1;
        }

        for(int i = 0; i < aski.length; i++){
            if(aski[i] != aski2[i]){
                return 0;
            }
        }
        return 1;
    }
}

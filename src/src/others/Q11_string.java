package others;

//문자열 안 문자들이 고유한 문자인지
public class Q11_string {
    public boolean isUnique(String str) {
        if(str.length() > 128) return false;
        boolean[] char_set = new boolean[128];

        for(int i=0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) {

                return false;
            }

            char_set[val] = true;
        }

        return true;
    }
}

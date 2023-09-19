import java.util.ArrayList;

public class Q18 {
    public String solution(int n, String control) {
        char[] list = control.toCharArray();
        String result = null;
        for (int i = 0; i < list.length; i++) {
            char string = list[i];
            switch (string) {
                case 'w':
                    n += 1;
                    result += 'w';
                    break;
                case 's':
                    n -= 1;
                    result += 's';
                    break;
                case 'd':
                    n += 10;
                    result += 'd';
                    break;
                case 'a':
                    n -= 10;
                    result += 'a';
                    break;
            }
        }
        return result;
    }
}

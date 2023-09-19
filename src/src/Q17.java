public class Q17 {
    public int solution(int n, String control) {
        char[] list = control.toCharArray();
        for (int i = 0; i < list.length; i++) {
            char string = list[i];
            switch (string) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}

package day_1129;

public class Q21 {
    public int[] solution(String[] keyinput, int[] board) {

        int x = 0;
        int y = 0;
        int halfX = board[0] / 2;
        int halfY = board[1] / 2;

        for (int i = 0; i < keyinput.length; i++) {

            switch (keyinput[i]) {
                case "right":
                    if (x + 1 > halfX) {
                        break;
                    }
                    x = x + 1;
                    break;
                case "left":
                    if (x - 1 < -halfX) {
                        break;
                    }
                    x = x - 1;
                    break;
                case "up":
                    if (y + 1 > halfY) {
                        break;
                    }
                    y = y + 1;
                    break;
                case "down":
                    if (y - 1 < -halfY) {
                        break;
                    }
                    y = y - 1;
                    break;
            }
        }
        int[] answer = new int[2];
        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}

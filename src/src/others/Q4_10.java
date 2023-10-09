package others;

// 1부터 20까지 랜덤 숫자 10개를 뽑고 중복이 있으면 true, 없으면 false를 출력.
public class Q4_10 {
    public static void main(String[] args) {
        System.out.println(randomQuiz());
    }

    public static boolean randomQuiz() {
        int[] numList = new int[10];
        boolean result = false;

        for (int i = 0; i < 10; i++) {
            int randomValue = (int) (Math.random() * 20) + 1;
            System.out.println(randomValue);
            numList[i] = randomValue;
        }

        for (int i = 0; i < numList.length; i++) {
            for (int j = i+1; j < numList.length; j++) {
                if (numList[i] == numList[j]) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}

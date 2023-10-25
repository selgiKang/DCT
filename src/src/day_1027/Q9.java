package day_1027;

public class Q9 {
    public int solution(int hp) {
        int count = hp / 5;
        int other = hp % 5;
        if (other > 0) {
            count += other / 3;
            other = other % 3;
        }
        if (other > 0) {
            count += other;
         }

        return count;
    }
}

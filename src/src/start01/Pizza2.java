package start01;

public class Pizza2 {
    public int solution(int slice, int n) {

        int pice = -1;
        for(int i = 1; i<=n; i++){
            if(i % n == 0) {
                pice = i;
                break;
            }
        }
        return pice % slice == 0 ? pice / slice : pice / slice + 1;
    }
}

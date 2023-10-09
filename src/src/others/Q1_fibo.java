package others;

//재귀를 이용한 피보나치 수열
//피보나치 수열 : 대표적인 동적 프로그래미으이 사례, 자기 자신은 자신과 닮은 자기보다 작은 것들로 구성


import java.lang.reflect.Array;
import java.util.Arrays;

public class Q1_fibo {

    //피보나치
    //방법 1: data가 커지면 시간이 너무 오래걸림
 /*  public static int fibo(int data) {
        if(data <= 1) {
            return 1;
        }


        return fibo(data-1) + fibo(data-2);
    }*/


    //방법 2: 메모이제이션 - 동적으로 1번 구한 값은 저장해서 다시 계산 안하고 그 값을 꺼내오게하여 중복적인 계산 제거 -> 실행 속도 증가
     int[] f = new int[100];

    public Q1_fibo() {
        for (int i = 0; i < f.length; i++) {
            f[i] = 0;
        }
    }

    public int fibo(int data) {

        if (f[data] != 0) {
            return f[data];
        } else {
            if (data == 1 || data == 2) {
                f[data] = 1;
            } else {
                f[data] = fibo(data - 1) + fibo(data - 2);
            }
        }
        return f[data];
    }

    public static void main(String[] args) {
        Q1_fibo fibo = new Q1_fibo();
        System.out.println(fibo.fibo(40));
    }
}

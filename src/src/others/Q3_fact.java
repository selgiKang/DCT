package others;

public class Q3_fact {

    //재귀함수 이용한  팩토리얼 (ex. 5! = 5*4*3*2*1)
    public static int fact(int data) {
        if(data <= 1)
            return 1;


        return fact(data-1) * data;
    }
}

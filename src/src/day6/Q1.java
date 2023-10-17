package day6;

public class Q1 {
    public int solution(int num1, int num2){
        double f1 = (double) num1;
        double f2 = (double) num2;
        double answer = f1/f2*1000;
        return (int)answer;
    }
}

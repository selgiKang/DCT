package day4;

public class Factorial {

    public static int fact(int num){
        if(num<=1){
            return 1;
        }

        return fact(num-1)*num;
    }

    public static void main(String[]args){
        Factorial fac = new Factorial();
        System.out.println(fac.fact(5));
    }
}

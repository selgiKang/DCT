package day8;

public class Q6 {
    public String solution(String my_string, int num1, int num2){

       String[] arr = my_string.split("");

       String n = arr[num1];
       arr[num1] = arr[num2];
       arr[num2] = n;

       return String.join("",arr);
    }
}

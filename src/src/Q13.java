public class Q13 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a != b && b != c && a != c){
            answer = a+b+c;
        }else if(a==b && b==c){
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }else{
            answer = (a+b+c)*(a*a+b*b+c*c);
        }
        return answer;
    }

    /*
        Math.pow()
        Math.pow(3,2) : 3의 2제곱
        */


}

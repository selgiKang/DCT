package others;

import java.util.Scanner;
//최대 공약수, 최소 공배수
public class Q12_MaxMin {
    static int a, b;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();

        if (b > a) {
            int temp = b;
            b = a;
            a = temp;
        }

        int result = gcd(a, b);
        System.out.println(result);
        System.out.println(a * b / result);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        return gcd(b, a % b);
    }
}

package baek02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        float[] score = new float[num];
        float max = 0;
        float sum = 0;

        //점수 받기
        for(int i = 0; i < num; i++){
            score[i] = sc.nextFloat();
        }

        //최대값 구하기
        for(int i = 0; i < num; i++){
            if(max < score[i]){
                max = score[i];
            }
        }

        //새로운 평균 구하기
        for(int i = 0; i < num; i++){
            sum += (score[i] / max * 100);
        }

        System.out.println(sum / num);
    }
}

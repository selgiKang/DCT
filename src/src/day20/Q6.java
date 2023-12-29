package day20;

import java.util.Arrays;

public class Q6 {
    public int solution(int[][] sizes){
        int maxW = 0;
        int maxH = 0;


        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
                int emp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = emp;
            }

            if(maxW < sizes[i][0]){
                maxW = sizes[i][0];
            }
            if(maxH < sizes[i][1]){
                maxH = sizes[i][1];
            }
        }

        return maxH * maxW;
    }
}

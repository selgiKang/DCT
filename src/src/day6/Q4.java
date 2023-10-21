package day6;

import java.util.Arrays;

public class Q4 {
        public int solution(int[] array) {
            int center = array.length/2;

            for(int i=1;i<array.length;i++){
                int a = array[i];
                int com = i-1;

                while(com >=0 && a < array[com]){
                    array[com+1] = array[com];
                    com--;
                }
                array[com+1] = a;
            }

            return array[center];
        }

        public int anotherSolution(int[] arr){
            Arrays.sort(arr);
            return arr[arr.length/2];
        }
}

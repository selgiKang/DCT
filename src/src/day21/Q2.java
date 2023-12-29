package day21;

import java.util.Arrays;

public class Q2 {
    public int[] solution(int[] array, int[][] commands){
        //0,0 0,1 0,2
        int[] arr = new int[commands.length];
        int[] newArr = {};
        for(int i = 0; i < commands.length; i++){
            newArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(newArr);
            arr[i] = newArr[commands[i][2]-1];
        }
        return arr;
    }
}

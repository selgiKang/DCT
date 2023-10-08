package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3 {
    public String solution(String my_string, int[] indices){

        StringBuilder sb = new StringBuilder(my_string);

        //indices 배열을 정령해 큰 인덱스부터 삭제
        Arrays.sort(indices);

         for(int i=indices.length-1;i>=0;i--){
            int indexNum = indices[i];
             if (indexNum >= 0 && indexNum < sb.length()) {
                 sb.deleteCharAt(indexNum);
             }
         }
         return sb.toString();
    }
}
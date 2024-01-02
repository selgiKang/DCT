package day21;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public String solution(int[] food){

        String front = "";
        String back = "";

        for(int i = 0; i < food.length;i++){
            if(food[i] > 1){

                for(int j = 0; j < food[i]/2; j++){
                    back = String.valueOf(i) + back;
                    front += String.valueOf(i) ;
                }
            }
        }
        return front + "0" + back;
    }
}

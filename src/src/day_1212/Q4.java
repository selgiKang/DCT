package day_1212;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//기울기 = 세로길이 / 가로길이
public class Q4 {
    public double 기울기구하기(int [] dot1, int [] dot2)
    {
        System.out.println((double)(dot2[1] - dot1[1]) / (dot2[0] - dot1[0]));
        return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }

    public int solution(int[][] dots) {
        int answer = 0 ;

        if(기울기구하기(dots[0], dots[1]) == 기울기구하기(dots[2], dots[3]))
        {
            return 1;
        }
        if(기울기구하기(dots[0], dots[2]) == 기울기구하기(dots[1], dots[3]))
        {
            return 1;
        }
        if(기울기구하기(dots[0], dots[3]) == 기울기구하기(dots[1], dots[2]))
        {
            return 1;
        }

        return answer;
    }
}

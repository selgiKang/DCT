package day5;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public String[] solution(String[] str_list){
        List<String> result = new ArrayList<>();
        for(int i=0;i<str_list.length;i++){
            if(str_list[i].equals("l")){
                for(int j=0;j<i;j++){
                    result.add(str_list[j]);
                }
                break;
            }else if(str_list[i].equals("r")){
                for(int j=i+1;j<str_list.length;j++){
                    result.add(str_list[j]);
                }
                break;
            }
        }

        String [] last;
        if(result.isEmpty()){
            last = new String[0];
        }else{
            int num = result.size();
            last = result.toArray(new String[num]);
        }
        return last;
    }
}

package day_1129;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public String[] solution(String[] todo_list, boolean[] finished) {

        List<String> todoList = new ArrayList<>();
        for(int i = 0; i < todo_list.length;i++){
            if(!finished[i]){
                todoList.add(todo_list[i]);
            }
        }

        return todoList.toArray(new String[todoList.size()]);
    }
}

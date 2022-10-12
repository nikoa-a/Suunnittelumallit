package main;

import java.util.ArrayList;

public class StrategyThree implements ListConverter {

    @Override
    public String listToString(ArrayList<Integer> list) {
        Object[] objects = list.toArray(); 
        int i = 1;
        for (Object obj : objects) {
            if (i % 3 == 0) {
                System.out.println(obj); 
            } else {
                System.out.print(obj + ", "); 
            }
            i++;
        }
        return "";
    }
    
}

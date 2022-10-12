package main;

import java.util.ArrayList;

public class StrategyTwo implements ListConverter {

    @Override
    public String listToString(ArrayList<Integer> list) {      
        for (int i = 0; i < list.size(); i++) { 	
            if (i % 2 == 0) {	      
	            System.out.print(list.get(i) + ", ");
            } else {
                System.out.println(list.get(i));
            }
	    }  
        return "";
    }
    
}

package main;

import java.util.ArrayList;
import java.util.Iterator;

public class StrategyOne implements ListConverter {

    @Override
    public String listToString(ArrayList<Integer> list) {
        Iterator<Integer> iter = list.iterator(); 
	    	while(iter.hasNext()) {
	        	System.out.println(iter.next());
	        }
		return "";
    }
    
}

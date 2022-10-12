package main;

import java.util.ArrayList;

public class List {

    private ArrayList<Integer> list = new ArrayList<Integer>();
    private ListConverter strategy;

    public List(ListConverter strategy) {
        this.strategy = strategy;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
    }

    public String listToString() {
        return strategy.listToString(list);
    }
    
}

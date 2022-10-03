package main;

public class ActualData implements Data {

    @Override
    public void show() {
        System.out.println("x = 1, y = 4");       
    }

    @Override
    public String getDescription() {
        return "Sisältää tietoa asiasta x sekä y";     
    }
    
}

package main;

public abstract class DataDecorator implements Data {

    protected Data data;
    
    public DataDecorator (Data data) {
        this.data = data;
    }

    public void show() {
        data.show();
    }

    public String getDescription() {
        return data.getDescription();
    }

}

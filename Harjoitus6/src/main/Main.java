package main;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Data securedData = new PasswordDecorator(new ActualData());

        System.out.println(securedData.getDescription());
        securedData.show();
    }

}

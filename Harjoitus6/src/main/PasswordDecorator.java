package main;

import java.util.Scanner;

public class PasswordDecorator extends DataDecorator {

    private String password = "salasana";

    public PasswordDecorator(Data data) {
        super(data);
    }

    @Override
    public void show() {
        askPassword();
        super.show();     
    }

    private void askPassword() {
        Scanner myObj = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println("Syötä salasana");
            String input = myObj.nextLine();

            if (input.equals(password)) {
                break;
            } else if (!input.equals(password) && i < 2) {
                System.out.println("Salasana väärin!");
                i++;
            } else {
                System.out.println("Syötit salasanan liian monta kertaa väärin.");
                System.exit(0);
            }
        }
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pääsee käsiksi ainoastaan salasanalla.";
    }

}

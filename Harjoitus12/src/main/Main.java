package main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        ArrayList<Image> photoList = new ArrayList<>();
        
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");
        photoList.add(image1);
        photoList.add(image2);
        photoList.add(image3);

        for (Image image : photoList) {
            image.showData();
        }
   
        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image3.displayImage(); // loading necessary
        image3.displayImage(); // loading unnecessary
    }

}

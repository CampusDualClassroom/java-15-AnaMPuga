package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public String getSpecificData() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String fecha ="La localización es: " + getLocation() + ". La fecha de caducidad es: "+ dateFormat.format(expirationDate);
        System.out.println(fecha);
        return fecha;

    }



    public void printSpecificData() {
        System.out.println(getSpecificData());

    }
}

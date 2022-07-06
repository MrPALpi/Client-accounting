package com.example.work;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class forRabsTable {
    StringProperty FIORab, PhoneNumber;
    IntegerProperty idRab;

    public forRabsTable(Integer idRab, String FIORab, String PhoneNumber) {
        this.idRab = new SimpleIntegerProperty(idRab);
        this.FIORab = new SimpleStringProperty(FIORab);
        this.PhoneNumber = new SimpleStringProperty(PhoneNumber);

    }
    public Integer getidRab() {return this.idRab.get();}
    public void setidRab(Integer idRab) {this.idRab.set(idRab);
    }
    public IntegerProperty idRab() {
        return this.idRab;
    }

    public String getFIORab() {
        return this.FIORab.get();
    }
    public void setFIORab(String FIORab) {
        this.FIORab.set(FIORab);
    }
    public StringProperty FIORab() {
        return this.FIORab;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber.get();
    }
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber.set(PhoneNumber);
    }
    public StringProperty PhoneNumber() {
        return this.PhoneNumber;
    }

}

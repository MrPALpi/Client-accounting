package com.example.work;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class forBankTable {
    StringProperty Name;
    IntegerProperty idPay;

    public forBankTable(Integer idPay, String Name) {
        this.idPay = new SimpleIntegerProperty(idPay);
        this.Name = new SimpleStringProperty(Name);

    }
    public Integer getidPay() {return this.idPay.get();}
    public void setidPay(Integer idPay) {this.idPay.set(idPay);}
    public IntegerProperty idPay() {
        return this.idPay;
    }

    public String getName() {
        return this.Name.get();
    }
    public void setName(String Name) {
        this.Name.set(Name);
    }
    public StringProperty Name() {
        return this.Name;
    }

}

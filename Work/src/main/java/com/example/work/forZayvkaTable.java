package com.example.work;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class forZayvkaTable {
    StringProperty Client, Adress, phone, Pribor, Status;
    IntegerProperty idClients;

    public forZayvkaTable(Integer idClients, String Client, String Adress, String phone, String Pribor, String Status) {
        this.idClients = new SimpleIntegerProperty(idClients);
        this.Client = new SimpleStringProperty(Client);
        this.Adress = new SimpleStringProperty(Adress);
        this.Pribor = new SimpleStringProperty(Pribor);
        this.phone = new SimpleStringProperty(phone);
        this.Status = new SimpleStringProperty(Status);
    }
    public Integer getidClients() {return this.idClients.get();}
    public void setidClients(String idClients) {
        this.idClients.set(Integer.parseInt(idClients));
    }
    public IntegerProperty idClients() {
        return this.idClients;
    }


    public String getClient() {
        return this.Client.get();
    }
    public void setClient(String Client) {
        this.Client.set(Client);
    }
    public StringProperty Client() {
        return this.Client;
    }

    public String getAdress() {
        return this.Adress.get();
    }
    public void setAdress(String Adress) {
        this.Adress.set(Adress);
    }
    public StringProperty Adress() {
        return this.Adress;
    }

    public String getphone() {
        return this.phone.get();
    }
    public void setphone(String phone) {
        this.phone.set(phone);
    }
    public StringProperty phone() {
        return this.phone;
    }

    public String getPribor() {
        return this.Pribor.get();
    }
    public void setPribor(String Pribor) {
        this.Pribor.set(Pribor);
    }
    public StringProperty Pribor() {
        return this.Pribor;
    }

    public String getStatus() {
        return this.Status.get();
    }
    public void setStatus(String Status) {
        this.Status.set(Status);
    }
    public StringProperty Status() {
        return this.Status;
    }

}

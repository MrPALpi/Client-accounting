package com.example.work;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.sql.Date;


public class forClientTable {
    StringProperty Rabotnik, Price, Adress, Zavodnumber, PokazBegin, PokazEnd, Izmer, Client, phone, Pay, DataSnyatya, Pribor, BataryBegin, BataryEnd, DataZameny, DataSend, NumberNaklad, Montaj, GoodOrBad, NewSum, NewPribor, DEntreces, DateCreate,LinkDoc;
    IntegerProperty idClients;


    public forClientTable(Integer idClients, String Rabotnik, String DataSnyatya, String Adress, String Zavodnumber, String Pribor, String PokazBegin, String PokazEnd, String Izmer, String Price, String Client, String phone, String Pay, String GoodOrBad, String NewSum, String NewPribor, String BataryBegin, String BataryEnd, String DataZameny, String DataSend, String NumberNaklad, String Montaj, String DEntreces, String LinkDoc, String DateCreate) {
        this.idClients = new SimpleIntegerProperty(idClients);
        this.Rabotnik = new SimpleStringProperty(Rabotnik);
        this.DataSnyatya = new SimpleStringProperty(DataSnyatya);
        this.Adress = new SimpleStringProperty(Adress);
        this.Pribor = new SimpleStringProperty(Pribor);
        this.Zavodnumber = new SimpleStringProperty(Zavodnumber);
        this.PokazBegin = new SimpleStringProperty(PokazBegin);
        this.PokazEnd = new SimpleStringProperty(PokazEnd);
        this.Price = new SimpleStringProperty(Price);
        this.Client = new SimpleStringProperty(Client);
        this.phone = new SimpleStringProperty(phone);
        this.Pay = new SimpleStringProperty(Pay);
        this.GoodOrBad = new SimpleStringProperty(GoodOrBad);
        this.BataryBegin = new SimpleStringProperty(BataryBegin);
        this.BataryEnd = new SimpleStringProperty(BataryEnd);
        this.DataZameny = new SimpleStringProperty(DataZameny);
        this.DataSend = new SimpleStringProperty(DataSend);
        this.NumberNaklad = new SimpleStringProperty(NumberNaklad);
        this.Montaj = new SimpleStringProperty(Montaj);
        this.Izmer = new SimpleStringProperty(Izmer);
        this.NewSum = new SimpleStringProperty(NewSum);
        this.NewPribor = new SimpleStringProperty(NewPribor);
        this.DateCreate = new SimpleStringProperty(DateCreate);
        this.DEntreces = new SimpleStringProperty(DEntreces);
        this.LinkDoc = new SimpleStringProperty(LinkDoc);
    }








    public Integer getidClients() {return this.idClients.get();}
    public void setidClients(String idClients) {
        this.idClients.set(Integer.parseInt(idClients));
    }
    public IntegerProperty idClients() {
        return this.idClients;
    }

    public String getIzmer() {
        return this.Izmer.get();
    }
    public void setIzmer(String Izmer) {
        this.Izmer.set(Izmer);
    }
    public StringProperty Izmer() {
        return this.Izmer;
    }

    public String getNewSum() {
        return this.NewSum.get();
    }
    public void setNewSum(String NewSum) {
        this.NewSum.set(NewSum);
    }
    public StringProperty NewSum() {
        return this.NewSum;
    }

    public String getNewPribor() {
        return this.NewPribor.get();
    }
    public void setNewPribor(String NewPribor) {
        this.NewPribor.set(NewPribor);
    }
    public StringProperty NewPribor() {
        return this.NewPribor;
    }

    public String getDateCreate() {
        return this.DateCreate.get();
    }
    public void setDateCreate(String DateCreate) {
        this.DateCreate.set(DateCreate);
    }
    public StringProperty DateCreate() {
        return this.DateCreate;
    }



    public String getRabotnik() {
        return this.Rabotnik.get();
    }
    public void setRabotnik(String Rabotnik) {
        this.Rabotnik.set(Rabotnik);
    }
    public StringProperty Rabotnik() {
        return this.Rabotnik;
    }

    public String getLinkDoc() {
        return this.LinkDoc.get();
    }
    public void setLinkDoc(String LinkDoc) {
        this.LinkDoc.set(LinkDoc);
    }
    public StringProperty LinkDoc() {
        return this.LinkDoc;
    }



    public String getDataSnyatya() {
        return this.DataSnyatya.get();
    }
    public void setDataSnyatya(String DataSnyatya) {
        this.DataSnyatya.set(DataSnyatya);
    }
    public StringProperty DataSnyatya() {
        return this.DataSnyatya;
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

    public String getZavodnumber() {
        return this.Zavodnumber.get();
    }
    public void setZavodnumber(String Zavodnumber) {
        this.Zavodnumber.set(Zavodnumber);
    }
    public StringProperty Zavodnumber() {
        return this.Zavodnumber;
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

    public String getPokazBegin() {
        return this.PokazBegin.get();
    }
    public void setPokazBegin(String PokazBegin) {
        this.PokazBegin.set(PokazBegin);
    }
    public StringProperty PokazBegin() {
        return this.PokazBegin;
    }

    public String getPokazEnd() {
        return this.PokazEnd.get();
    }
    public void setPokazEnd(String PokazEnd) {
        this.PokazEnd.set(PokazEnd);
    }
    public StringProperty PokazEnd() {
        return this.PokazEnd;
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

    public String getphone() {
        return this.phone.get();
    }
    public void setphone(String phone) {
        this.phone.set(phone);
    }
    public StringProperty phone() {
        return this.phone;
    }

    public String getPay() {
        return this.Pay.get();
    }
    public void setPay(String Pay) {
        this.Pay.set(Pay);
    }
    public StringProperty Pay() {
        return this.Pay;
    }

    public String getPrice() {return this.Price.get();}
    public void setPrice(String Price) {
        this.Price.set(Price);
    }
    public StringProperty Price() {
        return this.Price;
    }

    public String getBataryBegin() {
        return this.BataryBegin.get();
    }
    public void setBataryBegin(String BataryBegin) {
        this.BataryBegin.set(BataryBegin);
    }
    public StringProperty BataryBegin() {
        return this.BataryBegin;
    }

    public String getDataZameny() {
        return this.DataZameny.get();
    }
    public void setDataZameny(String DataZameny) {
        this.DataZameny.set(DataZameny);
    }
    public StringProperty DataZameny() {
        return this.DataZameny;
    }

    public String getDataSend() {
        return this.DataSend.get();
    }
    public void setDataSend(String DataSend) {
        this.DataSend.set(DataSend);
    }
    public StringProperty DataSend() {
        return this.DataSend;
    }

    public String getBataryEnd() {
        return this.BataryEnd.get();
    }
    public void setBataryEnd(String BataryEnd) {
        this.BataryEnd.set(BataryEnd);
    }
    public StringProperty BataryEnd() {
        return this.BataryEnd;
    }

    public String getNumberNaklad() {
        return this.NumberNaklad.get();
    }
    public void setNumberNaklad(String NumberNaklad) {
        this.NumberNaklad.set(NumberNaklad);
    }
    public StringProperty NumberNaklad() {
        return this.NumberNaklad;
    }

    public String getMontaj() {
        return this.Montaj.get();
    }
    public void setMontaj(String Montaj) {
        this.Montaj.set(Montaj);
    }
    public StringProperty Montaj() {
        return this.Montaj;
    }

    public String getDEntreces() {
        return this.DEntreces.get();
    }
    public void setDEntreces(String DEntreces) {
        this.DEntreces.set(DEntreces);
    }
    public StringProperty DEntreces() {
        return this.DEntreces;
    }


    public String getGoodOrBad() {
        return this.GoodOrBad.get();
    }
    public void setGoodOrBad(String GoodOrBad) {
        this.GoodOrBad.set(GoodOrBad);
    }
    public StringProperty GoodOrBad() {
        return this.GoodOrBad;
    }

    }

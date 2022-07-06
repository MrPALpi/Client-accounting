package com.example.work;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class forCounterTable {
    StringProperty NameCount, About;
    IntegerProperty idCount;

    public forCounterTable(Integer idCount, String NameCount, String About) {
        this.idCount = new SimpleIntegerProperty(idCount);
        this.NameCount = new SimpleStringProperty(NameCount);
        this.About = new SimpleStringProperty(About);

    }
    public Integer getidCount() {return this.idCount.get();}
    public void setidCount(Integer idCount) {this.idCount.set(idCount);
    }
    public IntegerProperty idCount() {
        return this.idCount;
    }

    public String getNameCount() {
        return this.NameCount.get();
    }
    public void setNameCount(String NameCount) {
        this.NameCount.set(NameCount);
    }
    public StringProperty NameCount() {
        return this.NameCount;
    }

    public String getAbout() {
        return this.About.get();
    }
    public void setAbout(String About) {
        this.About.set(About);
    }
    public StringProperty About() {
        return this.About;
    }

}



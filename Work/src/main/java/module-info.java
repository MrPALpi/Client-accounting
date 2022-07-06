module com.example.work {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;
    requires java.desktop;
    requires poi.ooxml.schemas;
    requires poi.ooxml;

    requires org.apache.commons.io;
    requires org.apache.httpcomponents.httpcore;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpmime;
//    requires jdk.incubator.httpclient;
    requires java.net.http;



//    requires java.net.http.cleint;
//    requires poi.ooxml;
//    requires poi.ooxml.schemas;

    opens com.example.work to javafx.fxml;
    exports com.example.work;
}
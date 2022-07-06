package com.example.work;


import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import javafx.stage.Window;


import java.io.IOException;
import java.text.SimpleDateFormat;


public abstract class AllContoller {
    DBHandler DB = new DBHandler();
    FXMLLoader loader;
    Stage stage = new Stage();
    Stage stage1;

    public void nextPage(String fileName, Window window, Integer x, Integer y, boolean b) {

        window.getScene().getWindow().hide();
        loader = new FXMLLoader(HelloController.class.getResource(fileName));
        try {
            stage1 = (Stage) window;
            stage1.close();
            stage1 = null;
            ((Stage) window).close();
            window = null;
            Scene scene = new Scene(loader.load(), x, y);
            stage.setScene(scene);
            stage.setTitle("Электрум-Урал");
            stage.setResizable(b);
            stage.setMinWidth(x);
            //stage.minWidthProperty(y);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.gc();
    }


    public void OnlyCifra(TextField a) {
        a.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("[0-9][{<range>}(\\.[0-9]*)?]")) a.setText(newValue.replaceAll("[^\\d.]" , ""));
        });
    }




    public void editTable(TableColumn<forClientTable, String>  a, String s) {
        a.setCellFactory(TextFieldTableCell.forTableColumn());
            switch (s) {
                case ("RabotnikTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setRabotnik(t.getNewValue()));
                    break;
                case ("DataSnyatya"):

                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setDataSnyatya(t.getNewValue()));
                    break;
                case ("AdressTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setAdress(t.getNewValue()));
                    break;
                case ("PriborTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setPribor(t.getNewValue()));
                    break;
                case ("ZavodNumberTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setZavodnumber(t.getNewValue()));
                    break;
                case ("PokBeginTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setPokazBegin(t.getNewValue()));
                    break;
                case ("PokEndTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setPokazEnd(t.getNewValue()));
                    break;
                case ("PriceTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setPrice(t.getNewValue()));
                    break;
                case ("ClientTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setClient(t.getNewValue()));
                    break;
                case ("NumberTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setphone(t.getNewValue()));
                    break;
                case ("ChoiceBankTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setPay(t.getNewValue()));
                    break;
                case ("BataryaBeginTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setBataryBegin(t.getNewValue()));
                    //System.out.println("test begin");
                    break;
                case ("BataryaEndTable"):

                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setBataryEnd(t.getNewValue()));
                    //System.out.println("test begin");
                    break;
                case ("DataZameniTable"):
                    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setDataZameny(t.getNewValue()));



                    //System.out.println("test begin");
                    break;
                case ("DataSending"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setDataSend(t.getNewValue()));
                    break;
                case ("NumberNakladTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setNumberNaklad(t.getNewValue()));
                    break;
                case ("DataMontajTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setMontaj(t.getNewValue()));
                    break;
                case ("LinkDocTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setLinkDoc(t.getNewValue()));
                    System.out.println("test begin");
                    break;
                case ("DEntrecesjTable"):
                    a.setOnEditCommit(
                            t -> t.getTableView().getItems().get(
                                    t.getTablePosition().getRow()).setDEntreces(t.getNewValue()));
                    break;

            }
    }
}


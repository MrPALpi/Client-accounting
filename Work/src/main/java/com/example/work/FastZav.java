package com.example.work;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class FastZav extends AllContoller{
    TextField txt1 = new TextField();
    @FXML
    private Button Back;

    @FXML
    private ComboBox<String> ChoicePribors;

    @FXML
    private TextField Client;

    @FXML
    private Button NewNONClient;

    @FXML
    private TextField Number;

    @FXML
    private TextField adress;

    public void CounterDowload() {
        OnlyCifra(Number);
        ArrayList<String> list1;
        list1 = DB.getCounters();

            for (int i = 0; i < list1.size(); i = i + 3) {
                ChoicePribors.getItems().addAll(list1.get(i+1));
            }
        }

    @FXML
    void initialize() {
        CounterDowload();
        NewNONClient.setOnAction(actionEvent -> {
            DB.ZayavAdder(Client.getText(), adress.getText(), Number.getText(),ChoicePribors.getValue());
            Client.clear();
            ChoicePribors.setValue(null);
            Number.clear();
            adress.clear();
        });
        Back.setOnAction(actionEvent -> {

            nextPage("Choice.fxml",Back.getScene().getWindow(),600,400, false);
        });
    }

}

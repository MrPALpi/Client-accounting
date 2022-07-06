package com.example.work;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


import static com.example.work.HelloController.getIP;

public class IPChange extends AllContoller {

    @FXML
    private Button Back;

    @FXML
    private Button ChangeIPButton;

    @FXML
    private TextField IPText;
    @FXML
    private TextField AdressPort;

    @FXML
    void initialize() {
        String [] s = getIP().split(":");
        IPText.setText(s[0]);
        AdressPort.setText(s[1]);
        ChangeIPButton.setOnAction(actionEvent -> {

            FileOutputStream out = null;
            try {
                FileWriter f = new FileWriter("flask\\IPAdress.txt");
                f.write(IPText.getText()+":"+AdressPort.getText());
                f.close();
//                out = new FileOutputStream("flask\\IPAdress.txt");
//                out.write(IPText.getText().getBytes(StandardCharsets.UTF_8));
//                out.close();
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Back.setOnAction(actionEvent -> {
            nextPage("hello-view.fxml",Back.getScene().getWindow(),600,400, false);
        });

    }


}

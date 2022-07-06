package com.example.work;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HelloController extends AllContoller{

    static jsonJava js = new jsonJava();
    static String IP = "127.0.0.1:8080";
    //CreateDocx docx = new CreateDocx();

    @FXML
    private Button EntryButton;

    @FXML
    private Button GoTChangeIP;

    @FXML
    private Button SignUpButton;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;
//    public boolean input(){
//        if(loginField.getText().equals(LogIn) && passwordField.getText().equals(Password)){
//            inp = true;
//        }
//        else inp = false;
//        return inp;
//    }
//    public static boolean getinp(){
//        return inp;
//    }

    public String IPAdress() throws IOException {
        try {


            IP = Files.readString(Paths.get("flask\\IPAdress.txt"));
        }catch (Exception e){
            e.printStackTrace();
        }
        return IP;
    }

    public static String getIP(){
        return IP;
    }

    @FXML
    void initialize() throws IOException {
        IPAdress();

        EntryButton.setOnAction(actionEvent -> {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    try {

                        if (js.connect(loginField.getText(), passwordField.getText())) {


                            nextPage("Choice.fxml", EntryButton.getScene().getWindow(), 600, 400, false);

                        } else {
                            loginField.setText("");
                            loginField.setPromptText("Неверный ввод");
                            passwordField.setText("");
                        }
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });


        });



        SignUpButton.setOnAction(actionEvent -> {
            nextPage("Registr.fxml",SignUpButton.getScene().getWindow(),600,400, false);
        });
        GoTChangeIP.setOnAction(actionEvent -> {
            nextPage("IPChange.fxml",SignUpButton.getScene().getWindow(),600,400, false);
        });
    }
}

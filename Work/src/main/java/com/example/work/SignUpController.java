package com.example.work;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import static com.example.work.HelloController.js;


public class SignUpController extends AllContoller{
    @FXML
    private Button Back;

    @FXML
    private PasswordField KeySign;

    @FXML
    private TextField LoginRab;

    @FXML
    private Button SignUp;

    @FXML
    private PasswordField passwordRab;


    @FXML
    void initialize() {
        Back.setOnAction(actionEvent -> {
            nextPage("hello-view.fxml", Back.getScene().getWindow(), 600, 400, false);
        });
        SignUp.setOnAction(actionEvent -> {
            String log = LoginRab.getText();
            String pass = passwordRab.getText();
            String Regist = KeySign.getText();
            LoginRab.setText("");
            passwordRab.setText("");
            KeySign.setText("");
            if (log.length() >= 4 && pass.length() >= 6) {
//                if (DB.getNameUser(log)) {
//                    DB.userNameAndPassAdd(log, pass, Regist);
//                    Toolkit.getDefaultToolkit()
//                            .getSystemClipboard()
//                            .setContents(
//                                    new StringSelection(""),
//                                    null
//                            );
                try {
                    if(js.SignUp(log,pass,Regist)){
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Регистрация прошла успешно");
                        alert.setHeaderText(null);
                        alert.setContentText("Пользователь зарегестрирован");
                        alert.showAndWait();
                    }
                    else {
                    LoginRab.setPromptText("Логин уже занят");
                }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Toolkit.getDefaultToolkit()
                            .getSystemClipboard()
                            .setContents(
                                    new StringSelection(""),
                                    null);


//                }
//            else {
//                    LoginRab.setPromptText("Логин уже занят");
//                }
            } else {
                LoginRab.setPromptText("Логин должен быть>=4");
                passwordRab.setPromptText("Пароль должен быть>5");
            }
            log=null;
            pass = null;
            Regist = null;
        });

    }
    }

package com.example.work;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import static com.example.work.jsonJava.getinp;
import static java.util.UUID.randomUUID;

public class Choice extends AllContoller {
   // static Process PROfile;
    boolean isFileUnlocked = false;

    @FXML
    private Button Back;

    @FXML
    private Button KeyRab;

    @FXML
    private Button Tables;

    @FXML
    private Button NewNONClient;


    @FXML
    void initialize() {

        if (!getinp()){
            KeyRab.setVisible(false);
            KeyRab.setDisable(false);
        }
        Tables.setOnAction(actionEvent -> {
            nextPage("DataTables.fxml",Tables.getScene().getWindow(),1372,748, true);
//            try {
//                org.apache.commons.io.FileUtils.touch(new File("flask\\localFlask.exe"));
//                isFileUnlocked = true;
//            } catch (IOException e) {
//                isFileUnlocked = false;
//            }
//
//            if(isFileUnlocked){
//                try {
//                    PROfile = Runtime.getRuntime().exec(new String[] {"flask\\localFlask.exe"});
//                } catch (IOException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            } else {
//                System.out.println("hf,sdasd");
//            }






//            File file = new File("flask\\localFlask.exe");
//            ProcessBuilder processBuilder = new ProcessBuilder(file.getAbsolutePath());
//            processBuilder.directory(file.getParentFile());
//
//            try {
//                processBuilder.start();
//            } catch(IOException ex) {
//                ex.printStackTrace();
//            }
        });
        Back.setOnAction(actionEvent -> {
            nextPage("hello-view.fxml",Back.getScene().getWindow(),600,400, false);

        });
        KeyRab.setOnAction(actionEvent -> {
            UUID key = randomUUID();


            //UUID uuid = UUID.fromString(String UUID.HexDigitString);
            //String key = new Random().ints(17, 33, 122).mapToObj(i -> String.valueOf((char)i)).collect(Collectors.joining());
            Toolkit.getDefaultToolkit()
                    .getSystemClipboard()
                    .setContents(
                            new StringSelection(key.toString()),
                            null
                    );
            DB.userKeyAdd(key.toString());
            key = null;
        });
        NewNONClient.setOnAction(actionEvent -> {
            nextPage("Zayvka.fxml",Back.getScene().getWindow(),600,400, false);


        });
    }

}

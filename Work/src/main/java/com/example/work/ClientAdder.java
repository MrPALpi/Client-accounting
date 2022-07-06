package com.example.work;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.util.Callback;
import org.controlsfx.control.table.TableRowExpanderColumn;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import static com.example.work.HelloController.getIP;
import static com.example.work.HelloController.js;
import static com.example.work.jsonJava.getinp;


public class ClientAdder extends AllContoller{

    FilteredList<forClientTable> flPerson;
    SortedList<forClientTable> sortedItems;


    @FXML
    private ComboBox<String> Izmer;

    @FXML
    private DatePicker DEntreces;

    @FXML
    private MenuItem print;

    @FXML
    private MenuItem printTwo;

    @FXML
    private Button addClientZav;

    @FXML
    private Button RemoveAllClientZav;

    @FXML
    private Button RemoveClientZav;

    @FXML
    private ComboBox<String> NewPriborChoice;

    @FXML
    private TextField ClientZav;

    @FXML
    private TextField adressZav;

    @FXML
    private TextField NumberZav;

    @FXML
    private TextField LinkText;

    @FXML
    private ComboBox<String> ChoicePriborsZav;

    @FXML
    private TableView<forZayvkaTable> ZayavkaTable;

    @FXML
    private TableColumn<forClientTable, String> EdinTable;

    @FXML
    private TableColumn<forClientTable, String> NewSumTable;

    @FXML
    private TableColumn<forClientTable, String> NewPriborTable;

    @FXML
    private TableColumn<forClientTable, String> LinkDocTable;

    @FXML
    private TableColumn<forZayvkaTable, String> IDZav;

    @FXML
    private TableColumn<forZayvkaTable, String> ClientTableZav;

    @FXML
    private TableColumn<forZayvkaTable, String> AdressTableZav;

    @FXML
    private TableColumn<forZayvkaTable, String> NumberTableZav;

    @FXML
    private TableColumn<forZayvkaTable, String> PriborTableZav;

    @FXML
    private  TableColumn<forZayvkaTable, String> Status;

    @FXML
    private Button AddBank;

    @FXML
    private Button ExcelDownload;

    @FXML
    private Button refresh;

    @FXML
    private ComboBox<String> SearchCategory;

    @FXML
    private TextField Search;

    @FXML
    private TextField NewPrice;

    @FXML
    private Button AddCount;

    @FXML
    private Button AddRab;

    @FXML
    private TableColumn<forClientTable, String> AdressTable;

    @FXML
    private Button Back;

    @FXML
    private Button DeleteBank;

    @FXML
    private TableView<forBankTable> Bank;

    @FXML
    private TableView<forCounterTable> TableCounters;

    @FXML
    private TableColumn<forBankTable, String> BankTable;

    @FXML
    private TextField BankVvod;

    @FXML
    private TextField BataryBegin;

    @FXML
    private TableColumn<forClientTable, String> BataryaBeginTable;

    @FXML
    private TextField BataryaEnd;

    @FXML
    private TableColumn<forClientTable, String> BataryaEndTable;

    @FXML
    private TableColumn<forClientTable, String> ChoiceBankTable;

    @FXML
    private ComboBox<String> ChoiceBanks;

    @FXML
    private ComboBox<String> ChoicePribors;

    @FXML
    private ComboBox<String> ChoiceRabot;

    @FXML
    private TextField Client;

    @FXML
    private TableColumn<forClientTable, String> ClientTable;


    @FXML
    private DatePicker DataMontaj;

    @FXML
    private TableColumn<forClientTable, String> DataMontajTable;

    @FXML
    private DatePicker DataSend;

    @FXML
    private TableColumn<forClientTable, String> DataSending;

    @FXML
    private TableColumn<forClientTable, String> DataSnyatya;

    @FXML
    private DatePicker DataZameni;

    @FXML
    private TableColumn<forClientTable, String> DataZameniTable;

    @FXML
    private Button DeleteCount;

    @FXML
    private Button DeleteRab;

    @FXML
    private TextField NameCount;

    @FXML
    private TableColumn<forCounterTable, String> NameCountTable;

    @FXML
    private TextField NomerCount;

    @FXML
    private TableColumn<forCounterTable, String> DopInfo;

    @FXML
    private TextField Number;

    @FXML
    private TextField NumberNaklad;

    @FXML
    private TableColumn<forClientTable, String> NumberNakladTable;

    @FXML
    private TableColumn<forClientTable, String> NumberTable;

    @FXML
    private TableColumn<forClientTable, String> GoodOrBadTable;

    @FXML
    private ComboBox<String> GoodOrBadChoicer;

    @FXML
    private TableColumn<forClientTable, String> PokBeginTable;

    @FXML
    private TableColumn<forClientTable, String> PokEndTable;

    @FXML
    private TableColumn<forClientTable, String> PriborTable;

    @FXML
    private TextField Price;

    @FXML
    private TableColumn<forClientTable, String> PriceTable;

    @FXML
    private TextField RabFam;

    @FXML
    private TableColumn<forRabsTable, String> RabFamTable;

    @FXML
    private TableColumn<forClientTable, String> ID;

    @FXML
    private TextField RabNumber;

    @FXML
    private TableColumn<forRabsTable, String> RabNumberTable;

    @FXML
    private TableColumn<forClientTable, String> RabotnikTable;

    @FXML
    private TableView<forRabsTable> Rabotniki;

    @FXML
    private TextField ValueBegins;

    @FXML
    private TextField ValueEnds;

    @FXML
    private TextField ZavodNumber;

    @FXML
    private TableColumn<forClientTable, String> ZavodNumberTable;

    @FXML
    private Button addClient;

    @FXML
    private TextField adress;

    @FXML
    private TableView<forClientTable> basicTable;


    @FXML
    private Button changeClient;

    @FXML
    private DatePicker dataDrawal;

    @FXML
    private Button PrintClientOne;

    @FXML
    private Button PrintClientTwo;

    @FXML
    private TableColumn<forClientTable, String> DEntrecesjTable;

    @FXML
    private Button removeClient;



    ObservableList<forClientTable> ClientForTables = FXCollections.observableArrayList();
    ObservableList<forRabsTable> RabsForTable = FXCollections.observableArrayList();
    ObservableList<forCounterTable> CounterForTable = FXCollections.observableArrayList();
    ObservableList<forBankTable> BankForTable = FXCollections.observableArrayList();
    ObservableList<forZayvkaTable> ZayvkaForTable = FXCollections.observableArrayList();
    //ObservableList<TableColumn<forClientTable, String>> TableColumns = FXCollections.observableArrayList(RabotnikTable,DataSnyatya,AdressTable,PriborTable,ZavodNumberTable,PokBeginTable,PokEndTable,PriceTable,ClientTable,NumberTable,NumberTable);





    public void BankDowload(boolean t) {
        ArrayList<String> list1;
        list1 = DB.getBanks();

        if (t) {
            for (int i = 0; i < list1.size(); i = i + 2) {

                BankForTable.add(new forBankTable(Integer.parseInt(list1.get(i)), list1.get(i + 1)));
                ChoiceBanks.getItems().addAll(list1.get(i+1));
            }
        } else {
            BankForTable.add(new forBankTable(Integer.parseInt(list1.get(list1.size() - 2)), list1.get(list1.size() - 1)));
            ChoiceBanks.getItems().addAll(list1.get(list1.size() - 1));
        }
        BankTable.setCellValueFactory(data -> data.getValue().Name());
        Bank.setItems(BankForTable);
        list1 = null;
    }

    public void CounterDowload(boolean t) {
        ArrayList<String> list1;
        list1 = DB.getCounters();

        if (t) {
            for (int i = 0; i < list1.size(); i = i + 3) {

                CounterForTable.add(new forCounterTable(Integer.parseInt(list1.get(i)), list1.get(i + 1), list1.get(i + 2)));
                ChoicePribors.getItems().addAll(list1.get(i+1));

            }
        } else {
            CounterForTable.add(new forCounterTable(Integer.parseInt(list1.get(list1.size() - 3)), list1.get(list1.size() - 2), list1.get(list1.size() - 1)));
            ChoicePribors.getItems().addAll(list1.get(list1.size() - 2));

        }
        ChoicePriborsZav.getItems().addAll(ChoicePribors.getItems());
        NewPriborChoice.getItems().addAll(ChoicePribors.getItems());
        NameCountTable.setCellValueFactory(data -> data.getValue().NameCount());
        DopInfo.setCellValueFactory(data -> data.getValue().About());
        TableCounters.setItems(CounterForTable);
        list1 = null;
    }

    public void ZavkaDownload(boolean t){
        ArrayList<String> list1;
        list1 = DB.getZayavka();

        if (t) {
            for (int i = 0; i < list1.size(); i = i + 6) {
                ZayvkaForTable.add(new forZayvkaTable(Integer.parseInt(list1.get(i)), list1.get(i + 1), list1.get(i + 2), list1.get(i + 3), list1.get(i + 4),list1.get(i + 5)));
            }
        } else {
            ZayvkaForTable.add(new forZayvkaTable(Integer.parseInt(list1.get(list1.size() - 6)), list1.get(list1.size() - 5), list1.get(list1.size() - 4),list1.get(list1.size() - 3),list1.get(list1.size() - 2),list1.get(list1.size() - 1)));


        }


        IDZav.setCellValueFactory(data -> data.getValue().idClients().asString());
        ClientTableZav.setCellValueFactory(data -> data.getValue().Client());
        AdressTableZav.setCellValueFactory(data -> data.getValue().Adress());
        NumberTableZav.setCellValueFactory(data -> data.getValue().phone());
        PriborTableZav.setCellValueFactory(data -> data.getValue().Pribor());
        Status.setCellValueFactory(data -> data.getValue().Status());
        SortedList<forZayvkaTable> sortedZayvka = new SortedList<>(ZayvkaForTable);
        ZayavkaTable.setItems(sortedZayvka);
        sortedZayvka.comparatorProperty().bind(ZayavkaTable.comparatorProperty());
        list1 = null;
    }

    private void addButtonToTableTwo() {
        TableColumn<forZayvkaTable, Void> colBtn = new TableColumn("Отклонить");
        colBtn.setStyle("-fx-background-color: #36393f; -fx-text-fill: #f2ebeb; -fx-text-background-color: #f2ebeb; -fx-font-family: SansSerif;");

        Callback<TableColumn<forZayvkaTable, Void>, TableCell<forZayvkaTable, Void>> cellFactory = new Callback<TableColumn<forZayvkaTable, Void>, TableCell<forZayvkaTable, Void>>() {
            @Override
            public TableCell<forZayvkaTable, Void> call(final TableColumn<forZayvkaTable, Void> param) {
                final TableCell<forZayvkaTable, Void> cell = new TableCell<forZayvkaTable, Void>() {

                    private final Button btn = new Button("Отклонить");

                    {
                        btn.setStyle("-fx-background-color: #5865f2; -fx-background-radius: 7; -fx-text-fill: #f2ebeb");
                        btn.setOnAction((ActionEvent event) -> {
                            int selectedIndex = getTableRow().getIndex();

                            forZayvkaTable u = ZayavkaTable.getItems().get(selectedIndex);
                            if(!u.getStatus().equals("Отлконён")) {
                                u.setStatus("Отлконён");
                                DB.UpdateStatusZayvki(u.getidClients(), u.getStatus());
                            }

                        });
                    }

                    @Override
                    public void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                            setGraphic(btn);
                        }
                    }
                };
                return cell;
            }
        };

        colBtn.setCellFactory(cellFactory);

        ZayavkaTable.getColumns().add(colBtn);

    }



    public class Label1 extends Label{
        Label1(String text, String style){
            this.setText(text);
            this.setStyle(style);
        }
    }


    private void addButtonToTable() {
        TableColumn<forZayvkaTable, Void> colBtn = new TableColumn("Принять");
        colBtn.setStyle("-fx-background-color: #36393f; -fx-text-fill: #f2ebeb; -fx-text-background-color: #f2ebeb; -fx-font-family: SansSerif;");

        Callback<TableColumn<forZayvkaTable, Void>, TableCell<forZayvkaTable, Void>> cellFactory = new Callback<TableColumn<forZayvkaTable, Void>, TableCell<forZayvkaTable, Void>>() {
            @Override
            public TableCell<forZayvkaTable, Void> call(final TableColumn<forZayvkaTable, Void> param) {
                final TableCell<forZayvkaTable, Void> cell = new TableCell<forZayvkaTable, Void>() {

                    private final Button btn = new Button("Принять");

                    {
                        btn.setStyle("-fx-background-color: #5865f2; -fx-background-radius: 7; -fx-text-fill: #f2ebeb");
                        btn.setOnAction((ActionEvent event) -> {
                            int selectedIndex = getTableRow().getIndex();

                            forZayvkaTable u = ZayavkaTable.getItems().get(selectedIndex);
                            if(!((u.getStatus().equals("Принят")) | u.getStatus().equals("Отлконён"))) {
                                u.setStatus("Принят");
                                DB.UpdateStatusZayvki(u.getidClients(), u.getStatus());
                                ClientZav.clear();
                                adressZav.clear();
                                NumberZav.clear();
                                ChoicePriborsZav.setValue(null);
                                DB.ClientAdder(u.getAdress(), u.getPribor(), u.getClient(), u.getphone(),DB.getDate());
                                personalityDownload(false, false);
                            }


                        });
                    }

                    @Override
                    public void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                            setGraphic(btn);
                        }
                    }
                };
                return cell;
            }
        };

        colBtn.setCellFactory(cellFactory);

        ZayavkaTable.getColumns().add(colBtn);

    }

    private GridPane createEditor(TableRowExpanderColumn.TableRowDataFeatures<forClientTable> param){
        GridPane editor = new GridPane();
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                editor.setPadding(new Insets(10));
                editor.setHgap(10);
                editor.setVgap(5);
                forClientTable customer = param.getValue();
                var ref = new Object() {
                    TextField Rabotnick = new TextField(customer.getRabotnik());
                    TextField DataSnyat = new TextField(customer.getDataSnyatya());
                    TextField adres = new TextField(customer.getAdress());
                    TextField pribor = new TextField(customer.getPribor());
                    TextField Zavod  = new TextField(customer.getZavodnumber());
                    TextField PBegin = new TextField(customer.getPokazBegin());
                    TextField PEnd  = new TextField(customer.getPokazEnd());
                    TextField EdIzm  = new TextField(customer.getIzmer());
                    TextField Sum = new TextField(customer.getPrice());
                    TextField Zakazchick = new TextField(customer.getClient());
                    TextField Phone = new TextField(customer.getphone());
                    TextField Pay = new  TextField(customer.getPay());
                    TextField GoodOrBad = new TextField(customer.getGoodOrBad());
                    TextField NewSum = new TextField(customer.getNewSum());
                    TextField NewPribor = new TextField(customer.getNewPribor());
                    TextField BatareyB = new TextField(customer.getBataryBegin());
                    TextField BatereyE = new TextField(customer.getBataryEnd());
                    TextField DataZameny = new TextField(customer.getDataZameny());
                    TextField DataSend = new TextField(customer.getDataSend());
                    TextField NumberNaklad =new TextField(customer.getNumberNaklad());
                    TextField DataMontaj = new TextField(customer.getMontaj());
                    TextField DataPostupl = new TextField(customer.getDEntreces());
                    TextField LinkDocField = new TextField(customer.getLinkDoc());
                };

                editor.addRow(0, new Label1("Работник","-fx-text-fill: #f2ebeb;"), ref.Rabotnick, new Label1("Дата снятия","-fx-text-fill: #f2ebeb;"), ref.DataSnyat, new Label1("Адрес","-fx-text-fill: #f2ebeb;"), ref.adres, new Label1("Прибор","-fx-text-fill: #f2ebeb;"), ref.pribor, new Label1("Завод. номер","-fx-text-fill: #f2ebeb;"), ref.Zavod);
                editor.addRow(1, new Label1("Пок. начало","-fx-text-fill: #f2ebeb;"), ref.PBegin, new Label1("Пок. конец","-fx-text-fill: #f2ebeb;"), ref.PEnd, new Label1("Ед. измерения","-fx-text-fill: #f2ebeb;"), ref.EdIzm, new Label1("Сумма","-fx-text-fill: #f2ebeb;"), ref.Sum, new Label1("Заказчик","-fx-text-fill: #f2ebeb;"), ref.Zakazchick);
                editor.addRow(2, new Label1("Телефон","-fx-text-fill: #f2ebeb;"), ref.Phone, new Label1("Оплата","-fx-text-fill: #f2ebeb;"), ref.Pay, new Label1("Годность","-fx-text-fill: #f2ebeb;"), ref.GoodOrBad, new Label1("Новая сумма","-fx-text-fill: #f2ebeb;"), ref.NewSum, new Label1("Новый прибор","-fx-text-fill: #f2ebeb;"), ref.NewPribor);
                editor.addRow(3, new Label1("Батарея была","-fx-text-fill: #f2ebeb;"), ref.BatareyB, new Label1("Батарея стала","-fx-text-fill: #f2ebeb;"), ref.BatereyE, new Label1("Дата замены","-fx-text-fill: #f2ebeb;"), ref.DataZameny, new Label1("Дата отпр.","-fx-text-fill: #f2ebeb;"), ref.DataSend, new Label1("Номер наклад.","-fx-text-fill: #f2ebeb;"), ref.NumberNaklad);
                editor.addRow(4,new Label1("Дата монтажа","-fx-text-fill: #f2ebeb;"),ref.DataMontaj, new Label1("Дата поступлеия","-fx-text-fill: #f2ebeb;"), ref.DataPostupl,new Label1("Ссылка","-fx-text-fill: #f2ebeb;"), ref.LinkDocField);
                Button saveButton = new Button("Сохранить");
                saveButton.setOnAction(actionEvent -> {
                    param.toggleExpanded();

                    if (DB.DataGetter(customer.getDateCreate()) | getinp()) {

                        customer.setRabotnik(ref.Rabotnick.getText());
                        customer.setDataSnyatya(ref.DataSnyat.getText());
                        customer.setAdress(ref.adres.getText());
                        customer.setPribor(ref.pribor.getText());
                        customer.setZavodnumber(ref.Zavod.getText());
                        customer.setPokazBegin(ref.PBegin.getText());
                        customer.setPokazEnd(ref.PEnd.getText());
                        customer.setIzmer(ref.EdIzm.getText());
                        customer.setPrice(ref.Sum.getText());
                        customer.setClient(ref.Zakazchick.getText());
                        customer.setphone(ref.Phone.getText());
                        customer.setPay(ref.Pay.getText());
                        customer.setGoodOrBad(ref.GoodOrBad.getText());
                        customer.setNewSum(ref.NewSum.getText());
                        customer.setNewPribor(ref.NewPribor.getText());
                        customer.setBataryBegin(ref.BatareyB.getText());
                        customer.setBataryEnd(ref.BatereyE.getText());
                        customer.setDataZameny(ref.DataZameny.getText());
                        customer.setDataSend(ref.DataSend.getText());
                        customer.setNumberNaklad(ref.NumberNaklad.getText());
                        customer.setMontaj(ref.DataMontaj.getText());
                        customer.setDEntreces(ref.DataPostupl.getText());
                        customer.setLinkDoc(ref.LinkDocField.getText());

                        DB.UpdateClients(customer.getidClients(), customer.getRabotnik(), customer.getDataSnyatya(), customer.getAdress(), customer.getPribor(), customer.getZavodnumber(), customer.getPokazBegin(), customer.getPokazEnd(), customer.getIzmer(), customer.getPrice(), customer.getClient(), customer.getphone(), customer.getPay(), customer.getGoodOrBad(), customer.getNewSum(), customer.getNewPribor(), customer.getBataryBegin(), customer.getBataryEnd(), customer.getDataZameny(), customer.getDataSend(), customer.getMontaj(), customer.getDEntreces(),customer.getLinkDoc(), customer.getNumberNaklad());

                    }
                    else {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Ошибка");
                        alert.setHeaderText(null);
                        alert.setContentText("У вас недостаточно прав. Обратитесь к администратору");
                        alert.showAndWait();
                    }
                    editor.getChildren().removeAll();
                    ref.Rabotnick = null;
                    ref.DataSnyat = null;
                    ref.adres = null;
                    ref.pribor=null;
                    ref.Zavod=null;
                    ref.PBegin=null;
                    ref.PEnd = null;
                    ref.EdIzm= null;
                    ref.Sum= null;
                    ref.Zakazchick= null;
                    ref.Phone= null;
                    ref.Pay= null;
                    ref.GoodOrBad= null;
                    ref.NewSum= null;
                    ref.NewPribor= null;
                    ref.BatareyB= null;
                    ref.BatereyE= null;
                    ref.DataZameny= null;
                    ref.DataSend= null;
                    ref.NumberNaklad= null;
                    ref.DataMontaj= null;
                    ref.DataPostupl= null;
                    ref.LinkDocField = null;

                });
                Button CancelButton = new Button("Закрыть");
                CancelButton.setOnAction(actionEvent -> {
                    param.toggleExpanded();
                    editor.getChildren().removeAll();
                    ref.Rabotnick = null;
                    ref.DataSnyat = null;
                    ref.adres = null;
                    ref.pribor=null;
                    ref.Zavod=null;
                    ref.PBegin=null;
                    ref.PEnd = null;
                    ref.EdIzm= null;
                    ref.Sum= null;
                    ref.Zakazchick= null;
                    ref.Phone= null;
                    ref.Pay= null;
                    ref.GoodOrBad= null;
                    ref.NewSum= null;
                    ref.NewPribor= null;
                    ref.BatareyB= null;
                    ref.BatereyE= null;
                    ref.DataZameny= null;
                    ref.DataSend= null;
                    ref.NumberNaklad= null;
                    ref.DataMontaj= null;
                    ref.DataPostupl= null;

                });
                editor.addRow(5,saveButton,CancelButton);

            }

        });
        System.gc();
        return editor; }




    public void RabsDownload(boolean t) {
        ArrayList<String> list1 = null;
        list1 = DB.getRabs();

        if (t) {
            for (int i = 0; i < list1.size(); i = i + 3) {

                RabsForTable.add(new forRabsTable(Integer.parseInt(list1.get(i)), list1.get(i + 1), list1.get(i + 2)));
                ChoiceRabot.getItems().addAll(list1.get(i+1));

            }
        } else {
            RabsForTable.add(new forRabsTable(Integer.parseInt(list1.get(list1.size() - 3)), list1.get(list1.size() - 2), list1.get(list1.size() - 1)));
            ChoiceRabot.getItems().addAll(list1.get(list1.size() - 2));

        }
        RabFamTable.setCellValueFactory(data -> data.getValue().FIORab());
        RabNumberTable.setCellValueFactory(data -> data.getValue().PhoneNumber());

        SortedList<forRabsTable> sortedRab = new SortedList<>(RabsForTable);
        Rabotniki.setItems(sortedRab);
        sortedRab.comparatorProperty().bind(Rabotniki.comparatorProperty());
        list1 = null;
    }
    public void personalityDownload(boolean t, boolean g){


        ArrayList<String> list1 = null;
        list1 = DB.getClients();

        if(t) {

            for (int i = 0; i < list1.size(); i = i + 25) {
                ClientForTables.add(new forClientTable(Integer.parseInt(list1.get(i)), list1.get(i + 1), list1.get(i + 2), list1.get(i + 3), list1.get(i + 4), list1.get(i + 5), list1.get(i + 6), list1.get(i + 7), list1.get(i + 8),list1.get(i + 9),list1.get(i + 10), list1.get(i + 11), list1.get(i + 12),list1.get(i + 13),list1.get(i + 14),list1.get(i + 15),list1.get(i + 16),list1.get(i + 17),list1.get(i + 18),list1.get(i + 19), list1.get(i + 20), list1.get(i + 21),list1.get(i + 22),list1.get(i + 23),list1.get(i + 24)));
            }

            TableRowExpanderColumn<forClientTable> expanderColumn = new TableRowExpanderColumn<>(this::createEditor);
            expanderColumn.setStyle("-fx-background-color: #36393f; -fx-text-fill: #f2ebeb; -fx-text-background-color: #f2ebeb; -fx-font-family: SansSerif;");
            ID.setCellValueFactory(data -> data.getValue().idClients().asString());
            RabotnikTable.setCellValueFactory(data -> data.getValue().Rabotnik());
            DataSnyatya.setCellValueFactory(data -> data.getValue().DataSnyatya());
            AdressTable.setCellValueFactory(data -> data.getValue().Adress());
            PriborTable.setCellValueFactory(data -> data.getValue().Pribor());
            ZavodNumberTable.setCellValueFactory(data -> data.getValue().Zavodnumber());
            PokBeginTable.setCellValueFactory(data -> data.getValue().PokazBegin());
            PokEndTable.setCellValueFactory(data -> data.getValue().PokazEnd());
            EdinTable.setCellValueFactory(data -> data.getValue().Izmer());
            PriceTable.setCellValueFactory(data -> data.getValue().Price());
            ClientTable.setCellValueFactory(data -> data.getValue().Client());
            NumberTable.setCellValueFactory(data -> data.getValue().phone());
            ChoiceBankTable.setCellValueFactory(data -> data.getValue().Pay());
            GoodOrBadTable.setCellValueFactory(data -> data.getValue().GoodOrBad());
            NewSumTable.setCellValueFactory(data -> data.getValue().NewSum());
            NewPriborTable.setCellValueFactory(data -> data.getValue().NewPribor());
            BataryaBeginTable.setCellValueFactory(data -> data.getValue().BataryBegin());
            BataryaEndTable.setCellValueFactory(data -> data.getValue().BataryEnd());
            DataZameniTable.setCellValueFactory(data -> data.getValue().DataZameny());
            DataSending.setCellValueFactory(data -> data.getValue().DataSend());
            NumberNakladTable.setCellValueFactory(data -> data.getValue().NumberNaklad());
            DataMontajTable.setCellValueFactory(data -> data.getValue().Montaj());
            DEntrecesjTable.setCellValueFactory(data -> data.getValue().DEntreces());
            LinkDocTable.setCellValueFactory(data -> data.getValue().LinkDoc());
            flPerson = new FilteredList(ClientForTables, p -> true);
            sortedItems = new SortedList<>(flPerson);
            sortedItems.comparatorProperty().bind(basicTable.comparatorProperty());
            //basicTable.getColumns().add(expanderColumn);
            basicTable.setItems(sortedItems);
            if (g){
                basicTable.getColumns().add(0, expanderColumn);
            }
        }
        else{
            ClientForTables.add(new forClientTable(Integer.parseInt(list1.get(list1.size()-25)), list1.get(list1.size()-24), list1.get(list1.size()-23), list1.get(list1.size()-22), list1.get(list1.size()-21), list1.get(list1.size()-20), list1.get(list1.size()-19), list1.get(list1.size()-18), list1.get(list1.size()-17), list1.get(list1.size()-16), list1.get(list1.size()-15), list1.get(list1.size()-14),list1.get(list1.size()-13),list1.get(list1.size()-12),list1.get(list1.size()-11),list1.get(list1.size()-10),list1.get(list1.size()-9),list1.get(list1.size()-8),list1.get(list1.size()-7),list1.get(list1.size()-6),list1.get(list1.size()-5),list1.get(list1.size()-4),list1.get(list1.size()-3),list1.get(list1.size()-2),list1.get(list1.size()-1)));
        }
        list1 = null;





    }

    public String checkField(ComboBox s){
        String stroka;
        if(!(s.getValue() == null)){
            stroka = String.valueOf(s.getValue());
        }
        else{stroka="";}
        return stroka;
    }

    public String checkField(DatePicker s){
        String stroka;
        if(!(s.getValue() ==null)){
            stroka = String.valueOf(s.getValue());
        }
        else{stroka="";}
        return stroka;
    }

    public String checkField(TextField s){
        String stroka;
        if(!s.getText().trim().isEmpty()){
            stroka = s.getText();
        }
        else{stroka="";}
        return stroka;
    }


    public void printClient(String dogovor){

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
//                Process PROfile = null;
//                try {
//                    forClientTable u = basicTable.getSelectionModel().getSelectedItem();
//                    String str = String.format("{\"address\":\"%s\",\"Client\":\"%s\"," +
//                                    "\"Pribor\":\"%s\",\"Zavodnumber\":\"%s\"," +
//                                    "\"GoodOrBad\":\"%s\",\"PokazBegin\":\"%s\"," +
//                                    "\"PokazEnd\":\"%s\",\"Izmer\":\"%s\"," +
//                                    "\"DataSnyatya\":\"%s\",\"Montaj\":\"%s\"," +
//                                    "\"NewPribor\":\"%s\",\"dogovor\":\"%s\",\"method\":\"%s\"}",
//                            u.getAdress(),u.getClient(),u.getPribor(),u.getZavodnumber(),u.getGoodOrBad(),u.getPokazBegin(),u.getPokazEnd(),
//                            u.getIzmer(),u.getDataSnyatya(),u.getMontaj(),u.getNewPribor(),PrintClientTwo.getText(),"pechat");
//                    PROfile = Runtime.getRuntime().exec(new String[]{"flask\\docxWritter.exe", str});
//                    Thread.sleep(4000);
//                } catch (IOException | InterruptedException e) {
//                    e.printStackTrace();
//                }
                forClientTable u = basicTable.getSelectionModel().getSelectedItem();

                try {
//                    if (jJ.createEmployee(u, PrintClientTwo.getText())) {
//                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                        alert.setTitle("Печать");
//                        alert.setHeaderText(null);
//                        alert.setContentText("Печать прошла успешно, вы найдёте документ на рабочем столе в папке 'на печать' ");
//                        alert.showAndWait();
//
//                    } else {
//                        Alert alert = new Alert(Alert.AlertType.ERROR);
//                        alert.setTitle("Ошибка печати");
//                        alert.setContentText("ОШИБКА! Проверьте целостность данных");
//                        alert.showAndWait();}


                    URL url = new URL("http://"+getIP()+"/FlaskMaster/Download?docx_name="+js.createEmployee(u,dogovor));

                    InputStream inputStream = url.openStream();
                    //Path f = new File("B:\\google.docx").toPath();
                    File home = FileSystemView.getFileSystemView().getDefaultDirectory();

                    Files.copy(inputStream, new File(home.getAbsolutePath()+"\\"+u.getAdress().replace("/"," ")+dogovor+".docx").toPath(),StandardCopyOption.REPLACE_EXISTING);
                    home = null;
                    url = null;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Печать");
                    alert.setHeaderText(null);
                    alert.setContentText("Печать прошла успешно, вы найдёте документ в папку «Документы».");
                    alert.showAndWait();

                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Ошибка печати");
                    alert.setContentText("ОШИБКА! Файл уже существует или повреждена целостность данных");
                    alert.showAndWait();
                }

            }
        });
    }

    public void refreshTable(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                ClientForTables.clear();
                RabsForTable.clear();
                BankForTable.clear();
                CounterForTable.clear();
                ChoicePriborsZav.getItems().clear();
                NewPriborChoice.getItems().clear();
                personalityDownload(true, false);
                ChoiceRabot.getItems().clear();
                ChoicePribors.getItems().clear();
                ChoiceBanks.getItems().clear();
                RabsDownload(true);
                CounterDowload(true);
                BankDowload(true);
            }
        });
    }



    @FXML
    void initialize() {


        Platform.runLater(new Runnable() {
            @Override
            public void run() {

                personalityDownload(true, true);
                RabsDownload(true);
                CounterDowload(true);
                BankDowload(true);
                ZavkaDownload(true);
                NewPriborChoice.setDisable(true);
                NewPrice.setDisable(true);
                GoodOrBadChoicer.getItems().addAll("Годен", "Негоден");
                Izmer.getItems().addAll("кВтч", "МВтч", "Гкал");
                ObservableList<TableColumn<forClientTable, String>> TableColumns = FXCollections.observableArrayList(RabotnikTable, DataSnyatya, AdressTable, PriborTable, ZavodNumberTable, PokBeginTable, PokEndTable, PriceTable, ClientTable, NumberTable, ChoiceBankTable, BataryaBeginTable, BataryaEndTable, DataZameniTable, DataSending, NumberNakladTable, DataMontajTable, DEntrecesjTable, GoodOrBadTable, NewSumTable, GoodOrBadTable, NewPriborTable, EdinTable, LinkDocTable);
                //    String[] bat = {"BataryaBeginTable","BataryaEndTable", "DataZameniTable","DataSending","NumberNakladTable","DataMontajTable","OtvRab"};
                String[] s = {"RabotnikTable", "DataSnyatya", "AdressTable", "PriborTable", "ZavodNumberTable", "PokBeginTable", "PokEndTable", "PriceTable", "ClientTable", "NumberTable", "ChoiceBankTable", "BataryaBeginTable", "BataryaEndTable", "DataZameniTable", "DataSending", "NumberNakladTable", "DataMontajTable", "DEntrecesjTable", "GoodOrBadTable", "NewSumTable", "GoodOrBadTable", "NewPriborTable", "EdinTable", "LinkDocTable"};

                addButtonToTable();
                addButtonToTableTwo();
                OnlyCifra(Price);

                // OnlyCifra(ZavodNumber);


                OnlyCifra(ValueBegins);
                OnlyCifra(ValueEnds);
                OnlyCifra(Number);
                OnlyCifra(NumberNaklad);
                basicTable.setEditable(true);

                for (int i = 0; i < s.length; i++) {
                    editTable(TableColumns.get(i), s[i]);
                }
            }
        });
        SearchCategory.getItems().addAll("Адрес");
        SearchCategory.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal)
                -> {//reset table and textfield when new choice is selected
            if (newVal != null) {
                Search.setText("");
            }
        });
        Search.textProperty().addListener((obs, oldValue, newValue) -> {
            switch (SearchCategory.getValue())//Switch on choiceBox value
            {
                case "Адрес":
                    flPerson.setPredicate(p -> p.getAdress().toLowerCase().contains(newValue.toLowerCase().trim()));//filter table by first name
                    break;
                case "Заказчик":
                    flPerson.setPredicate(p -> p.getClient().toLowerCase().contains(newValue.toLowerCase().trim()));//filter table by email
                    break;
                case "Прибор":
                    flPerson.setPredicate(p -> p.getPribor().toLowerCase().contains(newValue.toLowerCase().trim()));//filter table by email
                    break;
                case "№ телефона":
                    flPerson.setPredicate(p -> p.getphone().toLowerCase().contains(newValue.toLowerCase().trim()));//filter table by email
                    break;
            }
        });

        GoodOrBadChoicer.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal)
                -> {//reset table and textfield when new choice is selected
            if (newVal == "Годен") {
                NewPrice.setDisable(true);
                NewPriborChoice.setDisable(true);
            }
            else{
                NewPrice.setDisable(false);
                NewPriborChoice.setDisable(false);
            }
        });

        ExcelDownload.setOnAction(actionEvent -> {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    FileChooser fc = new FileChooser();
                    FileChooser.ExtensionFilter extFilter =
                            new FileChooser.ExtensionFilter("EXCEL files (*.xlsx)", "*.xlsx");
                    fc.getExtensionFilters().add(extFilter);
                    File selectedFile = fc.showOpenDialog(null);

                    if (selectedFile != null){

                        //                        js.readExcel(selectedFile.getAbsolutePath()) ;
//                        js.readExcel(selectedFile.getAbsolutePath().replace("\\","\\\\"));

                        try {

//                        Socket socket = null;
//                        String host = "127.0.0.1";
//
//                        socket = new Socket(host, 8080);
//
//                        File file = new File(selectedFile.getAbsolutePath().replace("\\","\\\\"));
//                        // Get the size of the file
//                        long length = file.length();
//                        byte[] bytes = new byte[16 * 1024];
//                        InputStream in = new FileInputStream(file);
//                        OutputStream out = socket.getOutputStream();
//
//                        int count;
//                        while ((count = in.read(bytes)) > 0) {
//                            out.write(bytes, 0, count);
//                        }
//
//                        out.close();
//                        in.close();
//                        socket.close();
//                        String boundary = Long.toHexString(System.currentTimeMillis());
//                        URLConnection connection = new URL("http://127.0.0.1:8080/Upload").openConnection();
//                        connection.setDoOutput(true);
//                        connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
//                        File binaryFile = new File(selectedFile.getAbsolutePath().replace("\\","\\\\"));
//
//                        try (
//                                OutputStream output = connection.getOutputStream();
//                                PrintWriter writer = new PrintWriter(new OutputStreamWriter(output, "UTF-8"), true);
//                        ) {
//                            writer.append("--" + boundary).append("\r\n");
//                            writer.append("Content-Disposition: form-data; name=\"binaryFile\"; filename=\"" + binaryFile.getName() + "\"").append("\r\n");
//                            writer.append("Content-Type: " + URLConnection.guessContentTypeFromName(binaryFile.getName())).append("\r\n");
//                            writer.append("Content-Transfer-Encoding: binary").append("\r\n");
//                            writer.append("\r\n").flush();
//                            Files.copy(binaryFile.toPath(), output);
//                            output.flush(); // Important before continuing with writer!
//                            writer.append("\r\n").flush(); // CRLF is important! It indicates end of boundary.
//
//                            // End of multipart/form-data.
//                            writer.append("--" + boundary + "--").append("\r\n").flush();
//                        }
//
//
//// Request is lazily fired whenever you need to obtain information about response.
//                    int responseCode = ((HttpURLConnection) connection).getResponseCode();
//

//                        HttpConn send = new HttpConn();
//                        send.SendFile(selectedFile.getAbsolutePath().replace("\\","\\\\"));

                            js.UploadExcel(selectedFile.getAbsolutePath());


                            refreshTable();
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Загрузка Excel");
                            alert.setHeaderText(null);
                            alert.setContentText("Загрузка Excel прошла успешно");
                            alert.showAndWait();

                        } catch (IOException | InterruptedException | URISyntaxException e){
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Ошибка печати");
                            alert.setContentText("ОШИБКА! Проверьте целостность данных");
                            alert.showAndWait();
                        }

                    }
                }
            });
        });

        refresh.setOnAction(actionEvent -> {
            refreshTable();
        });
        Back.setOnAction(actionEvent -> {
            nextPage("Choice.fxml",Back.getScene().getWindow(),600,400, false);

            System.gc();
        });


//        addClient.setOnAction(actionEvent -> {
//            Platform.runLater(new Runnable() {
//                @Override
//                public void run() {
//                    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//                    Date date = new Date();
//                    if (!BataryBegin.getText().trim().isEmpty()) {
//
//                        DB.ClientAdder(ChoiceRabot.getValue(), dataDrawal.getValue(), adress.getText(), ChoicePribors.getValue(), ZavodNumber.getText(), ValueBegins.getText(), ValueEnds.getText(), Izmer.getValue(), Price.getText(), Client.getText(), Number.getText(), ChoiceBanks.getValue(), GoodOrBadChoicer.getValue(), NewPrice.getText(), NewPriborChoice.getValue(), checkField(BataryBegin), checkField(BataryaEnd), checkField(DataZameni), checkField(DataSend), checkField(DataMontaj), checkField(NumberNaklad), checkField(DEntreces),checkField(LinkText), dateFormat.format(date));
//                        personalityDownload(false, false);
//                        ZavodNumber.setText("");
//                        ValueBegins.setText("");
//                        ValueEnds.setText("");
//                        Price.setText("");
//                        Client.setText("");
//                        Number.setText("");
//                    } else {
//                        DB.ClientAdder(ChoiceRabot.getValue(), dataDrawal.getValue(), adress.getText(), ChoicePribors.getValue(), ZavodNumber.getText(), ValueBegins.getText(), ValueEnds.getText(), Izmer.getValue(), Price.getText(), Client.getText(), Number.getText(), ChoiceBanks.getValue(), GoodOrBadChoicer.getValue(), NewPrice.getText(), NewPriborChoice.getValue(), dateFormat.format(date));
//                        personalityDownload(false, false);
//                        ZavodNumber.setText("");
//                        ValueBegins.setText("");
//                        ValueEnds.setText("");
//                        Price.setText("");
//                        Client.setText("");
//                        Number.setText("");
//                    }
//
//                }
//            });
//
//        });
        addClient.setOnAction(actionEvent -> {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    try {
//                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//                        Date date = new Date();
                        //     if ((dataDrawal!=null)&(DataZameni!=null)&(DataSend!=null)&(DataMontaj!=null)&(DEntreces!=null)) {

                        DB.ClientAdder(ChoiceRabot.getValue(), checkField(dataDrawal), adress.getText(), ChoicePribors.getValue(), ZavodNumber.getText(), ValueBegins.getText(), ValueEnds.getText(), Izmer.getValue(), Price.getText(), Client.getText(), Number.getText(), ChoiceBanks.getValue(), GoodOrBadChoicer.getValue(), NewPrice.getText(), NewPriborChoice.getValue(), checkField(BataryBegin), checkField(BataryaEnd), checkField(DataZameni), checkField(DataSend), checkField(DataMontaj), checkField(NumberNaklad), checkField(DEntreces), checkField(LinkText), DB.getDate());

//                    } else if((dataDrawal!=null)&(DataZameni!=null)&(DataSend!=null)&(DataMontaj!=null)) {
//                        DB.ClientAdder(ChoiceRabot.getValue(), dataDrawal.getValue(), adress.getText(), ChoicePribors.getValue(), ZavodNumber.getText(), ValueBegins.getText(), ValueEnds.getText(), Izmer.getValue(), Price.getText(), Client.getText(), Number.getText(), ChoiceBanks.getValue(), GoodOrBadChoicer.getValue(), NewPrice.getText(), NewPriborChoice.getValue(), dateFormat.format(date));
//
//                    } else if((dataDrawal!=null)&(DataZameni!=null)&(DataSend!=null)) {
//                        DB.ClientAdder(ChoiceRabot.getValue(), dataDrawal.getValue(), adress.getText(), ChoicePribors.getValue(), ZavodNumber.getText(), ValueBegins.getText(), ValueEnds.getText(), Izmer.getValue(), Price.getText(), Client.getText(), Number.getText(), ChoiceBanks.getValue(), GoodOrBadChoicer.getValue(), NewPrice.getText(), NewPriborChoice.getValue(), dateFormat.format(date));
//
//                    }else if((dataDrawal!=null)&(DataZameni!=null)) {
//                        DB.ClientAdder(ChoiceRabot.getValue(), dataDrawal.getValue(), adress.getText(), ChoicePribors.getValue(), ZavodNumber.getText(), ValueBegins.getText(), ValueEnds.getText(), Izmer.getValue(), Price.getText(), Client.getText(), Number.getText(), ChoiceBanks.getValue(), GoodOrBadChoicer.getValue(), NewPrice.getText(), NewPriborChoice.getValue(), dateFormat.format(date));
//
//                    }else if((dataDrawal!=null)&(DataZameni!=null)&(DataSend!=null)&(DataMontaj!=null)) {
//                        DB.ClientAdder(ChoiceRabot.getValue(), dataDrawal.getValue(), adress.getText(), ChoicePribors.getValue(), ZavodNumber.getText(), ValueBegins.getText(), ValueEnds.getText(), Izmer.getValue(), Price.getText(), Client.getText(), Number.getText(), ChoiceBanks.getValue(), GoodOrBadChoicer.getValue(), NewPrice.getText(), NewPriborChoice.getValue(), dateFormat.format(date));
//
//                    }
                        personalityDownload(false, false);
                        ChoiceRabot.setValue(null);
                        dataDrawal.setValue(null);
                        adress.clear();
                        ZavodNumber.clear();
                        ValueBegins.clear();
                        ValueEnds.clear();
                        Price.clear();
                        Client.clear();
                        Number.clear();
                        ChoicePribors.setValue(null);
                        ZavodNumber.clear();
                        ValueBegins.clear();
                        ValueEnds.clear();
                        Izmer.setValue(null);
                        Price.clear();
                        Client.clear();
                        Number.clear();
                        ChoiceBanks.setValue(null);
                        GoodOrBadChoicer.setValue(null);
                        NewPrice.clear();
                        NewPriborChoice.setValue(null);
                        BataryBegin.clear();
                        BataryaEnd.clear();
                        DataZameni.setValue(null);
                        DataSend.setValue(null);
                        NumberNaklad.clear();
                        DataMontaj.setValue(null);
                        DEntreces.setValue(null);
                        LinkText.clear();
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Успешное добавление");
                        alert.setHeaderText(null);
                        alert.setContentText("Клиент добавлен");
                        alert.showAndWait();
                    }catch (NullPointerException e){
                        e.printStackTrace();
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Ошибка");
                        alert.setContentText("Проверьте целостность данных");
                        alert.showAndWait();
                    }
                }
            });

        });




        addClientZav.setOnAction(actionEvent -> {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    DB.ZayavAdder(ClientZav.getText(), adressZav.getText(), NumberZav.getText(), ChoicePriborsZav.getValue());
                    ZavkaDownload(false);
                    ClientZav.clear();
                    adressZav.clear();
                    NumberZav.clear();
                }
            });
        });

//        PrintClientTwo.setOnAction(actionEvent -> {
//            forClientTable u = basicTable.getSelectionModel().getSelectedItem();
//            Platform.runLater(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        docx.printWithPython(u, PrintClientTwo.getText());
//
//                    } catch (IOException | InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        });
        printTwo.setOnAction(actionEvent1 -> {
            printClient(PrintClientTwo.getText());
        });

//        PrintClientOne.setOnAction(actionEvent -> {
//            forClientTable u = basicTable.getSelectionModel().getSelectedItem();
//            Platform.runLater(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        docx.printWithPython(u, PrintClientOne.getText());
//                    } catch (IOException | InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        });
        print.setOnAction(actionEvent1 -> {
            printClient(PrintClientOne.getText());
        });

        AddRab.setOnAction(actionEvent -> {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    DB.RabAdder(RabFam.getText(), RabNumber.getText());
                    RabFam.setText("");
                    RabNumber.setText("");
                    RabsDownload(false);

                }
            });


        });

        AddCount.setOnAction(actionEvent -> {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    DB.CountAdder(NameCount.getText(), NomerCount.getText());
                    NameCount.setText("");
                    NomerCount.setText("");
                    CounterDowload(false);
                }
            });
        });

        AddBank.setOnAction(actionEvent -> {
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    DB.BankAdder(BankVvod.getText());
                    BankVvod.setText("");
                    BankDowload(false);
                }
            });
        });
        changeClient.setOnAction(actionEvent -> {

            Platform.runLater(new Runnable() {
                @Override
                public void run() {

                    forClientTable u = basicTable.getSelectionModel().getSelectedItem();

                    if (DB.DataGetter(u.getDateCreate()) | getinp()) {

//                        if (u.getDataZameny() != null & u.getDataSend() != null & u.getMontaj() != null & u.getDEntreces() != null) {
                        DB.UpdateClients(u.getidClients(), u.getRabotnik(), u.getDataSnyatya(), u.getAdress(), u.getPribor(), u.getZavodnumber(), u.getPokazBegin(), u.getPokazEnd(), u.getIzmer(), u.getPrice(), u.getClient(), u.getphone(), u.getPay(), u.getGoodOrBad(), u.getNewSum(), u.getNewPribor(), u.getBataryBegin(), u.getBataryEnd(), u.getDataZameny(), u.getDataSend(), u.getMontaj(), u.getDEntreces(),u.getLinkDoc(), u.getNumberNaklad());
//
//                        }
//
//                        if ((u.getDataZameny() == null) | (u.getDataSend() == null) | (u.getMontaj() == null) | (u.getDEntreces() == null)) {
//                            DB.UpdateClients(u.getidClients(), u.getRabotnik(), u.getAdress(), u.getPribor(), u.getZavodnumber(), u.getPokazBegin(), u.getPokazEnd(), u.getIzmer(), u.getPrice(), u.getClient(), u.getphone(), u.getPay(), u.getGoodOrBad(), u.getNewSum(), u.getNewPribor(), u.getBataryBegin(), u.getBataryEnd(), u.getNumberNaklad(),u.getLinkDoc());
//
//                            if (u.getDataZameny() != null) {
//                                DB.UpdateDats(u.getidClients(), u.getDataZameny(), "DataZameny");
//                            }
//                            if (u.getDataSnyatya() != null) {
//                                DB.UpdateDats(u.getidClients(), u.getDataSnyatya(), "DataSnyatya");
//                            }
//                            if (u.getDataSend() != null) {
//                                DB.UpdateDats(u.getidClients(), u.getDataSend(), "DataSend");
//                            }
//                            if (u.getMontaj() != null) {
//                                DB.UpdateDats(u.getidClients(), u.getMontaj(), "Montaj");
//                            }
//                            if (u.getDEntreces() != null) {
//                                DB.UpdateDats(u.getidClients(), u.getDEntreces(), "DEntraces");
//                            }

//                        }
                    } else {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Ошибка");
                        alert.setHeaderText(null);
                        alert.setContentText("У вас недостаточно прав. Обратитесь к администратору");
                        alert.showAndWait();
                    }
                }
            });
        });

//        expandClient.setOnAction(actionEvent -> {
//            forClientTable u = basicTable.getSelectionModel().getSelectedItem();
//            if(DB.DataGetter(u.getDateCreate()) | getinp()) {
//                if (DataZameni.getValue() != null & DataSend.getValue() != null & DataMontaj.getValue() != null & DEntreces.getValue() != null) {
//
//                    DB.UpdateBatarey(u.getidClients(), BataryBegin.getText(), BataryaEnd.getText(), DataZameni.getValue(), DataSend.getValue(), DataMontaj.getValue(), DEntreces.getValue(), NumberNaklad.getText());
//                }
//                if ((DataZameni.getValue() == null) | (DataSend.getValue() == null) | (DataMontaj.getValue() == null) | (DEntreces.getValue() == null)) {
//
//                    DB.UpdateBatarey(u.getidClients(), BataryBegin.getText(), BataryaEnd.getText(), NumberNaklad.getText());
//                    if (DataZameni.getValue() != null) {
//
//                        DB.UpdateDats(u.getidClients(), String.valueOf(DataZameni.getValue()), "DataZameny");
//                    }
//                    if (DataSend.getValue() != null) {
//
//                        DB.UpdateDats(u.getidClients(), String.valueOf(DataSend.getValue()), "DataSend");
//                    }
//                    if (DataMontaj.getValue() != null) {
//
//                        DB.UpdateDats(u.getidClients(), String.valueOf(DataMontaj.getValue()), "Montaj");
//                    }
//                    if (DEntreces.getValue() != null) {
//
//                        DB.UpdateDats(u.getidClients(), String.valueOf(DEntreces.getValue()), "DEntreces");
//                    }
//                }
//
//
//                u.setBataryBegin(BataryBegin.getText());
//                u.setBataryEnd(BataryaEnd.getText());
//                u.setDataZameny(String.valueOf(DataZameni.getValue()));
//                u.setDataSend(String.valueOf(DataSend.getValue()));
//                u.setMontaj(String.valueOf(DataMontaj.getValue()));
//                u.setDEntreces(String.valueOf(DEntreces.getValue()));
//                u.setNumberNaklad(NumberNaklad.getText());
//                u.setGoodOrBad(GoodOrBadChoicer.getValue());
//            }
//            else{
//                Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                alert.setTitle("Ошибка");
//                alert.setHeaderText(null);
//                alert.setContentText("У вас недостаточно прав. Обратитесь к администратору");
//                alert.showAndWait();
//
//            }
//        });
        removeClient.setOnAction(actionEvent -> {


                    forClientTable u = basicTable.getSelectionModel().getSelectedItem();

                    DB.Deletets(u.getidClients(), "Client");
            try {
                ClientForTables.remove(basicTable.getSelectionModel().getSelectedIndex());
//                basicTable.getItems().remove(basicTable.getSelectionModel().getSelectedItem());
            }catch (UnsupportedOperationException e){

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ошибка");
                alert.setHeaderText(null);
                alert.setContentText(":(\nклиент был удалён, но графический элемент <<Таблицы>> был перегружен. Пожалуйста перезайдите в окно с таблицами");
                alert.showAndWait();
            }

                    //basicTable.getItems().removeAll(basicTable.getSelectionModel().getSelectedItem());

        });
        RemoveClientZav.setOnAction(actionEvent -> {

                    int rowNumService = ZayavkaTable.getSelectionModel().getSelectedIndex();
                    forZayvkaTable u = ZayavkaTable.getSelectionModel().getSelectedItem();
                    DB.Deletets(u.getidClients(), "Zav");
                    ZayvkaForTable.remove(rowNumService);

        });
        RemoveAllClientZav.setOnAction(actionEvent -> {

                    DB.RemoveAllZayavka();
                    ZayvkaForTable.clear();
                    ZayavkaTable.getItems().removeAll();

        });
        DeleteRab.setOnAction(actionEvent -> {


                    int rowNumService = Rabotniki.getSelectionModel().getSelectedIndex();
                    forRabsTable u = Rabotniki.getSelectionModel().getSelectedItem();
                    DB.Deletets(u.getidRab(), "Rab");
                    RabsForTable.remove(rowNumService);

                    ChoiceRabot.getItems().remove(rowNumService);

        });
        DeleteCount.setOnAction(actionEvent -> {

                    int rowNumService = TableCounters.getSelectionModel().getSelectedIndex();
                    forCounterTable u = TableCounters.getSelectionModel().getSelectedItem();
                    DB.Deletets(u.getidCount(), "Count");
                    TableCounters.getItems().remove(rowNumService);
                    ChoicePribors.getItems().remove(rowNumService);

        });
        DeleteBank.setOnAction(actionEvent -> {

                    int rowNumService = Bank.getSelectionModel().getSelectedIndex();
                    forBankTable u = Bank.getSelectionModel().getSelectedItem();
                    DB.Deletets(u.getidPay(), "Bank");
                    Bank.getItems().remove(rowNumService);
                    ChoiceBanks.getItems().remove(rowNumService);

        });
    }
}

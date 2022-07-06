package com.example.work;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class DBHandler extends jsonJava{
    Connection dbConnection;





    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        //System.out.println(connectString);

        dbConnection = DriverManager.getConnection(connectString, dbUser, dbPassword);

        return dbConnection;
    }

    public void Cicle(){
        String insert = "INSERT INTO clients (Rabotnik, DataSnyatya, Adress, Pribor, Zavodnumber, PokazBegin, PokazEnd, Price, Client, phone, Pay) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        for(int i=0;i<1000;i++) {
            try {
                PreparedStatement prSt = getDbConnection().prepareStatement(insert);
                prSt.setString(1, "rab");
                prSt.setString(2, "2002-09-02");
                prSt.setString(3, "adress");
                prSt.setString(4, "pribor");
                prSt.setString(5, "number");
                prSt.setString(6, "ValueBegin");
                prSt.setString(7, "ValueEnd");
                prSt.setString(8, "Price");
                prSt.setString(9, "Client");
                prSt.setString(10, "phoneNumber");
                prSt.setString(11, "bank");

                prSt.executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void ClientAdder(String adress, String pribor,  String Client, String phoneNumber, String DateCreate) {
        String insert = "INSERT INTO " + Constants.CLIENTS_TABLE + "(" +
                Constants.CLIENTS_ADRESS + "," + Constants.CLIENTS_PRIBOR + ","
                + Constants.CLIENTS_CLIENT + "," + Constants.CLIENTS_PHONE +"," + Constants.CLIENTS_DATECREATE +")" +
                "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, adress);
            prSt.setString(2, pribor);
            prSt.setString(3, Client);
            prSt.setString(4, phoneNumber);
            prSt.setDate(5, Date.valueOf(DateCreate));


            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void ClientAdder(String rab, String dataSnyatiya, String adress, String pribor, String number, String ValueBegin, String ValueEnd, String izm, String Price, String Client, String phoneNumber, String bank, String GoodOrBad, String NewSum, String NewPribor, String DateCreate) {

        String insert = "INSERT INTO " + Constants.CLIENTS_TABLE + "(" +
                Constants.CLIENTS_Rab + "," + Constants.CLIENTS_DATASNYTYA + ","
                + Constants.CLIENTS_ADRESS + "," + Constants.CLIENTS_PRIBOR + ","
                + Constants.CLIENTS_ZAVNUMBER + "," + Constants.CLIENTS_PBEGIN + ","
                + Constants.CLIENTS_PEND + "," + Constants.CLIENTS_IZM + ","+ Constants.CLIENTS_PRICE + ","
                + Constants.CLIENTS_CLIENT + "," + Constants.CLIENTS_PHONE + ","
                + Constants.CLIENTS_PAY +","+ Constants.CLIENTS_GOOD+"," + Constants.CLIENTS_NEWSUM +","+ Constants.CLIENTS_NEWPRIBOR +","  +Constants.CLIENTS_DATECREATE + ")" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, rab);
            prSt.setString(2, dataSnyatiya);
            prSt.setString(3, adress);
            prSt.setString(4, pribor);
            prSt.setString(5,number);
            prSt.setString(6, ValueBegin);
            prSt.setString(7, ValueEnd);
            prSt.setString(8, izm);
            prSt.setString(9, Price);
            prSt.setString(10, Client);
            prSt.setString(11, phoneNumber);
            prSt.setString(12, bank);
            prSt.setString(13, GoodOrBad);
            prSt.setString(14, NewSum);
            prSt.setString(15, NewPribor);

            prSt.setDate(16, Date.valueOf(DateCreate));

            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Boolean DataGetter(String s) {
        String select = "SELECT CURRENT_DATE()";
        Boolean b = false;
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet res = prSt.executeQuery(select);
            while (res.next()){
                if (s.equals(res.getString("CURRENT_DATE()"))){
                    System.out.println(res.getString("CURRENT_DATE()"));
                    b=true;
                }

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return b;
    }

    public String getDate() {
        String select = "SELECT CURRENT_DATE()";
        String s = null;
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet res = prSt.executeQuery(select);
            while (res.next()){
                s = res.getString("CURRENT_DATE()");

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }


        public void ClientAdder(String rab, String dataSnyatiya, String adress, String pribor, String number, String ValueBegin, String ValueEnd,String izm, String Price, String Client, String phoneNumber, String bank, String GoodOrBad,String NewSum, String NewPribor,  String BataryBegin, String BataryaEnd, String DataZameni, String DataSend, String DataMontaj, String NumberNaklad, String DEntrace, String LinkDoc, String DateCreate) {

        String insert = "INSERT INTO " + Constants.CLIENTS_TABLE + "(" +
                Constants.CLIENTS_Rab + "," + Constants.CLIENTS_DATASNYTYA + ","
                + Constants.CLIENTS_ADRESS + "," + Constants.CLIENTS_PRIBOR + ","
                + Constants.CLIENTS_ZAVNUMBER + "," + Constants.CLIENTS_PBEGIN + ","
                + Constants.CLIENTS_PEND + ","+ Constants.CLIENTS_IZM + "," + Constants.CLIENTS_PRICE + ","
                + Constants.CLIENTS_CLIENT + "," + Constants.CLIENTS_PHONE + ","
                + Constants.CLIENTS_PAY+","+ Constants.CLIENTS_GOOD+"," + Constants.CLIENTS_NEWSUM+","+ Constants.CLIENTS_NEWPRIBOR+"," + Constants.CLIENTS_BATBEGIN+ "," + Constants.CLIENTS_BATEND+ ","
                + Constants.CLIENTS_DATAZAMENY+ ","  + Constants.CLIENTS_DATASEND+ ","
                + Constants.CLIENTS_NUMBERNAKLAD+ "," + Constants.CLIENTS_MONTAJ+"," + Constants.CLIENTS_DENTRACE+","+ Constants.CLIENTS_LDoc+"," +Constants.CLIENTS_DATECREATE +")" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, rab);
            prSt.setString(2, dataSnyatiya);
            prSt.setString(3, adress);
            prSt.setString(4, pribor);
            prSt.setString(5,number);
            prSt.setString(6, ValueBegin);
            prSt.setString(7, ValueEnd);
            prSt.setString(8, izm);
            prSt.setString(9, Price);
            prSt.setString(10, Client);
            prSt.setString(11, phoneNumber);
            prSt.setString(12, bank);
            prSt.setString(13, GoodOrBad);
            prSt.setString(14, NewSum);
            prSt.setString(15, NewPribor);
            prSt.setString(16, BataryBegin);
            prSt.setString(17, BataryaEnd);
            prSt.setString(18, DataZameni);
            prSt.setString(19, DataSend);
            prSt.setString(20, NumberNaklad);
            prSt.setString(21,DataMontaj);
            prSt.setString(22, DEntrace);
            prSt.setString(23,LinkDoc);
            prSt.setDate(24, Date.valueOf(DateCreate));
            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void ZayavAdder(String Client, String Adres, String Phone, String pribor) {

        String insert = "INSERT INTO " + Constants.Zayvka_TABLE + "(" + Constants.Zayvka_CLIENT+","+
                Constants.Zayvka_ADRES + "," + Constants.Zayvka_PHONE + "," +Constants.Zayvka_PRIBOR + ")" +
                "VALUES(?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, Client);
            prSt.setString(2, Adres);
            prSt.setString(3, Phone);
            prSt.setString(4, pribor);
            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void RabAdder(String RabFam, String RabNumber) {

        String insert = "INSERT INTO " + Constants.CLIENTS_RABS + "(" +
                Constants.CLIENTS_FIO + "," + Constants.CLIENTS_PRAB + ")" +
                "VALUES(?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, RabFam);
            prSt.setString(2, RabNumber);
            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getZayavka() {
        String select = "SELECT * FROM " + Constants.Zayvka_TABLE;
        ArrayList<String> zayavki = new ArrayList<>();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet res = prSt.executeQuery(select);
            while (res.next()) {
                zayavki.add(res.getString(Constants.Zayvka_ID));
                zayavki.add(res.getString(Constants.Zayvka_CLIENT));
                zayavki.add(res.getString(Constants.Zayvka_ADRES));
                zayavki.add(res.getString(Constants.Zayvka_PHONE));
                zayavki.add(res.getString(Constants.Zayvka_PRIBOR));
                zayavki.add(res.getString(Constants.Zayvka_STATUS));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return zayavki;
    }

    public ArrayList<String> getRabs() {
        String select = "SELECT * FROM " + Constants.CLIENTS_RABS;
        ArrayList<String>RabsForTable = new ArrayList<>();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet res = prSt.executeQuery(select);
            while (res.next()) {
                RabsForTable.add(res.getString(Constants.CLIENTS_RABID));
                RabsForTable.add(res.getString(Constants.CLIENTS_FIO));
                RabsForTable.add(res.getString(Constants.CLIENTS_PRAB));

            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return RabsForTable;
    }

    public void CountAdder(String NameCount, String NomerCount) {

        String insert = "INSERT INTO " + Constants.CLIENTS_COUNTERS + "(" +
                Constants.CLIENTS_NAMEC + "," + Constants.CLIENTS_ABOUT + ")" +
                "VALUES(?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, NameCount);
            prSt.setString(2, NomerCount);
            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<String> getCounters() {
        String select = "SELECT * FROM " + Constants.CLIENTS_COUNTERS;
        ArrayList<String>CounterForTable = new ArrayList<>();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet res = prSt.executeQuery(select);
            while (res.next()) {
                CounterForTable.add(res.getString(Constants.CLIENTS_COUNTID));
                CounterForTable.add(res.getString(Constants.CLIENTS_NAMEC));
                CounterForTable.add(res.getString(Constants.CLIENTS_ABOUT));

            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return CounterForTable;
    }

    public ArrayList<String> getBanks() {
        String select = "SELECT * FROM " + Constants.CLIENTS_TBANKS;
        ArrayList<String>BankForTable = new ArrayList<>();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet res = prSt.executeQuery(select);
            while (res.next()) {
                BankForTable.add(res.getString(Constants.CLIENTS_IDPAY));
                BankForTable.add(res.getString(Constants.CLIENTS_NAMEBANK));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return BankForTable;
    }

    public void BankAdder(String BankTable) {
        String insert = "INSERT INTO " + Constants.CLIENTS_TBANKS + "(" + Constants.CLIENTS_NAMEBANK + ")" +
                "VALUES(?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, BankTable);
            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public ArrayList<String> getClients() {

        String select = "SELECT * FROM " + Constants.CLIENTS_TABLE;
        ArrayList<String>clientForTable = new ArrayList<>();
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet res = prSt.executeQuery(select);
            while (res.next()) {
                clientForTable.add(res.getString(Constants.CLIENTS_ID));
                clientForTable.add(res.getString(Constants.CLIENTS_Rab));
                clientForTable.add(res.getString(Constants.CLIENTS_DATASNYTYA));
                clientForTable.add(res.getString(Constants.CLIENTS_ADRESS));
                clientForTable.add(res.getString(Constants.CLIENTS_ZAVNUMBER));
                clientForTable.add(res.getString(Constants.CLIENTS_PRIBOR));
                clientForTable.add(res.getString(Constants.CLIENTS_PBEGIN));
                clientForTable.add(res.getString(Constants.CLIENTS_PEND));
                clientForTable.add(res.getString(Constants.CLIENTS_IZM));
                clientForTable.add(res.getString(Constants.CLIENTS_PRICE));
                clientForTable.add(res.getString(Constants.CLIENTS_CLIENT));
                clientForTable.add(res.getString(Constants.CLIENTS_PHONE));
                clientForTable.add(res.getString(Constants.CLIENTS_PAY));
                clientForTable.add(res.getString(Constants.CLIENTS_GOOD));
                clientForTable.add(res.getString(Constants.CLIENTS_NEWSUM));
                clientForTable.add(res.getString(Constants.CLIENTS_NEWPRIBOR));
                clientForTable.add(res.getString(Constants.CLIENTS_BATBEGIN));
                clientForTable.add(res.getString(Constants.CLIENTS_BATEND));
                clientForTable.add(res.getString(Constants.CLIENTS_DATAZAMENY));
                clientForTable.add(res.getString(Constants.CLIENTS_DATASEND));
                clientForTable.add(res.getString(Constants.CLIENTS_NUMBERNAKLAD));
                clientForTable.add(res.getString(Constants.CLIENTS_MONTAJ));
                clientForTable.add(res.getString(Constants.CLIENTS_DENTRACE));
                clientForTable.add(res.getString(Constants.CLIENTS_LDoc));
                clientForTable.add(res.getString(Constants.CLIENTS_DATECREATE));

            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientForTable;
    }


    public void UpdateClients(Integer id, String rab, String dataSnyatiya, String adress, String pribor, String number, String ValueBegin, String ValueEnd, String izm, String Price, String Client, String phoneNumber, String bank, String GoodOrBad, String NewSum, String NewPribor, String BataryBegin, String BataryaEnd, String DataZameni, String DataSend, String DataMontaj, String DEntraces, String LinkDoc, String NumberNaklad) {
        String query = "UPDATE " + Constants.CLIENTS_TABLE + " SET " +
                Constants.CLIENTS_Rab+ " = (?)," + Constants.CLIENTS_DATASNYTYA+ " = (?),"
                + Constants.CLIENTS_ADRESS+ " = (?),"  + Constants.CLIENTS_PRIBOR+ " = (?),"
                + Constants.CLIENTS_ZAVNUMBER+ " = (?)," + Constants.CLIENTS_PBEGIN+ " = (?),"
                + Constants.CLIENTS_PEND+ " = (?),"+ Constants.CLIENTS_IZM+ " = (?)," + Constants.CLIENTS_PRICE+ " = (?),"
                + Constants.CLIENTS_CLIENT+ " = (?)," + Constants.CLIENTS_PHONE+ " = (?),"
                + Constants.CLIENTS_PAY +" = (?)," + Constants.CLIENTS_GOOD +" = (?),"+ Constants.CLIENTS_NEWSUM +" = (?),"+ Constants.CLIENTS_NEWPRIBOR +" = (?)," + Constants.CLIENTS_BATBEGIN+ " = (?)," + Constants.CLIENTS_BATEND+ " = (?),"
                + Constants.CLIENTS_DATAZAMENY+ " = (?),"  + Constants.CLIENTS_DATASEND+ " = (?),"
                + Constants.CLIENTS_NUMBERNAKLAD+ " = (?)," + Constants.CLIENTS_MONTAJ+ " = (?),"+ Constants.CLIENTS_DENTRACE+ " = (?)," + Constants.CLIENTS_LDoc+ " = (?) WHERE " + Constants.CLIENTS_ID + " = " + "'" + id + "'";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(query);
            prSt.setString(1, rab);
            prSt.setString(2, dataSnyatiya);
            prSt.setString(3, adress);
            prSt.setString(4, pribor);
            prSt.setString(5,number);
            prSt.setString(6, ValueBegin);
            prSt.setString(7, ValueEnd);
            prSt.setString(8, izm);
            prSt.setString(9, Price);
            prSt.setString(10, Client);
            prSt.setString(11, phoneNumber);
            prSt.setString(12, bank);
            prSt.setString(13, GoodOrBad);
            prSt.setString(14, NewSum);
            prSt.setString(15, NewPribor);
            prSt.setString(16, BataryBegin);
            prSt.setString(17, BataryaEnd);
            prSt.setString(18, DataZameni);
            prSt.setString(19, DataSend);
            prSt.setString(20, NumberNaklad);
            prSt.setString(21,DataMontaj);
            prSt.setString(22,DEntraces);
            prSt.setString(23,LinkDoc);




            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void UpdateClients(Integer id, String rab, String adress, String pribor, String number, String ValueBegin, String ValueEnd, String izm, String Price, String Client, String phoneNumber, String bank,String GoodOrBad, String NewSum, String NewPribor,String BataryBegin, String BataryaEnd, String NumberNaklad,String LincDoc) {
        String query = "UPDATE " + Constants.CLIENTS_TABLE + " SET " +
                Constants.CLIENTS_Rab+ " = (?),"
                + Constants.CLIENTS_ADRESS+ " = (?),"  + Constants.CLIENTS_PRIBOR+ " = (?),"
                + Constants.CLIENTS_ZAVNUMBER+ " = (?)," + Constants.CLIENTS_PBEGIN+ " = (?),"
                + Constants.CLIENTS_PEND+ " = (?)," + Constants.CLIENTS_IZM+ " = (?),"+ Constants.CLIENTS_PRICE+ " = (?),"
                + Constants.CLIENTS_CLIENT+ " = (?)," + Constants.CLIENTS_PHONE+ " = (?),"
                + Constants.CLIENTS_PAY +" = (?),"+ Constants.CLIENTS_GOOD +" = (?),"+ Constants.CLIENTS_NEWSUM +" = (?),"+ Constants.CLIENTS_NEWPRIBOR +" = (?)," + Constants.CLIENTS_BATBEGIN+ " = (?)," + Constants.CLIENTS_BATEND+ " = (?),"
                + Constants.CLIENTS_NUMBERNAKLAD+ " = (?),"+ Constants.CLIENTS_LDoc+ " = (?) WHERE " + Constants.CLIENTS_ID + " = " + "'" + id + "'";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(query);
            prSt.setString(1, rab);
            prSt.setString(2, adress);
            prSt.setString(3, pribor);
            prSt.setString(4,number);
            prSt.setString(5, ValueBegin);
            prSt.setString(6, ValueEnd);
            prSt.setString(7, izm);
            prSt.setString(8, Price);
            prSt.setString(9, Client);
            prSt.setString(10, phoneNumber);
            prSt.setString(11, bank);
            prSt.setString(12, GoodOrBad);
            prSt.setString(13, NewSum);
            prSt.setString(14, NewPribor);
            prSt.setString(15, BataryBegin);
            prSt.setString(16, BataryaEnd);
            prSt.setString(17, NumberNaklad);
            prSt.setString(18, LincDoc);



            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void UpdateDats(Integer id, String updateDate, String dats){
        String query;
        switch (dats){
            case("DataZameny"):
                query = "UPDATE " + Constants.CLIENTS_TABLE + " SET " + Constants.CLIENTS_DATAZAMENY+ " = (?) WHERE " + Constants.CLIENTS_ID + " = " + "'" + id + "'";
                break;
            case("DataSnyatya"):
                query = "UPDATE " + Constants.CLIENTS_TABLE + " SET " + Constants.CLIENTS_DATASNYTYA+ " = (?) WHERE " + Constants.CLIENTS_ID + " = " + "'" + id + "'";
                break;
            case("DataSend"):
                query = "UPDATE " + Constants.CLIENTS_TABLE + " SET " + Constants.CLIENTS_DATASEND+ " = (?) WHERE " + Constants.CLIENTS_ID + " = " + "'" + id + "'";
                break;
            case("Montaj"):
                query = "UPDATE " + Constants.CLIENTS_TABLE + " SET " + Constants.CLIENTS_MONTAJ+ " = (?) WHERE " + Constants.CLIENTS_ID + " = " + "'" + id + "'";
                break;
            case("DEntraces"):
                query = "UPDATE " + Constants.CLIENTS_TABLE + " SET " + Constants.CLIENTS_DENTRACE+ " = (?) WHERE " + Constants.CLIENTS_ID + " = " + "'" + id + "'";
                break;
            default:
                query = "UPDATE " + Constants.CLIENTS_TABLE + " SET " + Constants.CLIENTS_DATAZAMENY+ " = (?) WHERE " + Constants.CLIENTS_ID + " = " + "'" + id + "'";
                break;
        }
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(query);
            prSt.setDate(1, Date.valueOf(updateDate));
            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }





    public void UpdateBatarey(Integer id, String BataryBegin, String BataryaEnd, LocalDate DataZameni, LocalDate DataSend, LocalDate DataMontaj, LocalDate DEntrces, String NumberNaklad,String LinkDoc) {
        String query = "UPDATE " + Constants.CLIENTS_TABLE + " SET " +
                Constants.CLIENTS_BATBEGIN+ " = (?)," + Constants.CLIENTS_BATEND+ " = (?),"
                + Constants.CLIENTS_DATAZAMENY+ " = (?),"  + Constants.CLIENTS_DATASEND+ " = (?),"
                + Constants.CLIENTS_MONTAJ+ " = (?)," + Constants.CLIENTS_DENTRACE+ " = (?)," + Constants.CLIENTS_LDoc+ " = (?)," + Constants.CLIENTS_NUMBERNAKLAD+  " = (?) WHERE " + Constants.CLIENTS_ID + " = " + "'" + id + "'";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(query);
            prSt.setString(1, BataryBegin);
            prSt.setString(2, BataryaEnd);
            prSt.setDate(3, Date.valueOf(DataZameni));
            prSt.setDate(4, Date.valueOf(DataSend));
            prSt.setDate(5,Date.valueOf(DataMontaj));
            prSt.setDate(6,Date.valueOf(DEntrces));
            prSt.setString(7, NumberNaklad);
            prSt.setString(7, LinkDoc);

            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void UpdateStatusZayvki(Integer id, String Status) {
        String query = "UPDATE " + Constants.Zayvka_TABLE + " SET " +
                Constants.Zayvka_STATUS+ " = (?) WHERE " + Constants.Zayvka_ID + " = " + "'" + id + "'";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(query);
            prSt.setString(1, Status);

            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void UpdateBatarey(Integer id, String BataryBegin, String BataryaEnd, String NumberNaklad) {
        String query = "UPDATE " + Constants.CLIENTS_TABLE + " SET " +
                Constants.CLIENTS_BATBEGIN+ " = (?)," + Constants.CLIENTS_BATEND+ " = (?),"
                + Constants.CLIENTS_NUMBERNAKLAD+ " = (?) WHERE " + Constants.CLIENTS_ID + " = " + "'" + id + "'";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(query);
            prSt.setString(1, BataryBegin);
            prSt.setString(2, BataryaEnd);
            prSt.setString(3, NumberNaklad);

            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void RemoveAllZayavka(){
        String Delete = "DELETE FROM " + Constants.Zayvka_TABLE;
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(Delete);
            prSt.execute();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void Deletets(Integer id, String tabl) {
        String Delete = null;
        switch (tabl) {
            case ("Client"):
                Delete = "DELETE FROM " + Constants.CLIENTS_TABLE + " WHERE "+Constants.CLIENTS_ID+"=?";
                break;
            case ("Zav"):
                Delete = "DELETE FROM " + Constants.Zayvka_TABLE + " WHERE "+Constants.Zayvka_ID+"=?";
                break;
            case ("Rab"):
                Delete = "DELETE FROM " + Constants.CLIENTS_RABS + " WHERE "+Constants.CLIENTS_RABID+"=?";
                break;
            case ("Count"):
                Delete = "DELETE FROM " + Constants.CLIENTS_COUNTERS + " WHERE "+Constants.CLIENTS_COUNTID+"=?";
                break;
            case ("Bank"):
                Delete = "DELETE FROM " + Constants.CLIENTS_TBANKS + " WHERE "+Constants.CLIENTS_IDPAY+"=?";
                break;
        }
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(Delete);
            prSt.setString(1, String.valueOf(id));
            int rowsDeleted = prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void userKeyAdd(String key) {

        String insert = "INSERT INTO " + Constants.USERS + "(" +
                Constants.USER_KEY + ")" +
                "VALUES(?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, key);
            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean getNameUser(String newUserName) {
        String select = "SELECT * FROM " + Constants.USERS + " WHERE " + Constants.USER_NAME + " = "+ "'" + newUserName + "'";
        boolean b = true;
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet res = prSt.executeQuery(select);
            while (res.next()) {
                if (res.getString(Constants.USER_NAME).equals(newUserName)) {
                    b = false;
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return b;
    }
    public void userNameAndPassAdd(String userName, String userPass, String key) {
        String query = "UPDATE " + Constants.USERS + " SET " + Constants.USER_NAME + " = (?)," + Constants.USER_PASSWORD + " = (?) WHERE " + Constants.USER_KEY + " = " + "'" + key + "'";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(query);
            prSt.setString(1, userName);
            prSt.setString(2, userPass);
            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean getUser(String UserName, String UserPassword) {
        String select = "SELECT * FROM " + Constants.USERS + " WHERE " + Constants.USER_NAME + " = "+ "'" + UserName + "'";
        boolean b = false;
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            ResultSet res = prSt.executeQuery(select);
            while (res.next()) {
                if (res.getString(Constants.USER_NAME).equals(UserName) && res.getString(Constants.USER_PASSWORD).equals(UserPassword)) {
                    b = true;
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return b;
    }

}

package com.example.work;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;

import static com.example.work.HelloController.getIP;


public class jsonJava  {

    protected static String dbHost;// = "62.173.154.118";
    protected static String dbPort;// = "3306";
    protected static String dbUser;// = "sanya";
    protected static String dbPassword;// = "123456789";
    protected static String dbName;// = "work";
    static boolean inp = false;
    boolean b = false;


    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public static boolean getinp(){
        return inp;
    }



    public boolean SignUp(String log, String pas, String key) throws IOException, InterruptedException {
        boolean bool = false;
        String post = "http://"+getIP()+"/GetDataSQL";
        String str = String.format("{\"method\":\"%s\",\"log\":\"%s\",\"pas\":\"%s\",\"key\":\"%s\"}",
                "SignUp",log,pas,key);

        var request = HttpRequest.newBuilder()
                .uri(URI.create(post))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(str))
                .build();

        var client = HttpClient.newHttpClient();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());


        if (response.statusCode()==200 & response.body().equals("succes")){
            bool = true;
        }
        else {bool = false;}
        return bool;
    }


    public boolean connect(String log, String pas) throws IOException, InterruptedException {
        String post = "http://"+getIP()+"/DBHome";
        boolean bool = false;
        String str = String.format("{\"method\":\"%s\",\"log\":\"%s\",\"pas\":\"%s\"}",
                "connect",log,pas);

        var request = HttpRequest.newBuilder()
                .uri(URI.create(post))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(str))
                .build();

        var client = HttpClient.newHttpClient();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());


        if (response.statusCode()==200 & !(response.body().equals("bad"))){
            String[] s = response.body().split(" ");
            setDbHost(s[0]);
            setDbUser(s[1]);
            setDbPassword(s[2]);
            setDbName(s[3]);
            setDbPort(s[4]);


            if (s[s.length-1].equals("root")){
                inp = true;
            }
            else inp = false;
            bool = true;
        }
        else {bool = false;}
        return bool;
    }

    public void UploadExcel(String path) throws IOException, InterruptedException, URISyntaxException {
        String post = "http://"+getIP()+"/UploadFile";

//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(new URI("http://127.0.0.1:8080/Upload"))
//                .headers("Content-Type", "text/plain;charset=UTF-8")
//                .POST(HttpRequest.BodyPublishers.ofFile(Path.of(path))).build();

        var request = HttpRequest.newBuilder()
                .uri(URI.create(post))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofFile(Path.of(path))).build();
//        HttpResponse<String> response = HttpClient.newBuilder()
//                .authenticator(new Authenticator() {
//                    @Override
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(
//                                "username",
//                                "password".toCharArray());
//                    }
//                }).build()
//                .send(request, HttpResponse.BodyHandlers.ofString());
        var client = HttpClient.newHttpClient();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());


    }




    public String createEmployee(forClientTable u, String dogovor) throws IOException, InterruptedException {

        String postEndpoint = "http://"+getIP()+"/FlaskMaster";

        String str = String.format("{\"address\":\"%s\",\"Client\":\"%s\"," +
                        "\"Pribor\":\"%s\",\"Zavodnumber\":\"%s\"," +
                        "\"GoodOrBad\":\"%s\",\"PokazBegin\":\"%s\"," +
                        "\"PokazEnd\":\"%s\",\"Izmer\":\"%s\"," +
                        "\"DataSnyatya\":\"%s\",\"Montaj\":\"%s\"," +
                        "\"NewPribor\":\"%s\",\"dogovor\":\"%s\",\"method\":\"%s\"}",
                u.getAdress(),u.getClient(),u.getPribor(),u.getZavodnumber(),u.getGoodOrBad(),u.getPokazBegin(),u.getPokazEnd(),
                u.getIzmer(),u.getDataSnyatya(),u.getMontaj(),u.getNewPribor(),dogovor,"pechat");

        var request = HttpRequest.newBuilder()
                .uri(URI.create(postEndpoint))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(str))
                .build();

        var client = HttpClient.newHttpClient();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());



//        switch (response.body()){
//            case "good":
//                b = true;
//                break;
//            case "bad":
//            default:
//                b=false;
//                break;
//        }
       return response.body();
    }
//    public String readExcel(String path) throws IOException, InterruptedException {
//
//        String postEndpoint = "http://127.0.0.1:8080/FlaskMaster";
//
//        String str = String.format("{\"method\":\"%s\",\"path\":\"%s\"}","read",path);
//
//        var request = HttpRequest.newBuilder()
//                .uri(URI.create(postEndpoint))
//                .header("Content-Type", "application/json")
//                .POST(HttpRequest.BodyPublishers.ofString(str))
//                .build();
//
//        var client = HttpClient.newHttpClient();
//
//        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
//

//
//        switch (response.body()){
//            case "good":
//                b = true;
//                break;
//            case "bad":
//            default:
//                b=false;
//                break;
//        }
//        return response.body();
//    }
}

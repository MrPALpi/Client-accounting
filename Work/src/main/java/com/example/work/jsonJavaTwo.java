//package com.example.work;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//
//import java.io.IOException;
//public class jsonJavaTwo {
//    protected static String dbHost;// = "62.173.154.118";
//    protected static String dbPort;// = "3306";
//    protected static String dbUser;// = "sanya";
//    protected static String dbPassword;// = "123456789";
//    protected static String dbName;// = "work";
//    static boolean inp = false;
//    boolean b = false;
//    static String postEndpoint;
//
//    public void setDbHost(String dbHost) {
//        this.dbHost = dbHost;
//    }
//
//    public void setDbPort(String dbPort) {
//        this.dbPort = dbPort;
//    }
//
//    public void setDbUser(String dbUser) {
//        this.dbUser = dbUser;
//    }
//
//    public void setDbPassword(String dbPassword) {
//        this.dbPassword = dbPassword;
//    }
//
//    public void setDbName(String dbName) {
//        this.dbName = dbName;
//    }
//
//    public static boolean getinp(){
//        return inp;
//    }
//
//    public static void setpostEndpoint(String IP){postEndpoint = "http://"+IP+"/GetDataSQL";}
//
//    public boolean SignUp(String log, String pas, String key) throws IOException {
//
//        Boolean bool = false;
//        HttpPost post = new HttpPost(postEndpoint);
//
//        String json = String.format("{\"method\":\"%s\",\"log\":\"%s\",\"pas\":\"%s\",\"key\":\"%s\"}",
//                "SignUp",log,pas,key);
//
//        // send a JSON data
//        post.setEntity(new StringEntity(json));
//
//        try (CloseableHttpClient httpClient = HttpClients.createDefault();
//             CloseableHttpResponse response = httpClient.execute(post)) {
//
//            System.out.println(response);
//        }
//        return bool;
//    }
//    public boolean connect(String log, String pas) throws IOException {
//
//        Boolean bool = false;
//        HttpPost post = new HttpPost(postEndpoint);
//
//        String json = String.format("{\"method\":\"%s\",\"log\":\"%s\",\"pas\":\"%s\"}",
//                "connect",log,pas);
//
//        // send a JSON data
//        post.setEntity(new StringEntity(json));
//
//        try (CloseableHttpClient httpClient = HttpClients.createDefault();
//             CloseableHttpResponse response = httpClient.execute(post)) {
//
//            System.out.println(response);
//        }
//        return bool;
//    }
//
//
//}

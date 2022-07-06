//package com.example.work;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class CreateDocx {
//    jsonJava req = new jsonJava();
//
//        public String Chek(String uClient){
//            String s = "-";
//            if (uClient!=null){
//                s=uClient;
//            }
//            return s;
//        }
//
//        public void  printWithPython(forClientTable u, String dogovor) throws IOException, InterruptedException {
//            if (Chek(u.getPribor()).indexOf(" ") != -1) {
//                u.setPribor(Chek(u.getPribor()).replace(' ', '-'));
//            }
//            if (Chek(u.getClient()).indexOf(" ") != -1) {
//                u.setClient(Chek(u.getClient()).replace(' ', '-'));
//            }
//            if (Chek(u.getAdress()).indexOf(" ") != -1) {
//                u.setAdress(Chek(u.getAdress()).replace(' ', '-'));
//            }
//
//            String data = Chek(u.getAdress()) + " " + Chek(u.getClient()) + " " + Chek(u.getPribor()) + " " + Chek(u.getZavodnumber()) +
//                    " " + Chek(u.getGoodOrBad()) + " " + Chek(u.getPokazBegin()) + " " + Chek(u.getPokazEnd()) +
//                    " " + Chek(u.getIzmer()) + " " + Chek(u.getDataSnyatya()) + " " + Chek(u.getMontaj())+ " " + Chek(u.getNewPribor()) + " " + Chek(dogovor);
//
//            String data1 = u.getAdress()  + " " + u.getClient() + " " + u.getPribor() + " " + u.getZavodnumber() +
//                    " " + u.getGoodOrBad() + " " + u.getPokazBegin() + " " + u.getPokazEnd() +
//                    " " + u.getIzmer() + " " + u.getDataSnyatya() + " " + u.getMontaj()+ " " + u.getNewPribor() + " " + dogovor;
//
//            String inputJson =
//                    "{ \"name\":\"tammy133\"," +
//                    " \"salary\":\"5000\"," +
//                    " \"age\":\"20\" }";
//            System.out.println("Сработало");
////            String str = String.format("{'address':'%s','Client':'%s'," +
////                    "'Pribor':'%s','Zavodnumber':'%s'," +
////                    "'GoodOrBad':'%s','PokazBegin':'%s'," +
////                    "'PokazEnd':'%s','Izmer':'%s'," +
////                    "'DataSnyatya':'%s','Montaj':'%s'," +
////                    "'NewPribor':'%s','dogovor':'%s'}",
////                    u.getAdress(),u.getClient(),u.getPribor(),u.getZavodnumber(),u.getGoodOrBad(),u.getPokazBegin(),u.getPokazEnd(),
////                    u.getIzmer(),u.getDataSnyatya(),u.getMontaj(),u.getNewPribor(),dogovor);
//            String str = String.format("{\"address\":\"%s\",\"Client\":\"%s\"," +
//                            "\"Pribor\":\"%s\",\"Zavodnumber\":\"%s\"," +
//                            "\"GoodOrBad\":\"%s\",\"PokazBegin\":\"%s\"," +
//                            "\"PokazEnd\":\"%s\",\"Izmer\":\"%s\"," +
//                            "\"DataSnyatya\":\"%s\",\"Montaj\":\"%s\"," +
//                            "\"NewPribor\":\"%s\",\"dogovor\":\"%s\"}",
//                    u.getAdress(),u.getClient(),u.getPribor(),u.getZavodnumber(),u.getGoodOrBad(),u.getPokazBegin(),u.getPokazEnd(),
//                    u.getIzmer(),u.getDataSnyatya(),u.getMontaj(),u.getNewPribor(),dogovor);
////            String str = String.format("{\"address\":\"%s\",\"Client\":\"%s\",\"DataSnyatya\":\"%s\" }",
////            u.getAdress(),u.getClient(),u.getDataSnyatya());
//            System.out.println(str);
//            req.createEmployee(str);
//            //System.out.println(str);
////            FileOutputStream out = new FileOutputStream("pechat\\testFile2.txt");
////            out.write(data.getBytes(StandardCharsets.UTF_8));
////            out.close();
////
////
////            File file = new File("pechat\\pechat.exe");
////            ProcessBuilder processBuilder = new ProcessBuilder(file.getAbsolutePath());
////            processBuilder.directory(file.getParentFile());
////
////            try {
////                processBuilder.start();
////            } catch(IOException ex) {
////                ex.printStackTrace();
////            }
//        }
//
//
//}
//

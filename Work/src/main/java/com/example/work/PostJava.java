//package com.example.work;
//
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.ContentType;
//import org.apache.http.entity.mime.HttpMultipartMode;
//import org.apache.http.entity.mime.MultipartEntityBuilder;
//import org.apache.http.impl.client.HttpClients;
//
//import java.io.File;
//import java.io.IOException;
//
//public class PostJava {
//    public void PostToPython(String textFileName) throws IOException {
//        HttpPost post = new HttpPost("http://127.0.0.1:8080/Upload");
//        File file = new File(textFileName);
//        String message = "This is a multipart post";
//        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
//        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
//        builder.addBinaryBody("upfile", file, ContentType.DEFAULT_BINARY, textFileName);
//        builder.addTextBody("text", message, ContentType.DEFAULT_BINARY);
//        //
//        HttpClient client = HttpClients.custom().build();
//        HttpEntity entity = builder.build();
//        post.setEntity(entity);
//        HttpResponse response = client.execute(post);
//    }
//}
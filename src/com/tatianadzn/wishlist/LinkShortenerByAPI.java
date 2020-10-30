package com.tatianadzn.wishlist;

import org.json.JSONObject;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class LinkShortenerByAPI {
    private static String responseBody;
    private static int responseStatus;


    public static String Shorten(String longUrl){
        getResponse(longUrl);
        return parseResponse();
    }

    private static void getResponse(String longUrl){
        String data = "{\"destination\": \""+ longUrl +"\", \"domain\": { \"fullName\": \"rebrand.ly\"}}";
        try{
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(data))
                    .header("Content-Type", "application/json")
                    .header("apikey", "4535b929ad66458d87b0c26c2d18bd05")
                    .uri(new URI("https://api.rebrandly.com/v1/links"))
                    .build();

            HttpResponse response = HttpClient
                    .newBuilder()
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            responseBody = response.body().toString();
            responseStatus = response.statusCode();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static String parseResponse(){
        if (responseStatus != 200){
            return "Response status: " + responseStatus;
        }
        JSONObject json = new JSONObject(responseBody);
        return json.get("shortUrl").toString();
    }
}

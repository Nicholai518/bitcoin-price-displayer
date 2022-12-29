package com.nicholai518.bitcoinpricedisplayer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@RestController
public class PriceController {

    @RequestMapping("/displayPrice")
    public String displayPrice(){
        return "Bitcoin Price: $16,680.60";
    }
    @RequestMapping("/displayCurrentPrice")
    public String getCurrentBitcoinPrice(String url){
        String USER_AGENT =  "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36";
        String jsonBitcoinPrices = null;
        StringBuilder stringBuilder = new StringBuilder(url);
        try {
            URL urlObject = new URL(stringBuilder.toString());
            HttpURLConnection connection = (HttpURLConnection) urlObject.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", USER_AGENT);
            connection.setRequestProperty("Accept-Charset", "UTF-8");

            if(connection){

            }
            
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

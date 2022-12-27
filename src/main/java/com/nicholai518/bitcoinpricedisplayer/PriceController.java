package com.nicholai518.bitcoinpricedisplayer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

    @RequestMapping("/displayPrice")
    public String displayPrice(){
        return "Bitcoin Price: $16,680.60";
    }
}

package com.digimon.api.consumingexample.consumingexample;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consume")
public class ConsumeAPI {

    private static String BASE_URL = "Https://www.digi-api.com/api/v1/";

    @PostMapping("/get-digimon/{id}")
    public String getDigimon(@PathVariable("id") String id){
        String url = BASE_URL + "digimon/" + id;
        RestTemplate restTemplate = new RestTemplate();
        String digimon = restTemplate.getForObject(url, String.class);
        return digimon;

    }
}

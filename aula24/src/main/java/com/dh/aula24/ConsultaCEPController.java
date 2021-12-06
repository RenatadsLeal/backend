package com.dh.aula24;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaCEPController {
    @GetMapping("/{cep}")
    public String consultaCEP(@PathVariable String cep) throws UnirestException {

        HttpResponse<JsonNode> jsonResponse = Unirest.get("https://viacep.com.br/ws/"+cep+"/json/").asJson();

        JSONObject json = jsonResponse.getBody().getObject();

        return json.toString();
    }
}

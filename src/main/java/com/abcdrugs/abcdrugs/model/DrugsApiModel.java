package com.abcdrugs.abcdrugs.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DrugsApiModel {
    private static final String BASE_URL = "https://api.fda.gov/drug/label.json";

    public Drug getDrugInfo(String drugName) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        String url = BASE_URL + "?search=openfda.brand_name:" + drugName;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Usar Jackson para converter o JSON recebido em um objeto Drug
        ObjectMapper mapper = new ObjectMapper();
        Drug drug = mapper.readValue(response.body(), Drug.class);

        return drug;
    }
}


package br.com.alura.challange.service;

import br.com.alura.challange.model.ExchangeRateAPIResponse;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ExchangeRateService {
   private static final String API_KEY = "c58792015a7b567511304afb";
   private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

   public ExchangeRateAPIResponse getConversionRate(String baseCode, String targetCode)
           throws IOException, InterruptedException {
      String url = BASE_URL + baseCode + "/" + targetCode;

      HttpClient client = HttpClient.newHttpClient();
      HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
      HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

      return new Gson().fromJson(response.body(), ExchangeRateAPIResponse.class);
   }
}

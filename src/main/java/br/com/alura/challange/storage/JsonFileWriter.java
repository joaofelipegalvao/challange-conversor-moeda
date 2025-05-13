package br.com.alura.challange.storage;

import br.com.alura.challange.model.ExchangeRateAPIResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonFileWriter {
   private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

   public void saveHistoryToFile(List<ExchangeRateAPIResponse> history) throws IOException {
      try (FileWriter writer = new FileWriter("history.json")) {
         writer.write(gson.toJson(history));
      }
   }
}

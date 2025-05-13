package br.com.alura.challange.history;

import br.com.alura.challange.model.ExchangeRateAPIResponse;

import java.util.ArrayList;
import java.util.List;

public class ConversionHistory {
   private List<ExchangeRateAPIResponse> history = new ArrayList<>();

   public void add(ExchangeRateAPIResponse response) {
      history.add(response);
   }

   public List<ExchangeRateAPIResponse> getAll() {
      return history;
   }

   public void clear() {
      history.clear();
   }
}

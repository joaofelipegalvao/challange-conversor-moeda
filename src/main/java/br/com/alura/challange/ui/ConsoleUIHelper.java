package br.com.alura.challange.ui;

import br.com.alura.challange.history.ConversionHistory;
import br.com.alura.challange.model.ExchangeRateAPIResponse;

public class ConsoleUIHelper {
   public static void showMenu() {
      System.out.println("\n*** Conversor de Moedas ***");
      System.out.println("1. USD -> BRL");
      System.out.println("2. EUR -> BRL");
      System.out.println("3. BRL -> USD");
      System.out.println("4. GBP -> EUR");
      System.out.println("5. USD -> JPY");
      System.out.println("6. BRL -> ARS");
      System.out.println("7. Histórico de conversões:");
      System.out.println("0. sair");
      System.out.print("Escolha uma opção: ");
   }

   public static void showHistory(ConversionHistory history) {
      if (history.getAll().isEmpty()) {
         System.out.println("Nenhuma conversão realizada ainda.");
      } else {
         System.out.println("\nHistórico de conversões:");
         for (ExchangeRateAPIResponse item : history.getAll()) {
            System.out.printf("%s -> %s: %4f%n", item.base_code(), item.target_code(), item.conversion_rate());
         }
      }
   }
}

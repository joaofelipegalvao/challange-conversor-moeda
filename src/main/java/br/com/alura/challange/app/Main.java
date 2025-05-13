package br.com.alura.challange.app;

import br.com.alura.challange.converter.CurrencyConverter;
import br.com.alura.challange.history.ConversionHistory;
import br.com.alura.challange.model.ExchangeRateAPIResponse;
import br.com.alura.challange.service.ExchangeRateService;
import br.com.alura.challange.storage.JsonFileWriter;
import br.com.alura.challange.ui.ConsoleUIHelper;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      ExchangeRateService exchangeRateService = new ExchangeRateService();
      JsonFileWriter jsonFileWriter = new JsonFileWriter();
      ConversionHistory history = new ConversionHistory();
      CurrencyConverter converter = new CurrencyConverter();

      while (true) {
        ConsoleUIHelper.showMenu();

        if (!scanner.hasNextInt()) {
          System.out.println("Entrada inválida. Digite um número de 0 a 7");
          scanner.next();
          continue;
        }
        int option = scanner.nextInt();
        scanner.nextLine();

        if (option == 0) {
          System.out.println("Salvando histórico completo...");
          jsonFileWriter.saveHistoryToFile(history.getAll());
          System.out.println("Histórico salvo em 'history.json'");
          System.out.println("Saindo...");
          break;
        }

        String base = "";
        String target = "";

        switch (option) {
          case 1 -> {
            base = "USD";
            target = "BRL";
          }
          case 2 -> {
            base = "EUR";
            target = "BRL";
          }
          case 3 -> {
            base = "BRL";
            target = "USD";
          }
          case 4 -> {
            base = "GBP";
            target = "EUR";
          }
          case 5 -> {
            base = "USD";
            target = "JPY";
          }
          case 6 -> {
            base = "BRL";
            target = "ARS";
          }
          case 7 -> {
            ConsoleUIHelper.showHistory(history);
            continue;
          }
          default -> {
            System.out.println("Opção inválida.");
            continue;
          }
        }

        System.out.println("Digite o valor a ser convertido");
        double amount = scanner.nextDouble();

        ExchangeRateAPIResponse response = exchangeRateService.getConversionRate(base, target);
        double rate = response.conversion_rate();
        double convertedAmount = converter.convert(amount, rate);

        System.out.printf("Valor convertido de %s para %s: %.2f%n", base, target, convertedAmount);
        history.add(response);
      }
    } catch (IOException | InterruptedException e) {
      System.out.println("Erro de comunicação com a API: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Erro inesperado: " + e.getMessage());
    }
  }
}


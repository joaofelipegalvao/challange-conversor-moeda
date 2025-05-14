package br.com.alura.challange.ui;

import br.com.alura.challange.history.ConversionHistory;
import br.com.alura.challange.model.ExchangeRateAPIResponse;

public class ConsoleUIHelper {
  public static void showMenu() {
    System.out.println("\n┌──────────────────────────────────┐");
    System.out.println("│       CONVERSOR DE MOEDAS        │");
    System.out.println("└──────────────────────────────────┘");
    System.out.println("│ 1. Dólar (USD) → Real (BRL)      │");
    System.out.println("│ 2. Euro (EUR) → Real (BRL)       │");
    System.out.println("│ 3. Real (BRL) → Dólar (USD)      │");
    System.out.println("│ 4. Libra (GBP) → Euro (EUR)      │");
    System.out.println("│ 5. Dólar (USD) → Iene (JPY)      │");
    System.out.println("│ 6. Real (BRL) → Peso Arg. (ARS)  │");
    System.out.println("│ 7. Histórico de conversões       │");
    System.out.println("│ 0. Sair                          │");
    System.out.println("└──────────────────────────────────┘");
    System.out.print("Digite sua opção: ");
  }

  public static void showHistory(ConversionHistory history) {
    if (history.getAll().isEmpty()) {
      System.out.println("\n▷ Nenhuma conversão realizada ainda.");
    } else {
      System.out.println("\n┌───────────────────────────────────────┐");
      System.out.println("│       HISTÓRICO DE CONVERSÕES         │");
      System.out.println("└───────────────────────────────────────┘");

      for (ExchangeRateAPIResponse item : history.getAll()) {
        System.out.printf(
            "  %s → %s: %.4f%n", item.base_code(), item.target_code(), item.conversion_rate());
      }
      System.out.println("└───────────────────────────────────────┘");
    }
  }

  public static void showConversionResult(
      String base, String target, double amount, double convertedAmount) {
    System.out.println("\n┌───────────────────────────────────────┐");
    System.out.println("│          RESULTADO DA CONVERSÃO       │");
    System.out.println("└───────────────────────────────────────┘");
    System.out.printf("  %.2f %s = %.2f %s%n", amount, base, convertedAmount, target);
    System.out.println("└───────────────────────────────────────┘");
  }

  public static void showErrorMessage(String message) {
    System.out.println("\n⚠️ ERRO: " + message);
  }

  public static void showExitMessage() {
    System.out.println("\n┌───────────────────────────────────────┐");
    System.out.println("│  Histórico salvo em 'history.json'    │");
    System.out.println("│  Obrigado por usar o conversor!       │");
    System.out.println("└───────────────────────────────────────┘");
  }

  public static void requestAmount() {
    System.out.println("\n▷ Digite o valor a ser convertido:");
    System.out.print("  $ ");
  }
}

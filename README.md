# 🪙 Conversor de Moedas - Challenge ONE Back End

![Alura + Oracle](https://img.shields.io/badge/Alura%20%2B%20Oracle-Challenge%20Back%20End%20ONE-blue)
![Java](https://img.shields.io/badge/Java-17-orange)
![Status](https://img.shields.io/badge/Status-Concluído-success)

<div align="center">

[![Designsemnome3-ezgif-com-video-to-gif-converter.gif](https://i.postimg.cc/kMv7f0Qm/Designsemnome3-ezgif-com-video-to-gif-converter.gif)](https://postimg.cc/XXXMvD1H)

<p align="center" dir="auto"><em>Conversão de moedas em tempo real com taxas atualizadas!</em> 🚀</p>
</div>

## 📋 Sobre o Projeto

Este é um conversor de moedas desenvolvido como parte do desafio **Oracle Next Education (ONE)** em parceria com a **Alura**. O projeto permite realizar conversões entre diferentes moedas utilizando taxas de câmbio em tempo real através da API ExchangeRate, visualizar o histórico das operações e exportar esse histórico para um arquivo JSON.

## ✨ Funcionalidades

### **Múltiplas conversões de moedas:**

- Dólar (USD) → Real (BRL)
- Euro (EUR) → Real (BRL)
- Real (BRL) → Dólar (USD)
- Libra (GBP) → Euro (EUR)
- Dólar (USD) → Iene (JPY)
- Real (BRL) → Peso Argentino (ARS)

1. **Histórico completo de conversões** <br>
2. **Exportação do histórico para arquivo JSON** <br>
3. **Interface de console intuitiva e amigável** <br>
4. **Taxas de câmbio atualizadas em tempo real**

## 🛠️ Tecnologias Utilizadas

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JSON](https://img.shields.io/badge/JSON-000000?style=for-the-badge&logo=json&logoColor=white)
![API REST](https://img.shields.io/badge/API%20REST-0078D4?style=for-the-badge&logo=microsoftedge&logoColor=white)

</div>

- **Java 17** - Linguagem de programação principal
- **API ExchangeRate (v6)** - Fornecimento de taxas de câmbio atualizadas
- **Biblioteca Gson** - Manipulação de dados em formato JSON
- **HttpClient do Java** - Realização de requisições HTTP para API

## 📊 Exemplo de Uso

```
┌──────────────────────────────────┐
│       CONVERSOR DE MOEDAS        │
└──────────────────────────────────┘
│ 1. Dólar (USD) → Real (BRL)      │
│ 2. Euro (EUR) → Real (BRL)       │
│ 3. Real (BRL) → Dólar (USD)      │
│ 4. Libra (GBP) → Euro (EUR)      │
│ 5. Dólar (USD) → Iene (JPY)      │
│ 6. Real (BRL) → Peso Arg. (ARS)  │
│ 7. Histórico de conversões       │
│ 0. Sair                          │
└──────────────────────────────────┘
Digite sua opção: 1

▷ Digite o valor a ser convertido:
  $ 100

▷ Consultando taxas de conversão...

┌───────────────────────────────────────┐
│          RESULTADO DA CONVERSÃO       │
└───────────────────────────────────────┘
  100.00 USD = 557.32 BRL
└───────────────────────────────────────┘
```

## 🔄 API ExchangeRate

O projeto utiliza a API ExchangeRate (v6) para obter taxas de câmbio atualizadas em tempo real.

- **Documentação**: [https://www.exchangerate-api.com/docs/pair-conversion-requests](https://www.exchangerate-api.com/docs/pair-conversion-requests)
- **Endpoint utilizado**: `https://v6.exchangerate-api.com/v6/API_KEY/pair/BASE/TARGET`

## 📂 Estrutura do Projeto

```
src/
├── main/
│   └── java/
│       └── br/
│           └── com/
│               └── alura/
│                   └── challange/
│                       ├── app/
│                       │   └── Main.java                  # Classe principal
│                       ├── converter/
│                       │   └── CurrencyConverter.java     # Lógica de conversão
│                       ├── history/
│                       │   └── ConversionHistory.java     # Gerenciamento de histórico
│                       ├── model/
│                       │   └── ExchangeRateAPIResponse.java # Modelo da resposta da API
│                       ├── service/
│                       │   └── ExchangeRateService.java   # Comunicação com a API
│                       ├── storage/
│                       │   └── JsonFileWriter.java        # Gerenciamento de arquivos
│                       └── ui/
│                           └── ConsoleUIHelper.java       # Interface de usuário
```

## 🙏 Agradecimentos

**Oracle e Alura** pelo programa ONE e pelo desafio proposto

<div align="center">

Desenvolvido com ❤️ como parte do desafio Back End ONE da Alura em parceria com a Oracle.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/joaofelipegalvao/)

</div>

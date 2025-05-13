![Alura + Oracle](https://img.shields.io/badge/Alura%20%2B%20Oracle-Challenge%20Back%20End%20ONE-blue)
![Java](https://img.shields.io/badge/Java-17-orange)

# 🪙 Conversor de Moeda e Temperatura - Challenge ONE Back End

Este é um projeto de conversor de moedas criado como parte do **Oracle Next Education** em parceria com a **Alura**. O objetivo deste projeto é desenvolver um conversor de moedas simples que permite realizar conversões entre diferentes moedas, visualizar um histórico das conversões realizadas e salvar esse histórico em um arquivo JSON 💱.

## 🚀 Funcionalidades

- Conversão entre múltiplos pares de moedas (USD/BRL, EUR/BRL, BRL/USD, GBP/EUR, USD/JPY, BRL/ARS)
- Histórico de conversões realizadas
- Exportação do histórico para arquivo JSON
- Interface de linha de comando intuitiva

## 🛠️ Tecnologias Utilizadas

- Java 17
- API ExchangeRate (v6)
- Biblioteca Gson para manipulação de JSON
- HttpClient do Java para requisições HTTP

## 🔄 API ExchangeRate

O projeto utiliza a API ExchangeRate (v6) para obter taxas de câmbio atualizadas. Mais informações sobre a API podem ser encontradas em [https://www.exchangerate-api.com/docs/pair-conversion-requests](https://www.exchangerate-api.com/docs/pair-conversion-requests).

## 📊 Exemplo de Uso

```
===== CONVERSOR DE MOEDAS =====
1. USD -> BRL
2. EUR -> BRL
3. BRL -> USD
4. GBP -> EUR
5. USD -> JPY
6. BRL -> ARS
7. Ver histórico
0. Salvar e sair
Escolha uma opção: 1

Digite o valor a ser convertido
100

Valor convertido de USD para BRL: 557.32
```

## 🙏 Agradecimentos

- Oracle e Alura pelo programa ONE e pelo desafio proposto
- ExchangeRate API por fornecer dados de conversão de moedas

---

Desenvolvido com ❤️ como parte do desafio Back End ONE da Alura em parceria com a Oracle.


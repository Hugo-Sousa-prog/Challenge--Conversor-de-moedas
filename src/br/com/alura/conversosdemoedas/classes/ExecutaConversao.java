package br.com.alura.conversosdemoedas.classes;

import java.io.IOException;
import java.util.Scanner;

public class ExecutaConversao {
    int opcao;
    String json;
    double valorTaxa;
    double valorMoeda;
    double moedaConvertida;

    BuscaJson buscaJson = new BuscaJson();
    SelecionaTaxa selecionaTaxa = new SelecionaTaxa();
    ConverteMoeda converteMoeda = new ConverteMoeda();
    MenuDeOpcoes menuDeOpcoes = new MenuDeOpcoes();
    Scanner scanner = new Scanner(System.in);

    public void executa() throws IOException, InterruptedException {
        try {
            do {
                menuDeOpcoes.exibeMenu();
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 0:
                        System.out.println("Finalizando sistema!");
                        break;

                    case 1:
                        System.out.println("\nDigite o valor que deseja converter: ");
                        valorMoeda = scanner.nextDouble();
                        json = buscaJson.getJson("BRL");
                        valorTaxa = selecionaTaxa.getRate(json, "JPY");
                        moedaConvertida = converteMoeda.conversorMoeda(valorMoeda, valorTaxa);
                        System.out.println("\nR$" + valorMoeda + " convertido para iene é igual a: " + "¥" + moedaConvertida + "\n");
                        break;

                    case 2:
                        System.out.println("\nDigite o valor que deseja converter: ");
                        valorMoeda = scanner.nextDouble();
                        json = buscaJson.getJson("BRL");
                        valorTaxa = selecionaTaxa.getRate(json, "EUR");
                        moedaConvertida = converteMoeda.conversorMoeda(valorMoeda, valorTaxa);
                        System.out.println("\nR$" + valorMoeda + " convertido para euro é igual a: " + "€" + moedaConvertida + "\n");
                        break;

                    case 3:
                        System.out.println("\nDigite o valor que deseja converter: ");
                        valorMoeda = scanner.nextDouble();
                        json = buscaJson.getJson("BRL");
                        valorTaxa = selecionaTaxa.getRate(json, "USD");
                        moedaConvertida = converteMoeda.conversorMoeda(valorMoeda, valorTaxa);
                        System.out.println("\nR$" + valorMoeda + " convertido para dólar é igual a: " + "$" + moedaConvertida + "\n");
                        break;

                    case 4:
                        System.out.println("\nDigite o valor que deseja converter: ");
                        valorMoeda = scanner.nextDouble();
                        json = buscaJson.getJson("JPY");
                        valorTaxa = selecionaTaxa.getRate(json, "BRL");
                        moedaConvertida = converteMoeda.conversorMoeda(valorMoeda, valorTaxa);
                        System.out.println("\n¥" + valorMoeda + " convertido para real é igual a: " + "R$" + moedaConvertida + "\n");
                        break;

                    case 5:
                        System.out.println("\nDigite o valor que deseja converter: ");
                        valorMoeda = scanner.nextDouble();
                        json = buscaJson.getJson("EUR");
                        valorTaxa = selecionaTaxa.getRate(json, "BRL");
                        moedaConvertida = converteMoeda.conversorMoeda(valorMoeda, valorTaxa);
                        System.out.println("\n€" + valorMoeda + " convertido para euro é igual a: " + "R$" + moedaConvertida + "\n");
                        break;

                    case 6:
                        System.out.println("\nDigite o valor que deseja converter: ");
                        valorMoeda = scanner.nextDouble();
                        json = buscaJson.getJson("USD");
                        valorTaxa = selecionaTaxa.getRate(json, "BRL");
                        moedaConvertida = converteMoeda.conversorMoeda(valorMoeda, valorTaxa);
                        System.out.println("\n$" + valorMoeda + " convertido para dólar é igual a: " + "R$" + moedaConvertida + "\n");
                        break;
                    default:
                        System.out.println("\nOpção inválida, digite outra opção");
                }
            } while (opcao != 0);
            
        } catch (RuntimeException e) {
            System.out.println("Erro de conversão: " + e.getMessage());
        }
    }
}

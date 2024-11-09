package br.com.alura.conversosdemoedas.classes;

import java.io.IOException;
import java.util.Scanner;

public class ExecutaConversao {
    private int opcao;
    private String json;
    private String taxa;
    private String moeda;
    private double valorTaxa;
    private double valorMoeda;
    private double moedaConvertida;

    BuscaJson buscaJson = new BuscaJson();
    SelecionaTaxa selecionaTaxa = new SelecionaTaxa();
    ConverteMoeda converteMoeda = new ConverteMoeda();
    MenuDeOpcoes menuDeOpcoes = new MenuDeOpcoes();
    Scanner scanner = new Scanner(System.in);

    public void escolhendoTaxaValor() throws IOException, InterruptedException {
        System.out.println("\nDigite o valor que deseja converter: ");
        this.valorMoeda = scanner.nextDouble();
        this.json = buscaJson.getJson(this.moeda);
        this.valorTaxa = selecionaTaxa.getRate(this.json, this.taxa);
        this.moedaConvertida = converteMoeda.conversorMoeda(valorMoeda, valorTaxa);
    }

    public void retornandoMoedaConvertida(){
        if (this.moeda.equals("BRL") && this.taxa.equals("JPY")){
            System.out.println("\nR$" + this.valorMoeda + " convertido para iene é igual a: " + "¥" + this.moedaConvertida + "\n");
        } else if (this.moeda.equals("BRL") && this.taxa.equals("EUR")) {
            System.out.println("\nR$" + this.valorMoeda + " convertido para euro é igual a: " + "€" + this.moedaConvertida + "\n");
        } else if (this.moeda.equals("BRL") && this.taxa.equals("USD")) {
            System.out.println("\nR$" + this.valorMoeda + " convertido para dólar é igual a: " + "$" + this.moedaConvertida + "\n");
        } else if (this.moeda.equals("JPY") && this.taxa.equals("BRL")) {
            System.out.println("\n¥" + this.valorMoeda + " convertido para real é igual a: " + "R$" + this.moedaConvertida + "\n");
        } else if (this.moeda.equals("EUR") && this.taxa.equals("BRL")) {
            System.out.println("\n€" + this.valorMoeda + " convertido para euro é igual a: " + "R$" + this.moedaConvertida + "\n");
        } else if (this.moeda.equals("USD") && this.taxa.equals("BRL")) {
            System.out.println("\n$" + this.valorMoeda + " convertido para dólar é igual a: " + "R$" + this.moedaConvertida + "\n");
        }
    }

    public void executaConversao() throws IOException, InterruptedException {
        try {
            do {
                menuDeOpcoes.exibeMenu();
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 0:
                        System.out.println("Finalizando sistema!");
                        break;

                    case 1:
                        this.moeda = "BRL";
                        this.taxa = "JPY";
                        escolhendoTaxaValor();
                        retornandoMoedaConvertida();
                        break;

                    case 2:
                        this.moeda = "BRL";
                        this.taxa = "EUR";
                        escolhendoTaxaValor();
                        retornandoMoedaConvertida();
                        break;

                    case 3:
                        this.moeda = "BRL";
                        this.taxa = "USD";
                        escolhendoTaxaValor();
                        retornandoMoedaConvertida();
                        break;

                    case 4:
                        this.moeda = "JPY";
                        this.taxa = "BRL";
                        escolhendoTaxaValor();
                        retornandoMoedaConvertida();
                        break;

                    case 5:
                        this.moeda = "EUR";
                        this.taxa = "BRL";
                        escolhendoTaxaValor();
                        retornandoMoedaConvertida();
                        break;

                    case 6:
                        this.moeda = "USD";
                        this.taxa = "BRL";
                        escolhendoTaxaValor();
                        retornandoMoedaConvertida();
                        break;
                    default:
                        System.out.println("\nOpção inválida, digite outra opção");
                }
            } while (opcao != 0);

        } catch (RuntimeException e) {
            System.out.println("Um erro foi encontrado: " + e.getMessage());
        }
    }
}

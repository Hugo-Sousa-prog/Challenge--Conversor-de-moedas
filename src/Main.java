import br.com.alura.conversosdemoedas.classes.*;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
//        int opcao;
//        String json;
//        double valorTaxa;
//        double valorMoeda;
//        double moedaConvertida;
//
//        BuscaJson buscaJson = new BuscaJson();
//        SelecionaTaxa selecionaTaxa = new SelecionaTaxa();
//        ConverteMoeda converteMoeda = new ConverteMoeda();
//        MenuDeOpcoes menuDeOpcoes = new MenuDeOpcoes();
//        Scanner scanner = new Scanner(System.in);
        ExecutaConversao executaConversao = new ExecutaConversao();
        executaConversao.executa();
    }
}
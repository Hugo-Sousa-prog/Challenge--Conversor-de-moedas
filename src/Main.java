import br.com.alura.conversosdemoedas.classes.BuscaTaxas;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BuscaTaxas buscaTaxas = new BuscaTaxas();
        System.out.println(buscaTaxas.getApi("JPY"));
    }
}
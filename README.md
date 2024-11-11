# 💱 Conversor de moedas
![Static Badge](https://img.shields.io/badge/Status%3A-Conclu%C3%ADdo-green)

Esse projeto consiste em converter uma moeda inserida pelo usuário para outra moeda selecionada, exemplo: "**3. Real brasileiro (BRL) == Dólar (USD)**" ao digitar a opção "3" no console, será necessário digitar um valor em real que será convertido para dólar.

# 🛠️ Funcionalidades do projeto

- <a href=https://github.com/Hugo-Sousa-prog/Challenge--Conversor-de-moedas/blob/main/src/Main.java>Main<a>: Classe principal do projeto que instancia a classe **ExecutaConversao** e executa o método **executaConversao**.
- <a href= https://github.com/Hugo-Sousa-prog/Challenge--Conversor-de-moedas/blob/main/src/br/com/alura/conversosdemoedas/classes/BuscaJson.java>BuscaJson<a>: Classe que contém o método **getJson** que consiste em chamar a API e retornar um json.
- <a href= https://github.com/Hugo-Sousa-prog/Challenge--Conversor-de-moedas/blob/main/src/br/com/alura/conversosdemoedas/classes/ConverteMoeda.java>ConverteMoeda<a>: Classe que contém o método **conversorMoeda**, que realiza o cálculo de conversão da moeda.
- <a href= https://github.com/Hugo-Sousa-prog/Challenge--Conversor-de-moedas/blob/main/src/br/com/alura/conversosdemoedas/classes/ExecutaConversao.java>ExecutaConversao<a> Classe que contém métodos e atributos para realizar toda o procedimento de conversão de moedas. 
  - `escolhendoTaxaValor`: Lê o valor inserido pelo usuário, captura o valor da taxa da moeda desejada e chama o método ConverteMoeda para realizar o cálculo;
  - `retornandoMoedaConvertida`: Exibe o valor convertido, além do símbolo das moedas de acordo com a opção escolhida;
  - `executaConversao`: Exibe o menu atravês do método **exibeMenu** e lê a opção escolhida de acordo com o menu. Utiliza um switch-case para passar parâmetros aos demais métodos da classe **ExecutaConversao** de acordo com a opção selecionada e assim exibir o resultado da conversão.
- <a href=https://github.com/Hugo-Sousa-prog/Challenge--Conversor-de-moedas/blob/main/src/br/com/alura/conversosdemoedas/classes/MenuDeOpcoes.java>MenuDeOpcoes<a>: Classe que contém o método **exibeMenu**, que exibe um menu de opções para realizar a conversão.
- <a href=https://github.com/Hugo-Sousa-prog/Challenge--Conversor-de-moedas/blob/main/src/br/com/alura/conversosdemoedas/classes/SelecionaTaxa.java>SelecionaTaxa<a>: Classe que contém o método **getRate**, que mapea o json retornado do método **getJson** e retorna de qual moeda será utilizada as taxas.

# ⌨ Tecnologias utilizadas
![java icon](https://github.com/user-attachments/assets/c574b613-8587-4926-82a0-65dd18c4df06)

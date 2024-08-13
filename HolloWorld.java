/**
 * public: declaração que "exporta" e permite que a classe/método/variavel seja importada/reutiliza em outras classes/objeto
 * class: declaração de classe (que poderá se tornar um objeto)
 * HelloWorld: nome da classe, seguindo o padrão de nomenclatura PascalCase
 * { ("abre" chave): serve para declarar o inicio de um bloco de códigos/ações
 * } ("fecha" chave): serve para declarar o fim de um bloco de códigos/ações
 */
public class HolloWorld { // Aqui é criada a classe HelloWorld
    /**
     * static: declaração de método somente leitura, o qual não poderá ser editado. exceto pelo uso de @Override
     * voit: modo protegido de um método, o qual não retonará qualquer valor
     * main: nome do método "executor"
     * ( (abre parênteses): serve para declarar o inicio das declarações de parâmetros de um método/função
     * ) (fecha parênteses): serve para declarar o fim das declarações de parâmetros de um método/função
     * @param args
     * system: invoca a classe de sistema
     * . (ponto): serve como operador de invocação de método
     * out: invoca o método, ou função abstrata, o qual irá "imprimir" na tela uma string
     * printl: invoca o método, ou função abstrata, o qual ira "imprimir" na tela uma string
     * "Hello World": testo (string) que será "impresso" na tela
     * ; (ponto e virgula): serve para encerrar uma linha de codigo
     */
    public static void main (String[] args) { // Aqui é criada a classe main
        System.out.println("Hello World!!!"); // Aqui é "impressa" uma linha com o texto "Hello World"
    } // Aqui emcerra o bloco de codigo do metodo main
} // aqui encerra o bloco de codigo da classe HelloWorld
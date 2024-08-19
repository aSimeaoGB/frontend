/**
  * public: Cria classe publica para poderem modificar ou visualizar
 * class: mostra que é uma classe
 * LabelTest: nome da classe
 */
import javax.swing.JFrame; // importa da biblioteca os componentes

public class LabelTest // cria a classe LabelTest
{
   public static void main(String[] args)
   { 
      LabelFrame labelFrame = new LabelFrame(); //cria a variavel
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define que quando fechar a pagina ele sai 
      labelFrame.setSize(360, 280); // define o tamanho 
      labelFrame.setVisible(true); // torna visivel
   } 
}
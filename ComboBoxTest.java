import javax.swing.JFrame; // importação da biblioteca

public class ComboBoxTest // declaração da classe
{ //inicio do bloco de codigo
   public static void main(String[] args) // criação do metodo main, 1 parametro
   //->parametro [] = Matriz
   { // inicio do bloco main
      ComboBoxFrame comboBoxFrame = new ComboBoxFrame(); //declaração de variavel que cria um frame
      //= atribição
      // new criação
      comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o metodo padrão de fechar
      comboBoxFrame.setSize(350, 150); // define o tamanho da tela largura e altura
      comboBoxFrame.setVisible(true);; // torna visivel a tela
   } // fecha o bloco main
} // fecha o bloco principal
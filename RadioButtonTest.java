import javax.swing.JFrame; // importa da biblioteca

public class RadioButtonTest  // cria a classe
{
   public static void main(String[] args) // cria a main string
   {
      RadioButtonFrame radioButtonFrame = new RadioButtonFrame(); // declaração de variavel
      radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define o metodo padrao de fechar
      radioButtonFrame.setSize(300, 135); // define o tamanho da tela
      radioButtonFrame.setVisible(true); // torna visivel a tela
   } 
}
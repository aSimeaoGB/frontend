import javax.swing.JFrame; // imprta biblioteca

public class MultipleSelectionTest //cria a classe
{
   public static void main(String[] args) //criação do metodo main
   // void: nao tem retorno

   { 
      MultipleSelectionFrame multipleSelectionFrame = 
         new MultipleSelectionFrame(); //declaração de variavel
      multipleSelectionFrame.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE); // define o modo padrão de fechamento
      multipleSelectionFrame.setSize(550, 150); //define o tamanho da tela
      multipleSelectionFrame.setVisible(true);  //torna visivel a tela
   } 
}
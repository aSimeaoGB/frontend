import javax.swing.JFrame; // imprta biblioteca

public class ListTest //cria a classe 
{//abre o bloco principal de codigo
   public static void main(String[] args) //criação do metodo main
   //->parametro [] = Matriz
   { //abre o bloco main
      ListFrame listFrame = new ListFrame(); //declaração de variavel
      listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o modo padrão de fechamento
      listFrame.setSize(350, 150); //define o tamanho da tela
      listFrame.setVisible(true); //torna visivel a tela
   } // fecha o bloco main
}//fecha o bloco principal
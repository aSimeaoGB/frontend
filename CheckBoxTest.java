import javax.swing.*;

public class CheckBoxTest //define a classe
{
   public static void main(String[] args) 
   { 
      CheckBoxFrame checkBoxFrame = new CheckBoxFrame(); // cria o novo objeto do arquivo 
      checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define a operação de fechamento padrão
      checkBoxFrame.setSize(275, 100); // define o tamanho da tela
      checkBoxFrame.setVisible(true); // torna visivel a tela
   } // fecha o metodo main
}// fecha a classe
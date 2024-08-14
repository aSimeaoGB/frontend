import javax.swing.JOptionPane; // faz a importação da biblioteca visual do java  (javax.swing.JOptionPane/biblioteca, modulo, componente)

public class Addition // Cria a classe "Addition"
{ // aqui inicia o bloco de codigo da classe addition
   public static void main(String[] args) // Aqui é criada a classe main
   {
      String firstNumber =  // Declaração de variavel do primeiro numero
         JOptionPane.showInputDialog("Enter first integer");  // Exibe uma caixa de diálogo para incerir o "primeiro numero"
      String secondNumber = // Declaração de variavel do segundo numero
         JOptionPane.showInputDialog("Enter second integer"); // Exibe uma caixa de diálogo para incerir o "segundo numero"

      int number1 = Integer.parseInt(firstNumber);   // Declaração de variavel do primeiro numero
      int number2 = Integer.parseInt(secondNumber); // Segundo numero escolhido // number1 number2 são variaveis
           
      int sum = number1 + number2; // Aqui é onde as variaveis são somadas

      JOptionPane.showMessageDialog(null, "The sum is " + sum, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE); // Exibe uma caixa de diálogo com a soma dos dois inteiros
   } // Aqui encerra o bloco de codigo do metodo main
} // aqui encerra o bloco de codigo da classe addition

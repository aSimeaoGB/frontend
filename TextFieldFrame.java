import java.awt.*; // importa todos os componentes do modulo
import java.awt.event.*; // importa os componentes da babilioteca que tem uma sub modulo
import javax.swing.*; // importa os componentes da biblioteca do modulo swing

public class TextFieldFrame extends JFrame // cria a classe TextFieldFrame que herda os componentes da JFrame
{
   private final JTextField textField1; // declaração das variaveis qual não pode ser editada do texto 
   private final JTextField textField2; // declaração das variaveis qual não pode ser editada do texto
   private final JTextField textField3; // declaração das variaveis qual não pode ser editada do texto
   private final JPasswordField passwordField; // declaração de variavel que não deve ser editada de seha

   public TextFieldFrame()
   {
      super("Testing JTextField and JPasswordField"); // exibe o titulo do texto na parte superior
      setLayout(new FlowLayout());

      textField1 = new JTextField(10); // define o tamanho da coluna do texto
      add(textField1); // add textField1 to JFrame

      textField2 = new JTextField("Enter your text here now"); // texto exibido ao lado da caixa de texto
      add(textField2); // add textField2 to JFrame

      textField3 = new JTextField("Uneditable text field", 21);
      textField3.setEditable(false); // disable imput
      add(textField3); // add textField3 to JFrame

      passwordField = new JPasswordField("Hidden text");
      add(passwordField); // add passwordField to JFrame

      TextFieldHandler handler = new TextFieldHandler(); //
      textField1.addActionListener(handler);  // ação de escuta que invoca o handler
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField.addActionListener(handler);
   } // end TextFieldFrame constructor

   private class TextFieldHandler implements ActionListener // classe privada que executa o ActionListener
   {
      @Override //
      public void actionPerformed(ActionEvent event) // 
      {
         String string = ""; // = operador de atribuição
         if (event.getSource() == textField1) // == operador de comparação
            string = String.format("textField1: %s", // formato da string
               event.getActionCommand()); // o texto que vai ser digitado

         else if (event.getSource() == textField2)
            string = String.format("textField2: %s",
               event.getActionCommand()); // exibe o texto do objeto em string

         else if (event.getSource() == textField3)
            string = String.format("textField3: %s", 
               event.getActionCommand()); // exibe o texto do objeto em string

         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand()); // exibe o texto do objeto em string

         JOptionPane.showMessageDialog(null, string); // exibe uma caixa de mensagem
      }  // final da sub classe
   } // final private inner class TextFieldHandler
} // final classe TextFieldFrame
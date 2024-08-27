import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.font.*;
// faz a importação os itens da biblioteca

public class CheckBoxFrame extends JFrame // chechBox erda do JFrame
{
   private final JTextField textField; 
   private final JCheckBox boldJCheckBox; 
   private final JCheckBox italicJCheckBox; 
   private final JCheckBox underlineJCheckBox;

   public CheckBoxFrame()
   {
      super("JCheckBox Test"); // texto que aparece no titulo na parte superior
      setLayout(new FlowLayout()); // define o layout da tela

      textField = new JTextField ("Watch the font style change", 20); // declaração de variavel
      textField.setFont(new Font("Serif", Font.PLAIN, 14)); // define o tamanho da fonte e o tipo
      add(textField); // adiciona à variavel 

      boldJCheckBox = new JCheckBox("Bold"); // declaração de variavel 
      italicJCheckBox = new JCheckBox("Italic"); // declaração de variavel 
      underlineJCheckBox = new JCheckBox("UnderLine");
      add(boldJCheckBox); // adiciona à variavel do JFrame
      add(italicJCheckBox); // adiciona à variavel do JFrame
      add(underlineJCheckBox);

      CheckBoxHandler handler = new CheckBoxHandler(); // cria o contrutor
      boldJCheckBox.addItemListener(handler); // adiciona o item ao boldJChackBox
      italicJCheckBox.addItemListener(handler);// adiciona o item ao italicJChackBox
      underlineJCheckBox.addItemListener(handler);
   } 

   private class CheckBoxHandler implements ItemListener // declara a classe checkBoxHandler que implementa os intens do itemListner
   {
      @Override //
      public void itemStateChanged(ItemEvent event) // metodo sem retorno qeue tem como parametro event
      {
         Font font = null;// define a fariavel fonte do tipo Fonte

         // aqui acontece a magica.
         if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()) // se a variavel estiver selecionado...
            font = new Font("Serif",Font.BOLD + Font.ITALIC, 14); // torna o texto da fonte Negrito e Italico
         else if (boldJCheckBox.isSelected()) // se a caixa estiver selecionado
            font = new Font("Serif", Font.BOLD, 14); // torna a fonte do texto Negrito
         else if (italicJCheckBox.isSelected()) // se a caixa estiver selecionada
            font = new Font("Serif", Font.ITALIC, 14); // torna a fonte do texto Italico 
         else
            font = new Font("Serif", Font.PLAIN, 14); // deixa a fonte do texto Plana (padrão)
         // define os comando das caixas de seleção
         textField.setFont(font);

         if(underlineJCheckBox.isSelected()){
            font = textField.getFont();
            Map attributes = font.getAttributes();
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            textField.setFont(font.deriveFont(attributes));
            font = new Font(attributes);
         }
      }
   }
} // fecha classe
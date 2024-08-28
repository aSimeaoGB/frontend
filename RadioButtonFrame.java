import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonFrame extends JFrame // classe que erda os arquivos da JFrame
{
   //todas as variavei declarada da classe
   private JTextField textField;

   private Font plainFont; 
   private Font boldFont; 
   private Font italicFont; 
   private Font boldItalicFont; 

   private Color blueColor;
   private Color redColor;
   private Color yellowColor;
   private Color blakColor;

   private JRadioButton plainJRadioButton; 
   private JRadioButton boldJRadioButton; 
   private JRadioButton italicJRadioButton; 
   private JRadioButton boldItalicJRadioButton; 
   private ButtonGroup radioGroup;
   
   private JRadioButton blueJRadioButton;
   private JRadioButton redJRadioButton; 
   private JRadioButton yellowJRadioButton; 
   private JRadioButton blackJRadioButton;  
   private ButtonGroup colorRadioGroup;

   public RadioButtonFrame() // construtor
   {
      super("RadioButton Test"); // titulo exibido na parte superior
      setLayout(new FlowLayout()); // define o layout

      textField = new JTextField("Watch the font style change", 25); //define um novo objeto, que aparece dentro do campo imput com 25 colunas
      add(textField); 

      plainJRadioButton = new JRadioButton("Plain", true); // define o botão Plain selecionado como padrão
      boldJRadioButton = new JRadioButton("Bold", false); // define o botão Bold
      italicJRadioButton = new JRadioButton("Italic", false); // define o botão Italic
      boldItalicJRadioButton = new JRadioButton("Bold/Italic", false); // define o botao Bold/Italic
      add(plainJRadioButton); 
      add(boldJRadioButton);
      add(italicJRadioButton); 
      add(boldItalicJRadioButton); 
      
      blueJRadioButton = new JRadioButton("blue", false); 
      redJRadioButton = new JRadioButton("red", false); 
      yellowJRadioButton = new JRadioButton("yellow", false); 
      blackJRadioButton = new JRadioButton("black", true); 
      add(blueJRadioButton);
      add(redJRadioButton); 
      add(yellowJRadioButton);
      add(blackJRadioButton); 

      colorRadioGroup = new ButtonGroup(); 
      colorRadioGroup.add(blueJRadioButton);
      colorRadioGroup.add(redJRadioButton); 
      colorRadioGroup.add(yellowJRadioButton); 
      colorRadioGroup.add(blackJRadioButton); 

      //qualdo marcar um o outro sera desmarcado
      radioGroup = new ButtonGroup(); //declaração de variavel
      radioGroup.add(plainJRadioButton);
      radioGroup.add(boldJRadioButton); 
      radioGroup.add(italicJRadioButton); 
      radioGroup.add(boldItalicJRadioButton); 

      //define a fonte o formato e o tamanho
      plainFont = new Font("Serif", Font.PLAIN, 14);
      boldFont = new Font("Serif", Font.BOLD, 14);
      italicFont = new Font("Serif", Font.ITALIC, 14);
      boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);

      blueColor = new Color(0, 0, 255);
      redColor = new Color(255, 0, 0);
      yellowColor = new Color(255, 255, 0);
      blakColor = new Color(0, 0, 0);

      // eles quem envia o comando para definir o formato 
      plainJRadioButton.addItemListener(
         new RadioButtonHandler(plainFont));
      boldJRadioButton.addItemListener(
         new RadioButtonHandler(boldFont));
      italicJRadioButton.addItemListener(
         new RadioButtonHandler(italicFont));
      boldItalicJRadioButton.addItemListener(
         new RadioButtonHandler(boldItalicFont));

      blueJRadioButton.addItemListener(
         new ColorRadioButtondHandler(blueColor));
      redJRadioButton.addItemListener(
         new ColorRadioButtondHandler(redColor));
      yellowJRadioButton.addItemListener(
         new ColorRadioButtondHandler(yellowColor));
      blackJRadioButton.addItemListener(
         new ColorRadioButtondHandler(blakColor));
   } 

   private class RadioButtonHandler implements ItemListener // classe que implementa os itens
   {
      private Font font;

      public RadioButtonHandler(Font f)
      {
         font = f; 
      } 
   
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setFont(font); 
      } 
   } 
   private class ColorRadioButtondHandler implements ItemListener
   {
      private Color color;

      public ColorRadioButtondHandler(Color c)
      {
         color = c;
      }
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setForeground(color);
      }
   }
}
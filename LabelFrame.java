import java.awt.*; // specifies how components are arranged
import javax.swing.*; //carrega todos os componentes do módulo swomg da biblioteca javax

public class LabelFrame extends JFrame 
{
   private final JLabel label1; // JLabel with just text
   private final JLabel label2; // JLabel constructed with text and icon
   private final JLabel label3; // JLabel with added text and icon

   public LabelFrame()
   {
      super("Testing JLabel"); // titulo exibido na parte superior
      setLayout(new FlowLayout()); // define a forma do layout

      label1 = new JLabel("Label with text"); // declaração de variavel
      label1.setToolTipText("This is label1"); // define ferramenta de dica
      add(label1); // add label1 to JFrame

      Icon bug = new ImageIcon(getClass().getResource("bug1.png")); // define a calasse icon a uma nova variavel
      label2 = new JLabel("Label with text and icon", bug, // atribuição de valor a variavel
         SwingConstants.LEFT);
      label2.setToolTipText("This is label2"); // define uma ferramenta de dica no texto
      add(label2); // adiciona a variavel ao JFrame

      label3 = new JLabel(); // declaração de variavel
      label3.setText("Label with icon and text at bottom"); // define um texto a variavel 
      label3.setIcon(bug); // invoca a variavel do tipo icon
      label3.setHorizontalTextPosition(SwingConstants.CENTER); // define a posição do texto horizontalmente do tipo center
      label3.setVerticalTextPosition(SwingConstants.BOTTOM); // define a posição do texto verticalmente do tipo bottom
      label3.setToolTipText("This is label3"); // define uma ferramenta de dica no texto
      add(label3); // adiciona a variavel ao JFrame
   } 
} // finaliza a classe LabelFrame
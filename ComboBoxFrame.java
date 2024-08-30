// importação da biblioteca
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxFrame extends JFrame // criação da classe que vai herdar os arquivos
{
   private final JComboBox<String> imagesJComboBox; 
   private final JLabel label;

   private static final String[] names = 
      {"bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif", "cicada.jpg"};
   private final Icon[] icons = { 
      new ImageIcon(getClass().getResource(names[0])),
      new ImageIcon(getClass().getResource(names[1])), 
      new ImageIcon(getClass().getResource(names[2])),
      new ImageIcon(getClass().getResource(names[3])),
      new ImageIcon(getClass().getResource(names[4]))};

   public ComboBoxFrame() // construtor
   {
      super("Testing JComboBox"); // titulo exibido na parte superior da tela
      setLayout(new FlowLayout());  // define o layout, nessa caso ele é responsivel

      imagesJComboBox = new JComboBox<String>(names); 
      imagesJComboBox.setMaximumRowCount(2); // define a quantidade de linha exibida antes de rolagem

      imagesJComboBox.addItemListener(
         new ItemListener()
         {
            @Override
            public void itemStateChanged(ItemEvent event)
            {
               if (event.getStateChange() == ItemEvent.SELECTED)
                  label.setIcon(icons[
                     imagesJComboBox.getSelectedIndex()]);
            } 
         }
      ); 

      add(imagesJComboBox);
      label = new JLabel(icons[0]);
      add(label); 
   }
}
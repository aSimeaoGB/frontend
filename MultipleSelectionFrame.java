//importação da biblioteca
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultipleSelectionFrame extends JFrame // declaração de classe que herda o JFrame 
{
   private final JList<String> colorJList; 
   private final JList<String> copyJList;
   private final JList<String> copyJList2;  // cópia 3 do

   private JButton copyJButton; 
   private JButton copyJButton2; // cópia 2 do JButton
   
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow"};

   public MultipleSelectionFrame() // construtor
   {
      super("Multiple Selection Lists"); // titulo exibido na partesuperior
      setLayout(new FlowLayout()); //define o layout como responsivo

      colorJList = new JList<String>(colorNames); 
      colorJList.setVisibleRowCount(5); // quantidades de linhas que ira aparecer 
      colorJList.setSelectionMode( 
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // define o modo de seleção
      add(new JScrollPane(colorJList)); 

      copyJButton = new JButton("Copy >>>"); //define o nome do botão
      copyJButton.addActionListener( //adiciona uma ação para o botão
         new ActionListener()  
         {  
            @Override
            public void actionPerformed(ActionEvent event)
            {
               copyJList.setListData(
                  colorJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 
      add(copyJButton); 

      copyJList = new JList<String>(); 
      copyJList.setVisibleRowCount(5); // só ira mostrar 5 linhas por vez
      copyJList.setFixedCellWidth(100); // define a largura como 100px
      copyJList.setFixedCellHeight(15); 
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_SELECTION); // define o modo de seleção como um por vez
      add(new JScrollPane(copyJList)); 

      copyJButton2 = new JButton("Copy >>>"); //define o nome do botão
      copyJButton2.addActionListener( //adiciona uma ação para o botão
         new ActionListener()  
         {  
            @Override
            public void actionPerformed(ActionEvent event)
            {
               copyJList2.setListData(
                  copyJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 
      add(copyJButton2); 

      copyJList2 = new JList<String>(); 
      copyJList2.setVisibleRowCount(5); // só ira mostrar 5 linhas por vez
      copyJList2.setFixedCellWidth(100); // define a largura como 100px
      copyJList2.setFixedCellHeight(15); 
      copyJList2.setSelectionMode(
         ListSelectionModel.SINGLE_SELECTION); // define o modo de seleção como um por vez
      add(new JScrollPane(copyJList2)); 

   } 
}
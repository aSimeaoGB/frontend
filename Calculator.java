import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator extends JFrame {
   private final JTextField textField1;
   private final JTextField textField2;

   private final JLabel label1;
   private final JLabel label2;

   private final JButton btnCalcular;
   private final JLabel lblNotificacao;

   public Calculator() // cosntrutor
   {
      super("Calculadora de soma");
      setLayout(new GridLayout(3, 2, 5, 5));

      label1 = new JLabel("Digite o numer 1", SwingConstants.RIGHT); // o SwingConstants.RIGHT define o texto a direita
      add(label1);
      textField1 = new JTextField(10);
      add(textField1);

      label2 = new JLabel("Digite o numer 2", SwingConstants.RIGHT); // texto que aparecera a direita antes da ciaxa
      add(label2);
      textField2 = new JTextField(10);
      add(textField2);

      btnCalcular = new JButton("Calcular");
      add(btnCalcular);
      lblNotificacao = new JLabel("Resultado: ?");
      add(lblNotificacao);

      CalculatorHandler handler = new CalculatorHandler();
      btnCalcular.addActionListener(handler);
   }

   private class CalculatorHandler implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent event) {
         if (textField1.getText().trim().length() == 0) {
            // notificar usuario que o campo 1 está vazio
            lblNotificacao.setText("O campo 1 está vazio!");
            textField1.requestFocus();
         } else {
            if (textField2.getText().trim().length() == 0) {
               // notificar usuario que o campo 2 está vazio
               lblNotificacao.setText("O campo 2 está vazio!");
               textField2.requestFocus();
            } else {
               // aqui sera feita a soma
               try {
                  int soma = Integer.valueOf(textField1.getText()) + Integer.valueOf(textField2.getText());
                  lblNotificacao.setText(String.format("Resultado: %s", soma));
               } catch (Exception e) {
                  lblNotificacao.setText(
                        "<html><body>ops Parece que foi digitado alguma coisa errada, favor revisar a digiração, pois podem ser digitados apenas números inteiros.</body></html>");
               }
            }
         }
      }
   }

   public static void main(String[] args) {
      Calculator calculator = new Calculator();
      calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      calculator.setSize(350, 300);
      calculator.setVisible(true);
   }
}
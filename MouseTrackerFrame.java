//importação da biblioteca
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseTrackerFrame extends JFrame
{
   private final JPanel mousePanel;
   private final JLabel statusBar;

   public MouseTrackerFrame()// construtor
   {
      super("Demonstrating Mouse Events");// titulo

      mousePanel = new JPanel(); // novo objeto
      mousePanel.setBackground(Color.WHITE); //define a cor do fundo do painel
      add(mousePanel, BorderLayout.CENTER); // define o painel ao centro

      statusBar = new JLabel("Mouse outside JPanel"); 
      add(statusBar, BorderLayout.SOUTH);// define o status da barra em baixo

      MouseHandler handler = new MouseHandler(); 
      mousePanel.addMouseListener(handler); // ao clicar
      mousePanel.addMouseMotionListener(handler); // ao movimentar
   }

   private class MouseHandler implements MouseListener, 
      MouseMotionListener 
   {
      @Override
      public void mouseClicked(MouseEvent event)
      {
         statusBar.setText(String.format("Clicked at [left: %d, top: %d, right: %d, bottom: %d]", // [%d, %d] representa X e Y
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      } 

      @Override
      public void mousePressed(MouseEvent event)
      {
         statusBar.setText(String.format("Pressed at [left: %d, top: %d, right: %d, bottom: %d]", 
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      }

      @Override
      public void mouseReleased(MouseEvent event)
      {
         statusBar.setText(String.format("Released at [left: %d, top: %d, right: %d, bottom: %d]", 
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      }

      @Override
      public void mouseEntered(MouseEvent event)
      {
         statusBar.setText(String.format("Mouse entered at [left: %d, top: %d, right: %d, bottom: %d]", 
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
         mousePanel.setBackground(Color.GREEN);
      }

      @Override
      public void mouseExited(MouseEvent event)
      {
         statusBar.setText("Mouse outside JPanel");
         mousePanel.setBackground(Color.WHITE);
      }

      @Override
      public void mouseDragged(MouseEvent event)
      {
         statusBar.setText(String.format("Dragged at [left: %d, top: %d, right: %d, bottom: %d]", 
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      } 

      @Override
      public void mouseMoved(MouseEvent event)
      {
         statusBar.setText(String.format("Moved at [left: %d, top: %d, right: %d, bottom: %d]", 
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      } 
   }
}
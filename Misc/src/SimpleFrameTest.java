
  
   import java.awt.*;
import javax.swing.*;
 
   /**
    * @version 1.32 2007-06-12
    * @author Cay Horstmann
    */
   public class SimpleFrameTest
   {
      public static void main(String[] args)
      {
         EventQueue.invokeLater(new Runnable()
            {
               public void run()
              {
                 JFrame frame = new SimpleFrame();
                  frame.setTitle("stolen");
                  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  JPanel c = new CalculatorPanel();
                  frame.add(c);
                  frame.setVisible(true);
                  
                
               }
            });
      }
   }
 
   class SimpleFrame extends JFrame
   {
      private static final int DEFAULT_WIDTH = 200;
     private static final int DEFAULT_HEIGHT = 200;
 
      public SimpleFrame()
      {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
     
      }
   }
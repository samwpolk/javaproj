import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


//import CalculatorPanel.CommandAction;
//import CalculatorPanel.InsertAction;


public class sw  extends  JPanel {
	
	public static void main(String Args[]){
		 final double StartTime = System.currentTimeMillis();
		 final JFrame timeStuff = new JFrame();
		 JButton startIt  =  new JButton("press");
		  final JTextArea ta = new JTextArea("ddd");
	     timeStuff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     startIt.addActionListener(new ActionListener() {
	    	 
	            public void actionPerformed(ActionEvent e)
	            {
	                //Execute when button is pressed
	            	double lEndTime = System.currentTimeMillis();
	            	double difference = (lEndTime - StartTime)/1000;
	               // ta.setText("ss");
	              //  ta.setVisible(true);
	               // timeStuff.add(ta);
	            	
	                System.out.println( difference );
	            }
	        });
	     
	     
	    
		long lEndTime = System.currentTimeMillis();
	    
	 
		//long difference = lEndTime - StartTime;
	 
		//System.out.println("Elapsed milliseconds: " + difference);
	   
	    BorderLayout bl = new BorderLayout();
	    timeStuff.setLayout(bl);
	    timeStuff.setSize(100,100);
	    timeStuff.add(startIt);
	    timeStuff.setVisible(true);
	    
	    
	    //JFrame jf = new JFrame();
	    //jf.setLayout(bl);
	    //jf.add(startIt);
	    //jf.setVisible(true);
	    
	   
      
	}


}

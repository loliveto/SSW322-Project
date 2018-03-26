package test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Tests extends Frame{
	   private Button[] btns;  // Array of 10 numeric Buttons
	   private Button btnHash, btnStar;
	   private TextField tfDisplay;
	   private Label text;
	 
	   
	   // Constructor to setup GUI components and event handlers
	   public Tests () {
	      // Set up display panel
	      Panel panelDisplay = new Panel(new FlowLayout());
	      tfDisplay = new TextField("0", 10);
	      text = new Label("Questionnaire CLAN");
	      panelDisplay.add(text);
	      Color c = new Color(51, 165, 156);
	      Dimension d = new Dimension(180,180);
	      //GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	      //ge.getAllFonts();
	      Font myFont = new Font("Arial", Font.BOLD, 15);
	 
	      addWindowListener(new WindowAdapter(){  
	            public void windowClosing(WindowEvent e) {  
	                dispose();  
	            }  
	        });  
	      
	      // Set up button panel
	      Panel panelButtons = new Panel(new GridLayout(2, 2, 20, 20));
	      btns = new Button[4];  // Construct an array of 10 numeric Buttons
	      btns[0] = new Button("Create a Test");  // Construct Button "1"
	      panelButtons.add(btns[0]);  // The Panel adds this Button
	      btns[1] = new Button("Create a Survey");
	      panelButtons.add(btns[1]);
	      btns[2] = new Button("Take a Test/Survey");
	      panelButtons.add(btns[2]);
	      btns[3] = new Button("View my Tests/Surveys");
	      panelButtons.add(btns[3]);
	      
	      for(int i=0; i<btns.length; i++){
	    	  btns[i].setPreferredSize(d);
		      btns[i].setBackground(c);
		      btns[i].setFont(myFont);
	      }	      
	 
	      setLayout(new BorderLayout());  // "super" Frame sets to BorderLayout
	      add(panelDisplay, BorderLayout.NORTH);
	      add(panelButtons, BorderLayout.SOUTH);
	 
	      setTitle("BorderLayout Demo"); // "super" Frame sets title
	      //setSize(500, 500);             // "super" Frame sets initial size
	      pack();
	      setVisible(true);              // "super" Frame shows
	   }
	 
	   private void showButtons(){
		   btns[0].addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            text.setText("Let's Create a Test!");
		         }
		      });
		   btns[1].addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            text.setText("Let's Create a Survey!");
		         }
		      });
		   btns[2].addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            text.setText("Let's Take a Test/Survey!");
		         }
		      });
		   btns[3].addActionListener(new ActionListener() {
		         public void actionPerformed(ActionEvent e) {
		            text.setText("Let's View a Tests/Surveys!");
		         }
		      });
	   }
	   
	   // The entry main() method
	   public static void main(String[] args) {
	      Tests t = new Tests();  // Let the constructor do the job
	      Tests t1 = new Tests();
	      t.showButtons();
	   }
}

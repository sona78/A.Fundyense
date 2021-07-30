import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class UserInput extends JFrame implements ActionListener{
	
	JButton button,button1, button2, button3,button4,button5,button6,button7,button8,button9,button10,ButtonMove;
	public String a,b,c,d,ee,f,g,h,i,j,k;
	public static Double Amm;
	public static Double Nit;
	public static Double Phos;
	public static Double Sal;
	public static Double Temp;
	public static Double Sil;
	public static Double Month;
	public static Double Lat;
	public static Double DIN;
	public static Double DON;
	public static Double Dist;
	public static int Afun;
	public static int AfunShort;
	public static String AfunString;
	public static String AfunStringShort;
	public static int EXIT;
	public void Input(){
		JOptionPane.showMessageDialog (null,"Welcome. This Application is built in order to predict Alexandrium fundyense growth and toxicity within a set of User-inputed parameters");
		JOptionPane.showMessageDialog (null,"Note: This Application is designed only for an estimated value of Alexandrium fundyense cell count and should not be used in all circumstances","Please Remember",JOptionPane.WARNING_MESSAGE);

		JOptionPane.showMessageDialog (null,"Please click on each available parameter that is present for the application to predict the A. fundyense bloom.");
		JOptionPane.showMessageDialog (null,"Note: Only enter each of the areas once unless an error occurs in inputting the value","Note to User",JOptionPane.WARNING_MESSAGE);

		JFrame frame = new JFrame("A.fundyense Growth Conditions");
		
		button = new JButton("Ammonium Content");
		button.setFont(new Font("Arial", Font.PLAIN, 20));
		button1 = new JButton("Nitrate Content");
		button1.setFont(new Font("Arial", Font.PLAIN, 20));
		button2 = new JButton("Phosphate Content");
		button2.setFont(new Font("Arial", Font.PLAIN, 20));
		button3 = new JButton("Water Salinity");
		button3.setFont(new Font("Arial", Font.PLAIN, 20));
		button4 = new JButton("Water Temperature");
		button4.setFont(new Font("Arial", Font.PLAIN, 20));
		button5 = new JButton("Silicate Content");
		button5.setFont(new Font("Arial", Font.PLAIN, 20));
		button6 = new JButton("Month of the Year");
		button6.setFont(new Font("Arial", Font.PLAIN, 20));
		button7 = new JButton("Lattitude of Bloom");
		button7.setFont(new Font("Arial", Font.PLAIN, 20));
		button8 = new JButton("Dissolved Inorganic Nitrogen");
		button8.setFont(new Font("Arial", Font.PLAIN, 20));
		button9 = new JButton("Dissolved Organic Nitrogen");
		button9.setFont(new Font("Arial", Font.PLAIN, 20));
		button10 = new JButton("Bloom's Distance from Coast");
		button10.setFont(new Font("Arial", Font.PLAIN, 20));
		ButtonMove = new JButton("Calculate Results");
		ButtonMove.setFont(new Font("Arial",Font.BOLD,20));
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		frame.add(button10);
		frame.add(ButtonMove);
		frame.setLayout(new GridLayout(2,3));
		//frame.setSize(2560,1600);  
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//frame.setUndecorated(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);  
		// Null Value Area
		Amm = 1030.0;
		Nit = 1030.0;
		Phos = 1030.0;
		Sal = 1030.0;
		Temp = 1030.0;
		Sil = 1030.0;
		Month = 1030.0;
		Lat = 1030.0;
		DIN = 1030.0;
		DON = 1030.0;
		Dist = 1030.0;
		Afun = 1030;
		AfunShort = 1030;
		button.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	a =JOptionPane.showInputDialog("Please input the Ammonium level in μM per L in the Input area");
		    	Amm = Double.parseDouble(a);
		    	}
	        } );
		 button1.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        	b =JOptionPane.showInputDialog("Please input the Nitrate level in μM per L in the Input area");
			    	 Nit = Double.parseDouble(b);
			    	}
		        } );
		 button2.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        	c =JOptionPane.showInputDialog("Please input the Phosphate level in μM per L in the Input area");
			    	Phos = Double.parseDouble(c);
			    	}
		        } );
		 button3.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        	d =JOptionPane.showInputDialog("Please input the Water Salinity in ppt (Parts per Thousand) in the Input area");
			    	Sal = Double.parseDouble(d);
			    	}
		        } );
		 button4.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        	ee =JOptionPane.showInputDialog("Please input the Water Temperature in °C in the Input area");
			    	 Temp = Double.parseDouble(ee);
			    	}
		        } );
		 button5.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
				    	f =JOptionPane.showInputDialog("Please input the Silicate level in μM per L in the Input area");
				    	Sil = Double.parseDouble(f);
			    	}
		        } );
		 button6.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        	g =JOptionPane.showInputDialog("Please input the Month that is needed to be tested as an integer (ie: January = 1)");
			    	Month = Double.parseDouble(g);
			    	}
		        } );
		 button7.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
			    	h =JOptionPane.showInputDialog("Please input the Lattitude of the sample in the Input area");
			    	Lat = Double.parseDouble(h);
			    	}
		        } );
		 button8.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        	i =JOptionPane.showInputDialog("Please input the Dissolved Inorganic Nitrogen (DIN) level in μM per L in the Input area");
			    	DIN = Double.parseDouble(i);
			    	}
		        } );
		 button9.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
			    	j =JOptionPane.showInputDialog("Please input the Dissolved Organic Nitrogen (DON) level in μM per L in the Input area");
			    	DON = Double.parseDouble(j);
			    	}
		        } );
		 button10.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        	k =JOptionPane.showInputDialog("Please input the distance from the coast that the sample was taken in miles in the Input area");
			    	Dist = Double.parseDouble(k);
			    	}
		        } );
		 ButtonMove.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        	frame.dispose();
		        	//Move to next class
		        	Growth CalGrowth = new Growth();
		        	CalGrowth.GrowthOutput();
			    	}
		        } );
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if( ((JButton) e.getSource()) == button ) actionPerformed(e);
	        else if( ((JButton) e.getSource()) == button1) actionPerformed(e);
	        else if( ((JButton) e.getSource()) == button2) actionPerformed(e);
	        else if( ((JButton) e.getSource()) == button3) actionPerformed(e);
	        else if( ((JButton) e.getSource()) == button4) actionPerformed(e);
	        else if( ((JButton) e.getSource()) == button5) actionPerformed(e);
	        else if( ((JButton) e.getSource()) == button6) actionPerformed(e);
	        else if( ((JButton) e.getSource()) == button7) actionPerformed(e);
	        else if( ((JButton) e.getSource()) == button8) actionPerformed(e);
	        else if( ((JButton) e.getSource()) == button9) actionPerformed(e);
	        else if( ((JButton) e.getSource()) == button10) actionPerformed(e);
	}
	 /*public void ButtonAction(ActionEvent evt) {

		    if (Input == button) {
		    	a =JOptionPane.showInputDialog("Please input the ammonium level in μM per L in the Input area");
		    	double Amm = Double.parseDouble(a);
		    }
		    if (Input == button1) {
		    	b =JOptionPane.showInputDialog("Please input the Nitrate level in μM per L in the Input area");
		    	double Nit = Double.parseDouble(b);
		    }
		    if (Input == button2) {
		    	c =JOptionPane.showInputDialog("Please input the Phosphate level in μM per L in the Input area");
		    	double Phos = Double.parseDouble(c);
		    }
		    if (Input == button3) {
		    	d =JOptionPane.showInputDialog("Please input the Water Salinity in ppt (Parts per Thousand) in the Input area");
		    	double Sal = Double.parseDouble(d);
		    }
		    if (Input == button4) {
		    	ee =JOptionPane.showInputDialog("Please input the Water Temperature in °C in the Input area");
		    	double Temp = Double.parseDouble(ee);
		    }
		    if (Input == button5) {
		    	f =JOptionPane.showInputDialog("Please input the Silicate level in μM per L in the Input area");
		    	double Sil = Double.parseDouble(f);
		    }
		    if (Input == button6) {
		    	g =JOptionPane.showInputDialog("Please input the Date that the sample was taken in the form (MM,DD) in the Input area");
		    	double Month = Double.parseDouble(g);
		    }
		    if (Input == button7) {
		    	h =JOptionPane.showInputDialog("Please input the Lattitude of the sample in the Input area");
		    	double Lat = Double.parseDouble(h);
		    }
		    if (Input == button8) {
		    	i =JOptionPane.showInputDialog("Please input the Dissolved Inorganic Nitrogen (DIN) level in μM per L in the Input area");
		    	double DIN = Double.parseDouble(i);
		    }
		    if (Input == button9) {
		    	j =JOptionPane.showInputDialog("Please input the Dissolved Organic Nitrogen (DON) level in μM per L in the Input area");
		    	double DON = Double.parseDouble(j);
		    }
		    if (Input == button10) {
		    	k =JOptionPane.showInputDialog("Please input the distance from the coast that the sample was taken in miles in the Input area");
		    	double Dist = Double.parseDouble(k);
		    }
		    if (Input == ButtonExit) {
		    	System.exit(0);
		    }
	 }
	 */
	

	
}



package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame implements ActionListener{
		 private JPanel pan = new JPanel();
	    	private JButton choix1 = new JButton("Level 1");
	    	private JButton choix2 = new JButton("Level 2");
	    	private JButton choix3 = new JButton("Level 3");
	    	private JButton choix4 = new JButton("Level 4");
	    	private JButton choix5 = new JButton("Level 5");
	    	
	    	public Menu() {
	    		this.setTitle("Menu");
	    		this.setSize(300, 150);
	    	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	    this.setLocationRelativeTo(null);
	    	    //Ajout du bouton à notre content pane
	    	    choix1.addActionListener(this);
	    	    pan.add(choix1);
	    	    choix2.addActionListener(this);
	    	    pan.add(choix2);
	    	    choix3.addActionListener(this);
	    	    pan.add(choix3);
	    	    choix4.addActionListener(this);
	    	    pan.add(choix4);
	    	    choix5.addActionListener(this);
	    	    pan.add(choix5);
	    	    this.setContentPane(pan);
	    	    this.setVisible(true);
	    	}
	    	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int choix=0;
				while(choix==0) {
				if(e.getSource() == choix1) {
					System.out.println("Vous avez cliqué 1.");
					choix=1;
				}
				if(e.getSource() == choix2) {
					System.out.println("Vous avez cliqué 2.");
					choix=2;
				}
				if(e.getSource() == choix3) {
					System.out.println("Vous avez cliqué 3.");
					choix=3;
				}
				if(e.getSource() == choix4) {
					System.out.println("Vous avez cliqué 4.");
					choix=4;
				}
				if(e.getSource() == choix5) {
					System.out.println("Vous avez cliqué 5.");
					choix=5;
				}
				}
				
			}
			
	    	
	    	
	    //	public int choixlvl() {
	    		
	    		// return choix;
	    			
	    //	}
}

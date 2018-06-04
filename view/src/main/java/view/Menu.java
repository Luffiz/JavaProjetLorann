package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import controller.ControllerFacade;
import model.ModelFacade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import view.ViewFrame;
/**
 * <b> Display of the level selection menu. </b>
 * 
 * @author ptorc
 *
 */
public class Menu extends JFrame implements ActionListener{
	/**
	 * 
	 */
		private static final long serialVersionUID = 1L;
			final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());
		 	private JPanel pan = new JPanel();
	    	private JButton choix1 = new JButton("Level 1");
	    	private JButton choix2 = new JButton("Level 2");
	    	private JButton choix3 = new JButton("Level 3");
	    	private JButton choix4 = new JButton("Level 4");
	    	private JButton choix5 = new JButton("Level 5");
	    	
	    	/**
	    	 * Initialize the menu object.
	    	 */
	    	public Menu() {
	    		this.setTitle("Menu");
	    		this.setSize(300, 150);
	    	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	    this.setLocationRelativeTo(null);
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
	    	/**
	    	 * Retrieves the map corresponding to the choice made.
	    	 */
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == choix1) {
					try {
						this.setVisible(false);
						this.controller.start(1);
						ViewFrame frm = new view.ViewFrame(this.controller.getMap(), 1);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			
				}
				if(e.getSource() == choix2) {
				
					try {
						this.setVisible(false);
						this.controller.start(2);
						view.ViewFrame frm = new view.ViewFrame(controller.getMap(), 2);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(e.getSource() == choix3) {
			
					try {
						this.setVisible(false);
						this.controller.start(3);
						view.ViewFrame frm = new view.ViewFrame(controller.getMap(), 3);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(e.getSource() == choix4) {
					try {
						this.setVisible(false);
						this.controller.start(4);
						view.ViewFrame frm = new view.ViewFrame(controller.getMap(), 4);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(e.getSource() == choix5) {
					try {
						this.setVisible(false);
						controller.start(5);
						view.ViewFrame frm = new view.ViewFrame(controller.getMap(), 5);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}

}

package view;

import javax.swing.JOptionPane;
import view.ViewFacade;


/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

	
    public ViewFacade() {
    	Menu menu = new Menu();
        view.ViewFrame view = new view.ViewFrame();
    }

    

}

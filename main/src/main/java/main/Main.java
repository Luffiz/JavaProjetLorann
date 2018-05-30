package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;
import showboard.BoardFrame;
import view.ViewFacade;
import view.ViewFrame;


/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
    	
    	view.ViewFrame frm = new view.ViewFrame();

    	/*final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }*/
    }

}


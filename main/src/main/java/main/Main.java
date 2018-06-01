package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;
import showboard.BoardFrame;
import view.ViewFacade;
import view.ViewFrame;
import view.Menu;

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
    public static void main(final String[] args) throws SQLException {
    	
    	int choix = 0;
        
        	new ControllerFacade(new ModelFacade(), new ViewFacade());
        	/*Menu menu = new Menu();
            controller.start(1);
            view.Vie} catch {}
        /*catch (final SQLException exception) 
        {
            exception.printStackTrace();
        }*/
    }
}


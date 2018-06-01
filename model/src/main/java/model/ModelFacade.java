package model;

import java.sql.SQLException;

import model.dao.MapDAO;
import model.Game_BOOT;;


/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
    	new Game_BOOT();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public Map getMapById(final int id) throws SQLException {
        return MapDAO.getMapById(id);
    }

   
   
    

    
    

}

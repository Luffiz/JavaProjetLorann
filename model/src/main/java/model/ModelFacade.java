package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.MapDAO;
import model.dao.MapInitDAO;

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
        super();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public Map getMapById(final int id) throws SQLException {
        return MapDAO.getMapById(id);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    @Override
    public Map getExampleByName(final String name) throws SQLException {
        return MapDAO.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     */
    @Override
    public List<Map> getAllExamples() throws SQLException {
        return MapDAO.getAllExamples();
    }
    

    
    /*
     * (non-Javadoc)
     * @see model.IModel#getMapAll()
     */
    public List<MapInit> getMapAll() throws SQLException {
        return MapInitDAO.getMapAll();
    }
    

}

package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Map;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class MapDAO extends AbstractDAO {

	
    /** The sql example by id. */
    private static String sqlMapById   = "{call mapsById(?)}";

    /** The sql example by name. */
    private static String sqlExampleByName = "{call findExampleByName(?)}";

    /** The sql all examples. */
    private static String sqlAllExamples   = "{call findAllExamples()}";

    /** Affichage de la map par l'ID **/
    //private static String sqlMapsById = "{call mapsById(?)}";
    
    
    /** The id column index. */
    private static int    idColumnIndex    = 1;

    /** The name column index. */
    private static int    mapColumnIndex  = 2;

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    
    
    public static Map getMapById(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlMapById);
        Map map = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                map = new Map(result.getInt(idColumnIndex), result.getString(mapColumnIndex));
            }
            result.close();
        }
        return map;
    }

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    public static Map getExampleByName(final String name) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlExampleByName);
        Map example = null;

        callStatement.setString(1, name);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Map(result.getInt(idColumnIndex), result.getString(mapColumnIndex));
            }
            result.close();
        }
        return example;
    }

    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */
    public static List<Map> getAllExamples() throws SQLException {
        final ArrayList<Map> examples = new ArrayList<Map>();
        final CallableStatement callStatement = prepareCall(sqlAllExamples);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
                examples.add(new Map(result.getInt(idColumnIndex), result.getString(mapColumnIndex)));
            }
            result.close();
        }
        return examples;
    }
    /*
    public static MapInit getMapById(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlMapsById);
        MapInit map = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                map = new MapInit(result.getInt(idColumnIndex), result.getString(mapColumnIndex));
            }
            result.close();
        }
        return map;
    }*/
}

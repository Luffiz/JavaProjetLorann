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

    /** The id column index. */
    private static int    idColumnIndex    = 1;

    /** The name column index. */
    private static int    mapColumnIndex  = 2;

    /**
     * Gets the map by id.
     *
     * @param id
     *            the id
     * @return the map by id
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
}

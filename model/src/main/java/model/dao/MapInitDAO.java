package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.MapInit;

public class MapInitDAO extends AbstractDAO{

    /** Affichage de la map par l'ID **/
    private static String sqlMapsById = "{call mapsById(?)}";

    /** Affichage de la map par l'ID **/
    private static String sqlMapsAll = "{call mapsAll()}";
    
    
    /** The id column index. */
    private static int    idColumnIndex    = 1;

    /** The map column index. */
    private static int    mapColumnIndex  = 2;
    
    
    
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
    }
    
    public static List<MapInit> getMapAll() throws SQLException {
        final ArrayList<MapInit> maps = new ArrayList<MapInit>();
        final CallableStatement callStatement = prepareCall(sqlMapsAll);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
                maps.add(new MapInit(result.getInt(idColumnIndex), result.getString(mapColumnIndex)));
            }
            result.close();
        }
        return maps;
    }
	
}

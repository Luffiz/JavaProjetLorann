package model;

/**
 * <h1>Classe des Maps</h1>
 *
 * @author Paul TORCHET paul.torchet@viacesi.fr
 * @version 1.0
 */
public class MapInit {

    /** ID de la Map. */
    private int id;

    /** Texte brut de la Map */
    private String map;
	
    /**
     * Instancie une nouvelle map.
     *
     * @param id
     *            l'ID
     * @param map
     *            Texte brut de la map
     */
    public MapInit(final int id, final String map) {
        super();
        this.id = id;
        this.map = map;
    }
    
    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets the map.
     *
     * @return the map
     */
    public String getMap() {
        return this.map;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setMap(final String map) {
        this.map = map;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return /*this.getId() + " : " + */this.getMap();
    }
}
    

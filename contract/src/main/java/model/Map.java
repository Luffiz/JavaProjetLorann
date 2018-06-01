package model;

/**
 * <h1>The Class Map.</h1>
 *
 * @author ptorc
 * @version 1.0
 */
public class Map {

    /** The id. */
    private final int id;

    /** The map. */
    private String map;

    /**
     * Instantiates a new map.
     *
     * @param id
     *            the id
     * @param map
     *            the map
     */
    public Map(final int id, final String map) {
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
     * Sets the map.
     *
     * @param map
     *            the new map
     */
    public void setName(final String map) {
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

package model;

/**
 * <h1>The Class Example.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Map {

    /** The id. */
    private final int id;

    /** The name. */
    private String map;

    /**
     * Instantiates a new example.
     *
     * @param id
     *            the id
     * @param map
     *            the name
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
     * Gets the name.
     *
     * @return the name
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
    public void setName(final String name) {
        this.map = name;
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

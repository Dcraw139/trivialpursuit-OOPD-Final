package Model;

/**
 * the factory that creates instances of objects
 */
public class Factory {
    /**
     * returns a default person
     *
     * @return a default person
     */
    public static Person getPersonInstance() {
        return new PersonImpl();
    }

    /**
     * returns an overloaded person
     *
     * @param n the name you'd like to set
     * @return the overloaded person
     */
    public static Person getPersonInstance(String n) {
        return new PersonImpl(n);
    }

    /**
     * returns a default tile
     *
     * @return a default tile
     */
    public static Tile getTileInstance() {
        return new TileImpl();
    }

    /**
     * returns an overloaded tile
     *
     * @param c color
     * @param t tiletype
     * @return the overloaded tile
     */
    public static Tile getTileInstance(Color c, TileType t) {
        return new TileImpl(c, t);
    }

    /**
     * returns a default player
     *
     * @return the default player
     */
    public static Player getPlayerInstance() {
        return new PlayerImpl();
    }

    /**
     * returns an overloaded player
     *
     * @param n the players name
     * @return the overloaded player
     */
    public static Player getPlayerInstance(String n) {
        return new PlayerImpl(n);
    }

}

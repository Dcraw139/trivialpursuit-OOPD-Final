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
    public static Person getInstance() {
        return new PersonImpl();
    }

    /**
     * returns an overloaded person
     *
     * @param n the name you'd like to set
     * @return the overloaded person
     */
    public static Person getInstance(String n) {
        return new PersonImpl(n);
    }
}

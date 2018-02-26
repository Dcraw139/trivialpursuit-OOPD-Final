package Model;

import java.io.Serializable;

/**
 * represents a person
 */
public class PersonImpl implements Person, Comparable, Serializable {

    private String name;

    /**
     * default constructor
     */
    public PersonImpl() {
    }

    /**
     * overloaded constructor
     *
     * @param n a person's name
     */
    public PersonImpl(String n) {
        this.setName(n);
    }

    /**
     * gets name
     *
     * @return a person's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * sets name as long as it isn't empty
     *
     * @param name the name you want to set
     */
    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("You must enter something for a name");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public boolean equals(Object o) {
        PersonImpl obj = (PersonImpl) o;
        return this.getName().equals(obj.getName());
    }

    @Override
    public int compareTo(Object o) {
        PersonImpl obj = (PersonImpl) o;
        return this.compareTo(obj);
    }
}

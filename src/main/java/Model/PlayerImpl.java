package Model;

import java.io.Serializable;
import java.util.Random;

/**
 * represents a player
 */
public class PlayerImpl extends PersonImpl implements Player, Comparable, Serializable {

    private String name;
    private int initRoll;
    private int posX;
    private int posY;
    private static final int MIN_POS = 0;
    private static final int PLAYER_X = 7;
    private static final int PLAYER_Y = 8;

    /**
     * default constructor
     */
    PlayerImpl() {
        super();
        Random random = new Random();
        this.initRoll = random.nextInt(6) + 1;
    }

    /**
     * overloaded constructor
     *
     * @param n name
     */
    PlayerImpl(String n) {
        super(n);
        Random random = new Random();
        this.initRoll = random.nextInt(6) + 1;
        this.setPosX(PLAYER_X);
        this.setPosY(PLAYER_Y);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    /**
     * gets the  initial roll
     *
     * @return the initial roll
     */
    public int getInitRoll() {
        return initRoll;
    }

    /**
     * gets the x position
     *
     * @return the x position
     */
    public int getPosX() {
        return posX;
    }

    /**
     * sets the X position
     *
     * @param posX the position you'd like to set
     */
    public void setPosX(int posX) {
        if (posX < MIN_POS) {
            throw new IllegalArgumentException("Sorry the x position must be positive");
        }
        this.posX = posX;
    }

    /**
     * gets the y position
     *
     * @return the y position
     */
    public int getPosY() {
        return posY;
    }

    /**
     * sets the y position
     *
     * @param posY the position you'd like to set
     */
    public void setPosY(int posY) {
        if (posY < MIN_POS) {
            throw new IllegalArgumentException("Sorry the y position must be positive");
        }
        this.posY = posY;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.getInitRoll() + ", " + this.getPosX() + ", " + this.getPosY();
    }

    @Override
    public int compareTo(Object o) {
        PlayerImpl obj = (PlayerImpl) o;
        return super.compareTo(o);
    }
}

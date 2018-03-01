package Model;

import javafx.scene.control.Alert;
import javafx.scene.layout.Pane;

import java.io.Serializable;

/**
 * represents a tile on a board
 */
public class TileImpl implements Tile, Comparable, Serializable {

    private Pane show;
    private Color color;
    private TileType type;

    /**
     * default constructor
     */
    public TileImpl() {
        Pane x = new Pane();
        this.setShow(x);
        x.setOnMouseClicked(event -> alertHold());
    }

    private void alertHold() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(this.getType().toString());
        alert.show();
    }

    /**
     * overloaded constructor
     *
     * @param c        color
     * @param tileType tile type
     */
    public TileImpl(Color c, TileType tileType) {
        this.setType(tileType);
        this.setColor(c);
        Pane x = new Pane();
        this.setShow(x);
        x.setOnMouseClicked(event -> alertHold());
        colorChange();
    }

    /**
     * takes a tile's current color value and changes the value to that
     */
    private void colorChange() {
        Color holder = this.getColor();
        switch (holder) {
            case BLUE:
                this.getShow().setStyle("-fx-background-color: blue");
                break;
            case PINK:
                this.getShow().setStyle("-fx-background-color: hotpink");
                break;
            case GREEN:
                this.getShow().setStyle("-fx-background-color: green");
                break;
            case ORANGE:
                this.getShow().setStyle("-fx-background-color: darkorange");
                break;
            case PURPLE:
                this.getShow().setStyle("-fx-background-color: purple");
                break;
            case YELLOW:
                this.getShow().setStyle("-fx-background-color: yellow");
                break;
            case CENTER:
                this.getShow().setStyle("-fx-background-color: black");
                break;
            case FREEROLL:
                this.getShow().setStyle("-fx-background-color: darkgray");
                break;
            default:
        }
    }

    /**
     * gets pane attached to tile
     *
     * @return pane
     */
    public Pane getShow() {
        return show;
    }

    /**
     * sets the pane attached to tile
     *
     * @param show
     */
    public void setShow(Pane show) {
        if (show.equals(null)) {
            throw new IllegalArgumentException("You must add a pane for it to select");
        }
        this.show = show;
    }

    /**
     * gets the color of the tile
     *
     * @return the color of the tile
     */
    public Color getColor() {
        return color;
    }

    /**
     * sets the color of the tile
     *
     * @param color the color you'd like to set
     */
    public void setColor(Color color) {
        if (color.equals(null)) {
            throw new IllegalArgumentException("You must add a color there");
        }
        this.color = color;
    }

    /**
     * returns the type of tile
     *
     * @return the type
     */
    public TileType getType() {
        return type;
    }

    /**
     * sets the type of tile
     *
     * @param type the type you'd like to set
     */
    public void setType(TileType type) {
        if (type.equals(null)) {
            throw new IllegalArgumentException("You must put a tile type to set");
        }
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        TileImpl object = (TileImpl) obj;
        return object.getShow().equals(this.getShow()) && object.getColor().equals(this.getColor()) && object.getType().equals(this.getType());
    }

    @Override
    public String toString() {
        return this.getType().toString() + ", " + this.getColor().toString() + ", " + this.getShow().toString();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

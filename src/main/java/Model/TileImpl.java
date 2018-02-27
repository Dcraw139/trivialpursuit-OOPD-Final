package Model;

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
                this.getShow().setStyle("-fx-background-color: rebeccapurple");
                break;
            case YELLOW:
                this.getShow().setStyle("-fx-background-color: yellow");
        }
    }

    public Pane getShow() {
        return show;
    }

    public void setShow(Pane show) {
        this.show = show;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TileType getType() {
        return type;
    }

    public void setType(TileType type) {
        this.type = type;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

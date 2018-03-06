package Model;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
        Stage questionBox = new Stage();
        Scene scene;
        VBox questionarie = new VBox();
        Text question = new Text("This is a question for a " + this.getType().toString() + " space");
        question.setFill(javafx.scene.paint.Color.WHITE);
        Text firstAns = new Text("Answer 1");
        firstAns.setFill(javafx.scene.paint.Color.WHITE);
        Text secondAns = new Text("Answer 2");
        secondAns.setFill(javafx.scene.paint.Color.WHITE);
        Text thirdAns = new Text("Answer 3");
        thirdAns.setFill(javafx.scene.paint.Color.WHITE);
        Text fourthAns = new Text("Answer 4");
        fourthAns.setFill(javafx.scene.paint.Color.WHITE);

        if (this.getRealColor().equals("yellow")) {
            question.setFill(javafx.scene.paint.Color.BLACK);
            firstAns.setFill(javafx.scene.paint.Color.BLACK);
            secondAns.setFill(javafx.scene.paint.Color.BLACK);
            thirdAns.setFill(javafx.scene.paint.Color.BLACK);
            fourthAns.setFill(javafx.scene.paint.Color.BLACK);
        }

        Button answer1 = new Button("1");
        Button answer2 = new Button("2");
        Button answer3 = new Button("3");
        Button answer4 = new Button("4");
        answer1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage closer = (Stage) answer1.getScene().getWindow();
                closer.close();
            }
        });
        answer2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage closer = (Stage) answer2.getScene().getWindow();
                closer.close();
            }
        });
        answer3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage closer = (Stage) answer3.getScene().getWindow();
                closer.close();
            }
        });
        answer4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage closer = (Stage) answer4.getScene().getWindow();
                closer.close();
            }
        });

        HBox textAnswers = new HBox();
        textAnswers.alignmentProperty().setValue(Pos.CENTER);
        textAnswers.getChildren().addAll(firstAns, secondAns, thirdAns, fourthAns);

        HBox answers = new HBox();
        answers.getChildren().addAll(answer1, answer2, answer3, answer4);
        answers.alignmentProperty().setValue(Pos.CENTER);
        questionarie.getChildren().addAll(question, textAnswers, answers);
        questionarie.alignmentProperty().setValue(Pos.CENTER);

        questionBox.setWidth(300);
        questionBox.setHeight(300);

        questionarie.setStyle("-fx-background-color: " + this.getRealColor());

        scene = new Scene(questionarie);
        questionBox.setScene(scene);
        questionBox.setTitle("Question");
        questionBox.initStyle(StageStyle.UNDECORATED);
        questionBox.show();

        questionBox.setOnCloseRequest(Event::consume);
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

    private String getRealColor() {
        Color holder = this.getColor();
        if (holder == Color.BLUE) {
            return "blue";
        } else if (holder == Color.PINK) {
            return "hotpink";
        } else if (holder == Color.GREEN) {
            return "green";
        } else if (holder == Color.ORANGE) {
            return "darkorange";
        } else if (holder == Color.PURPLE) {
            return "purple";
        } else if (holder == Color.YELLOW) {
            return "yellow";
        } else if (holder == Color.CENTER) {
            return "black";
        } else if (holder == Color.FREEROLL) {
            return "darkgray";
        } else {
            return null;
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

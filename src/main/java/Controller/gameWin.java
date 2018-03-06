package Controller;

import Model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

/**
 * the controller class for the game window
 */
public class gameWin implements Initializable {

    private int currentRoll;

    @FXML
    public BorderPane gameBoarder;
    @FXML
    public GridPane boardArea;
    @FXML
    public Button rollDice;
    @FXML
    public TableView<Player> playerScores;
    @FXML
    public TableColumn playerRow;
    @FXML
    public TableColumn wedgeRow;
    @FXML
    public Label infoText;
    @FXML
    public VBox diceRollHolder;
    @FXML
    public Pane diceRollImage;

    /**
     * gets current roll
     *
     * @return the current roll
     */
    public int getCurrentRoll() {
        return currentRoll;
    }

    /**
     * default constructor
     */
    public gameWin() {
    }

    /**
     * rolls the dice, changes onscreen picture
     *
     * @param mouseEvent clicked
     */
    public void diceRoller(MouseEvent mouseEvent) {
        Random random = new Random();
        int dRoll = random.nextInt(6) + 1;
        switch (dRoll) {
            case 1:
                diceRollImage.setStyle("-fx-background-image: url('pictures/diceone.png')");
                infoText.setText("You rolled one!");
                currentRoll = 1;
                break;
            case 2:
                diceRollImage.setStyle("-fx-background-image: url('pictures/dicetwo.png')");
                infoText.setText("You rolled two!");
                currentRoll = 2;
                break;
            case 3:
                diceRollImage.setStyle("-fx-background-image: url('pictures/dicethree.png')");
                infoText.setText("You rolled three!");
                currentRoll = 3;
                break;
            case 4:
                diceRollImage.setStyle("-fx-background-image: url('pictures/dicefour.png')");
                infoText.setText("You rolled four!");
                currentRoll = 4;
                break;
            case 5:
                diceRollImage.setStyle("-fx-background-image: url('pictures/dicefour.png')");
                infoText.setText("You rolled five!");
                currentRoll = 5;
                break;
            case 6:
                diceRollImage.setStyle("-fx-background-image: url('pictures/dicesix.png')");
                infoText.setText("You rolled six!");
                currentRoll = 6;
                break;
            default:
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        TileImpl onetwo = new TileImpl(Color.BLUE, TileType.WEDGE);
        boardArea.add(onetwo.getShow(), 0, 1);
        TileImpl center = new TileImpl(Color.CENTER, TileType.CENTER);
        boardArea.add(center.getShow(), 6, 7);
        boardArea.setColumnSpan(center.getShow(), 3);
        boardArea.setRowSpan(center.getShow(), 3);
        TileImpl twotwo = new TileImpl(Color.PINK, TileType.NORMAL);
        boardArea.add(twotwo.getShow(), 1, 2);
        TileImpl threethree = new TileImpl(Color.GREEN, TileType.NORMAL);
        boardArea.add(threethree.getShow(), 2, 3);
        TileImpl fourfour = new TileImpl(Color.YELLOW, TileType.SHORTCUT);
        boardArea.add(fourfour.getShow(), 3, 4);
        TileImpl fivefive = new TileImpl(Color.ORANGE, TileType.NORMAL);
        boardArea.add(fivefive.getShow(), 4, 5);
        TileImpl sixsix = new TileImpl(Color.PURPLE, TileType.NORMAL);
        boardArea.add(sixsix.getShow(), 5, 6);
        TileImpl twoone = new TileImpl(Color.PINK, TileType.NORMAL);
        boardArea.add(twoone.getShow(), 1, 1);
        TileImpl threeone = new TileImpl(Color.FREEROLL, TileType.FREE);
        boardArea.add(threeone.getShow(), 2, 1);
        TileImpl fourone = new TileImpl(Color.YELLOW, TileType.NORMAL);
        boardArea.add(fourone.getShow(), 3, 1);
        TileImpl fiveone = new TileImpl(Color.PURPLE, TileType.NORMAL);
        boardArea.add(fiveone.getShow(), 4, 1);
        TileImpl sixone = new TileImpl(Color.FREEROLL, TileType.FREE);
        boardArea.add(sixone.getShow(), 5, 1);
        TileImpl sevenone = new TileImpl(Color.GREEN, TileType.NORMAL);
        boardArea.add(sevenone.getShow(), 6, 1);
        TileImpl eightone = new TileImpl(Color.ORANGE, TileType.WEDGE);
        boardArea.add(eightone.getShow(), 7, 1);
        TileImpl eighttwo = new TileImpl(Color.GREEN, TileType.NORMAL);
        boardArea.add(eighttwo.getShow(), 7, 2);
        TileImpl eightthree = new TileImpl(Color.PURPLE, TileType.NORMAL);
        boardArea.add(eightthree.getShow(), 7, 3);
        TileImpl eightfour = new TileImpl(Color.PINK, TileType.SHORTCUT);
        boardArea.add(eightfour.getShow(), 7, 4);
        TileImpl eightfive = new TileImpl(Color.YELLOW, TileType.NORMAL);
        boardArea.add(eightfive.getShow(), 7, 5);
        TileImpl eightsix = new TileImpl(Color.BLUE, TileType.NORMAL);
        boardArea.add(eightsix.getShow(), 7, 6);
        TileImpl nineone = new TileImpl(Color.GREEN, TileType.NORMAL);
        boardArea.add(nineone.getShow(), 8, 1);
        TileImpl tenone = new TileImpl(Color.FREEROLL, TileType.FREE);
        boardArea.add(tenone.getShow(), 9, 1);
        TileImpl elevenone = new TileImpl(Color.PINK, TileType.NORMAL);
        boardArea.add(elevenone.getShow(), 10, 1);
        TileImpl twelveone = new TileImpl(Color.BLUE, TileType.NORMAL);
        boardArea.add(twelveone.getShow(), 11, 1);
        TileImpl thirteenone = new TileImpl(Color.FREEROLL, TileType.FREE);
        boardArea.add(thirteenone.getShow(), 12, 1);
        TileImpl fourteenone = new TileImpl(Color.PURPLE, TileType.NORMAL);
        boardArea.add(fourteenone.getShow(), 13, 1);
        TileImpl fifteenone = new TileImpl(Color.YELLOW, TileType.WEDGE);
        boardArea.add(fifteenone.getShow(), 14, 1);
        TileImpl fourteentwo = new TileImpl(Color.PURPLE, TileType.NORMAL);
        boardArea.add(fourteentwo.getShow(), 13, 2);
        TileImpl thirteenthree = new TileImpl(Color.BLUE, TileType.NORMAL);
        boardArea.add(thirteenthree.getShow(), 12, 3);
        TileImpl twelvefour = new TileImpl(Color.GREEN, TileType.SHORTCUT);
        boardArea.add(twelvefour.getShow(), 11, 4);
        TileImpl elevenfive = new TileImpl(Color.PINK, TileType.NORMAL);
        boardArea.add(elevenfive.getShow(), 10, 5);
        TileImpl tensix = new TileImpl(Color.ORANGE, TileType.NORMAL);
        boardArea.add(tensix.getShow(), 9, 6);
        //Try to make these span two rows right
        TileImpl fifteentwo = new TileImpl(Color.PURPLE, TileType.NORMAL);
        boardArea.setRowSpan(fifteentwo.getShow(), 2);
        boardArea.add(fifteentwo.getShow(), 14, 2);
        TileImpl fifteenthree = new TileImpl(Color.FREEROLL, TileType.FREE);
        boardArea.setRowSpan(fifteenthree.getShow(), 2);
        boardArea.add(fifteenthree.getShow(), 14, 4);
        TileImpl fifteenfour = new TileImpl(Color.GREEN, TileType.NORMAL);
        boardArea.setRowSpan(fifteenfour.getShow(), 2);
        boardArea.add(fifteenfour.getShow(), 14, 6);
        TileImpl fifteenfive = new TileImpl(Color.ORANGE, TileType.NORMAL);
        boardArea.setRowSpan(fifteenfive.getShow(), 2);
        boardArea.add(fifteenfive.getShow(), 14, 8);
        TileImpl fifteensix = new TileImpl(Color.FREEROLL, TileType.FREE);
        boardArea.setRowSpan(fifteenfive.getShow(), 2);
        boardArea.add(fifteensix.getShow(), 14, 10);
        TileImpl fifteenseven = new TileImpl(Color.BLUE, TileType.NORMAL);
        boardArea.setRowSpan(fifteensix.getShow(), 2);
        boardArea.setRowSpan(fifteenseven.getShow(), 3);
        boardArea.add(fifteenseven.getShow(), 14, 12);
        TileImpl fifteeneight = new TileImpl(Color.PINK, TileType.WEDGE);
        boardArea.add(fifteeneight.getShow(), 14, 15);
        TileImpl fourteenseven = new TileImpl(Color.BLUE, TileType.NORMAL);
        boardArea.add(fourteenseven.getShow(), 13, 14);
        TileImpl thirteensix = new TileImpl(Color.ORANGE, TileType.NORMAL);
        boardArea.add(thirteensix.getShow(), 12, 13);
        TileImpl twelvefive = new TileImpl(Color.PURPLE, TileType.SHORTCUT);
        boardArea.add(twelvefive.getShow(), 11, 12);
        TileImpl elevenfour = new TileImpl(Color.GREEN, TileType.NORMAL);
        boardArea.add(elevenfour.getShow(), 10, 11);
        TileImpl tenthree = new TileImpl(Color.YELLOW, TileType.NORMAL);
        boardArea.add(tenthree.getShow(), 9, 10);
        TileImpl fourteeneight = new TileImpl(Color.BLUE, TileType.NORMAL);
        boardArea.add(fourteeneight.getShow(), 13, 15);
        TileImpl thirteeneight = new TileImpl(Color.FREEROLL, TileType.FREE);
        boardArea.add(thirteeneight.getShow(), 12, 15);
        TileImpl twelveeight = new TileImpl(Color.PURPLE, TileType.NORMAL);
        boardArea.add(twelveeight.getShow(), 11, 15);
        TileImpl eleveneight = new TileImpl(Color.YELLOW, TileType.NORMAL);
        boardArea.add(eleveneight.getShow(), 10, 15);
        TileImpl teneight = new TileImpl(Color.FREEROLL, TileType.FREE);
        boardArea.add(teneight.getShow(), 9, 15);
        TileImpl nineeight = new TileImpl(Color.ORANGE, TileType.NORMAL);
        boardArea.add(nineeight.getShow(), 8, 15);
        TileImpl eighteight = new TileImpl(Color.GREEN, TileType.WEDGE);
        boardArea.add(eighteight.getShow(), 7, 15);
        TileImpl eightseven = new TileImpl(Color.ORANGE, TileType.NORMAL);
        boardArea.add(eightseven.getShow(), 7, 14);
        TileImpl ninesix = new TileImpl(Color.YELLOW, TileType.NORMAL);
        boardArea.add(ninesix.getShow(), 7, 13);
        TileImpl ninefive = new TileImpl(Color.BLUE, TileType.SHORTCUT);
        boardArea.add(ninefive.getShow(), 7, 12);
        TileImpl ninefour = new TileImpl(Color.PURPLE, TileType.NORMAL);
        boardArea.add(ninefour.getShow(), 7, 11);
        TileImpl ninethree = new TileImpl(Color.PINK, TileType.NORMAL);
        boardArea.add(ninethree.getShow(), 7, 10);
        TileImpl seveneight = new TileImpl(Color.ORANGE, TileType.NORMAL);
        boardArea.add(seveneight.getShow(), 6, 15);
        TileImpl sixeight = new TileImpl(Color.FREEROLL, TileType.FREE);
        boardArea.add(sixeight.getShow(), 5, 15);
        TileImpl fiveeight = new TileImpl(Color.BLUE, TileType.NORMAL);
        boardArea.add(fiveeight.getShow(), 4, 15);
        TileImpl foureight = new TileImpl(Color.PINK, TileType.NORMAL);
        boardArea.add(foureight.getShow(), 3, 15);
        TileImpl threeeight = new TileImpl(Color.FREEROLL, TileType.FREE);
        boardArea.add(threeeight.getShow(), 2, 15);
        TileImpl twoeight = new TileImpl(Color.YELLOW, TileType.NORMAL);
        boardArea.add(twoeight.getShow(), 1, 15);
        TileImpl oneeight = new TileImpl(Color.PURPLE, TileType.WEDGE);
        boardArea.add(oneeight.getShow(), 0, 15);
        TileImpl twoseven = new TileImpl(Color.YELLOW, TileType.NORMAL);
        boardArea.add(twoseven.getShow(), 1, 14);
        TileImpl threesix = new TileImpl(Color.PINK, TileType.NORMAL);
        boardArea.add(threesix.getShow(), 2, 13);
        TileImpl fourseven = new TileImpl(Color.ORANGE, TileType.SHORTCUT);
        boardArea.add(fourseven.getShow(), 3, 12);
        TileImpl fivesix = new TileImpl(Color.BLUE, TileType.NORMAL);
        boardArea.add(fivesix.getShow(), 4, 11);
        TileImpl threeseven = new TileImpl(Color.GREEN, TileType.NORMAL);
        boardArea.add(threeseven.getShow(), 5, 10);
        //Try to make these span two rows left
        TileImpl onethree = new TileImpl(Color.PINK, TileType.NORMAL);
        boardArea.add(onethree.getShow(), 0, 2);
        boardArea.setRowSpan(onethree.getShow(), 2);
        TileImpl oneone = new TileImpl(Color.FREEROLL, TileType.FREE);
        boardArea.add(oneone.getShow(), 0, 4);
        boardArea.setRowSpan(oneone.getShow(), 2);
        TileImpl zerotwo = new TileImpl(Color.GREEN, TileType.NORMAL);
        boardArea.add(zerotwo.getShow(), 0, 6);
        boardArea.setRowSpan(zerotwo.getShow(), 2);
        TileImpl zerothree = new TileImpl(Color.ORANGE, TileType.NORMAL);
        boardArea.setRowSpan(zerothree.getShow(), 2);
        boardArea.add(zerothree.getShow(), 0, 8);
        TileImpl zerofour = new TileImpl(Color.FREEROLL, TileType.FREE);
        boardArea.setRowSpan(zerofour.getShow(), 2);
        boardArea.add(zerofour.getShow(), 0, 10);
        TileImpl zerofive = new TileImpl(Color.YELLOW, TileType.NORMAL);
        boardArea.setRowSpan(zerofive.getShow(), 3);
        boardArea.add(zerofive.getShow(), 0, 12);

        playerScores.setEditable(true);

        playerWindow Players = new playerWindow();

        ArrayList<Player> tester = new ArrayList<Player>();

        tester.add(new PlayerImpl("Jim"));
        tester.add(new PlayerImpl("Joe"));

        setHello(tester);

        ObservableList<Player> data =
                FXCollections.observableArrayList(
                        getHello()
                );

        playerRow.setCellValueFactory(
                new PropertyValueFactory<Player, String>("name")
        );
        wedgeRow.setCellValueFactory(
                new PropertyValueFactory<Player, Integer>("wedgeScore")
        );
        playerScores.setItems(data);

    }

    public ArrayList<Player> hello;

    /**
     * gets hello
     *
     * @return hello
     */
    public ArrayList<Player> getHello() {
        return hello;
    }

    /**
     * sets hello
     *
     * @param hello what you want to set
     */
    public void setHello(ArrayList<Player> hello) {
        this.hello = hello;
    }
}

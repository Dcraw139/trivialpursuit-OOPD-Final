package Controller;

import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * the controller class for the player window
 */
public class playerWindow {

    public VBox addPlayerScene;
    public TextField playerNamer;
    public Button addPlayer;
    public HBox deckOptions;
    public ChoiceBox deckOne;
    public ChoiceBox deckTwo;
    public Button startButton;
    public Button exitbutton;

    public void addPlayers(MouseEvent mouseEvent) {
    }

    /**
     * checks weather or not the user truly wants to exit
     *
     * @param mouseEvent mouse clicked
     */
    public void exitConfirm(MouseEvent mouseEvent) {
        ButtonType yes = new ButtonType("Yes");
        ButtonType no = new ButtonType("No");
        Alert a = new Alert(Alert.AlertType.NONE, "Do you want to exit?", yes, no);
        a.setTitle("Exit?");
        a.setResizable(true);
        a.showAndWait().ifPresent(response -> {
            if (response == yes) {
                Stage stage = (Stage) exitbutton.getScene().getWindow();
                stage.close();
            } else if (response == no) {

            }
        });
    }

    /**
     * checks to see if all params are met and if so continues
     *
     * @param mouseEvent mouse clicked
     */
    public void checkForContinue(MouseEvent mouseEvent) {
    }
}

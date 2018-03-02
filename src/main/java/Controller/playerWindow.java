package Controller;

import Model.Factory;
import Model.Player;
import Model.PlayerImpl;
import Model.PlayerList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

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
    public PlayerList players;

    /**
     * adds players to an array list when add player is hit
     *
     * @param mouseEvent click
     */
    public void addPlayers(MouseEvent mouseEvent) {
        String pn;
        pn = playerNamer.getText();
//        PlayerImpl newPlayer =  new PlayerImpl(pn);
        Player newPlayer = Factory.getPlayerInstance(pn);
        players.add(newPlayer);
        playerNamer.setText("");
        System.out.println(players.toString());
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
        try {
            Stage stageC = (Stage) startButton.getScene().getWindow();
            stageC.close();
            FXMLLoader loader = new FXMLLoader(ClassLoader.getSystemResource("fxml/gameWindow.fxml"));
            Parent root1 = loader.load();
            gameWin gWin = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("Trivial Pursuit");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

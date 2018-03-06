package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * the controller class for the startup window
 */
public class startupWindow {

    public VBox startupWindow;
    public Pane starterImage;
    public Button startButton;
    public Button closeButton;

    /**
     * moves to next scene when clicked
     *
     * @param mouseEvent mouse clicked
     * @throws IOException throws
     */
    public void playerWindowMove(MouseEvent mouseEvent) throws IOException {
        try {
            Stage stageC = (Stage) startButton.getScene().getWindow();
            stageC.close();
            FXMLLoader loader = new FXMLLoader(ClassLoader.getSystemResource("fxml/playerMenu.fxml"));
            Parent root1 = loader.load();
            playerWindow pWin = loader.getController();
            Stage stage = new Stage();
            stage.setTitle("Trivial Pursuit");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
                Stage stage = (Stage) closeButton.getScene().getWindow();
                stage.close();
            } else if (response == no) {

            }
        });
    }
}

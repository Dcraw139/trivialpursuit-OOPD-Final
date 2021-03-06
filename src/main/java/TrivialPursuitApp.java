import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Runs the application of Trivial Pursuit
 */
public class TrivialPursuitApp extends Application {

    public static void main(String[] args) {
        Application.launch(TrivialPursuitApp.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(ClassLoader.getSystemResource("fxml/startup.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Trivial Pursuit");
        stage.show();

    }
}

package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane(); // Simple Pane for absolute positioning

        // Create a Button and set its position
        Button button = new Button("Click Me");
        button.setLayoutX(100); // X-coordinate
        button.setLayoutY(50);  // Y-coordinate

        pane.getChildren().add(button);

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Absolute Position Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
package application;

import java.io.*;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class Main extends Application {

    private static Scene scene;
    private static BorderPane borderPane1;
    private static VBox borderPane1_centerContainer;

    @Override
    public void start(Stage stage) throws IOException {
    	
    	borderPane1 = new BorderPane();
    	borderPane1.setTop(loadFXML("MainPageScene/TopNavigationBar/","TopNavigationBarFXML"));
    	
    	
    	
    	borderPane1_centerContainer = new VBox();
    	
    	borderPane1_centerContainer.getChildren().add(loadFXML("MainPageScene/FirstPosterContainer/","FirstPosterContainerFXML"));
    	
    	borderPane1.setCenter(borderPane1_centerContainer);
    	
    	
    	borderPane1.getStylesheets().add(getClass().getResource("MainPageScene/TopNavigationBar/TopNavigationBar1.css").toExternalForm());
    	borderPane1.getStylesheets().add(getClass().getResource("MainPageScene/FirstPosterContainer/FirstPosterContainer.css").toExternalForm());
    	
        scene = new Scene(borderPane1, 1280, 960);
        stage.setScene(scene);
        
        stage.setTitle("RQT Real Estate");
        stage.show();
    }

    static void setRoot() throws IOException {
        scene.setRoot(borderPane1);
    }

    private static Parent loadFXML(String path, String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(path+fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}




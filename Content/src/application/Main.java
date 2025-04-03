package application;

import java.io.*;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class Main extends Application {

    private static Scene scene;
    private static BorderPane borderPane1;

    @Override
    public void start(Stage stage) throws IOException {
    	
    	borderPane1 = new BorderPane();
    	borderPane1.setTop(loadFXML("TopNavigationBarFXML"));
    	borderPane1.getStylesheets().add(getClass().getResource("MainPageScene/TopNavigationBar/topNavigationBar1.css").toExternalForm());
    	
        scene = new Scene(borderPane1, 1280, 960);
        stage.setScene(scene);
        
        stage.setTitle("RQT Real Estate");
        stage.show();
    }

    //static void setRoot(String fxml) throws IOException {
    static void setRoot() throws IOException {
      //scene.setRoot(loadFXML(fxml));
        scene.setRoot(borderPane1);
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainPageScene/TopNavigationBar/"+fxml + ".fxml"));
        return fxmlLoader.load();
    }
    

    public static void main(String[] args) {
        launch();
    }

}




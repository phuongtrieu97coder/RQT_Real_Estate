package application;

import java.io.*;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

import javafx.scene.control.ScrollPane;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class Main extends Application {

    private static Scene scene;
    private static BorderPane borderPane1;
    private static ScrollPane borderPane1_centerContainer_ScrollPane_Control;
    private static VBox borderPane1_centerContainer_ScrollPane_Control_VBox;

    @Override
    public void start(Stage stage) throws IOException {
    	
    	borderPane1 = new BorderPane();
    	borderPane1.setTop(loadFXML("MainPageScene/TopNavigationBar/","TopNavigationBarFXML"));
    	
    	
    	borderPane1_centerContainer_ScrollPane_Control_VBox = new VBox();
    	
    	borderPane1_centerContainer_ScrollPane_Control_VBox.getChildren().add(loadFXML("MainPageScene/FirstPosterContainer/","FirstPosterContainerFXML"));
    	//borderPane1_centerContainer_ScrollPane_Control_VBox.getChildren().add(loadFXML("MainPageScene/TrendingHomeContainer/","TrendingHomeContainerFXML"));
    	//borderPane1_centerContainer_ScrollPane_Control_VBox.getChildren().add(loadFXML("MainPageScene/CalculateBudgetContainer/","CalculateBudgetContainerFXML"));
    	//borderPane1_centerContainer_ScrollPane_Control_VBox.getChildren().add(loadFXML("MainPageScene/AgentsContainer/","AgentsContainerFXML"));
    	//borderPane1_centerContainer_ScrollPane_Control_VBox.getChildren().add(loadFXML("MainPageScene/BottomNavigationContainer/","BottomNavigationContainerFXML"));
    	

    	borderPane1_centerContainer_ScrollPane_Control = new ScrollPane(borderPane1_centerContainer_ScrollPane_Control_VBox);
    	
    	// Set preferred size for the ScrollPane
    	borderPane1_centerContainer_ScrollPane_Control.setPrefWidth(800);
    	borderPane1_centerContainer_ScrollPane_Control.setPrefHeight(600);
    	
    	// Configure scroll behavior
    	borderPane1_centerContainer_ScrollPane_Control.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
    	
    	borderPane1.setCenter(borderPane1_centerContainer_ScrollPane_Control);
    	
    	
    	borderPane1.getStylesheets().add(getClass().getResource("MainPageScene/TopNavigationBar/TopNavigationBar1.css").toExternalForm());
    	borderPane1.getStylesheets().add(getClass().getResource("MainPageScene/FirstPosterContainer/FirstPosterContainer.css").toExternalForm());
    	//borderPane1.getStylesheets().add(getClass().getResource("MainPageScene/TrendingHomeContainer/TrendingHomeContainer.css").toExternalForm());
    	//borderPane1.getStylesheets().add(getClass().getResource("MainPageScene/CalculateBudgetContainer/CalculateBudgetContainer.css").toExternalForm());
    	//borderPane1.getStylesheets().add(getClass().getResource("MainPageScene/AgentsContainer/AgentsContainer.css").toExternalForm());
    	//borderPane1.getStylesheets().add(getClass().getResource("MainPageScene/BottomNavigationContainer/BottomNavigationContainer.css").toExternalForm());
    	
        scene = new Scene(borderPane1);
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




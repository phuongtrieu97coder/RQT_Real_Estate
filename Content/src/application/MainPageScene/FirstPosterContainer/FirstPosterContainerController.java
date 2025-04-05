package application.MainPageScene.FirstPosterContainer;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.TextArea;

import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;



public class FirstPosterContainerController{
	
	@FXML
	ImageView firstPosterContainer_firstPosterImage;
	
	@FXML
	Rectangle firstPosterContainer_firstPosterImage_grayscaleBox;
	
	@FXML
	VBox firstPosterContainer_VBox1;
	
	@FXML
	Label firstPosterContainer_VBox1_Label1;
	
	@FXML
	Label firstPosterContainer_VBox1_Label2;
	
	@FXML
	VBox firstPosterContainer_VBox1_Chatbot_VBox_Container;
	
	@FXML
	TextArea firstPosterContainer_VBox1_Chatbot_VBox_Container_TextArea1;
	
	@FXML
	BorderPane firstPosterContainer_VBox1_Chatbot_VBox_Container_BorderPane1_Buttons_Container;
	
	@FXML
	ButtonBar firstPosterContainer_VBox1_Chatbot_VBox_Container_BorderPane1_Buttons_Container_ButtonBar1;
	
	@FXML
	ImageView firstPosterContainer_VBox1_Chatbot_VBox_Container_BorderPane1_Buttons_Container_ButtonBar1_ImageView1;
	
	@FXML
	ButtonBar firstPosterContainer_VBox1_Chatbot_VBox_Container_BorderPane1_Buttons_Container_ButtonBar2;
	
	@FXML
	ImageView firstPosterContainer_VBox1_Chatbot_VBox_Container_BorderPane1_Buttons_Container_ButtonBar1_ImageView2;
	
	
	
	
	@FXML
	public void sendMessageFunc() throws IOException { 
		System.out.println("Welcome");
	}
}
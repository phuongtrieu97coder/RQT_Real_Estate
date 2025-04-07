package application.MainPageScene.TopNavigationBar;

import java.io.IOException;
import javafx.fxml.FXML;

import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import javafx.scene.image.ImageView;

import javafx.geometry.Insets;


import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;

import javafx.util.Duration;

public class TopNavigationBarController{
	@FXML
	VBox topNavigationBar1_VBox1;
	
	@FXML
	BorderPane topNavigationBar1_BorderPane1;
	
	@FXML
	HBox topNavigationBar1_BorderPane1_Left_HBox1;
	
	@FXML
	Button topNavigationBar1_BorderPane1_Left_HBox1_MenuButt;
	
	
	@FXML
	ImageView topNavigationBar1_BorderPane1_Center_Logo;
	
	
	@FXML
	HBox topNavigationBar1_BorderPane1_Right_HBox1;
	
	
	@FXML
	Button topNavigationBar1_BorderPane1_Right_HBox1_SignIn_Butt;
	
	@FXML
	Button topNavigationBar1_BorderPane1_Right_HBox1_Help_Butt;
	
	
	@FXML
	ScrollPane topNavigationBar1_ScrollPane1;
	
	@FXML
	HBox topNavigationBar1_HBox1_Dropdown_Menu_Tab;
	
	@FXML
	HBox topNavigationBar1_HBox1_Dropdown_Menu_Tab_HBox1;
	
	@FXML
	Button topNavigationBar1_HBox1_Dropdown_Menu_Tab_HBox1_Buy_Butt;
	
	@FXML
	Button topNavigationBar1_HBox1_Dropdown_Menu_Tab_HBox1_Rent_Butt;
	
	@FXML
	Button topNavigationBar1_HBox1_Dropdown_Menu_Tab_HBox1_Sell_Butt;
	
	@FXML
	Button topNavigationBar1_HBox1_Dropdown_Menu_Tab_HBox1_Loan_Butt;
	
	@FXML
	Button topNavigationBar1_HBox1_Dropdown_Menu_Tab_HBox1_Agents_Butt;
	
	@FXML
	Button topNavigationBar1_HBox1_Dropdown_Menu_Tab_HBox1_News_Butt;
	
	
	@FXML
	HBox topNavigationBar1_HBox1_Dropdown_Menu_Tab_HBox2;
	
	@FXML
	Button topNavigationBar1_HBox1_Dropdown_Menu_Tab_HBox2_Close_Butt;
	
	public void initialize() {
		topNavigationBar1_VBox1.getChildren().remove(topNavigationBar1_ScrollPane1);
		
	}
	
	@FXML
	public void show_topNavigationBar1_HBox1_Dropdown_Menu_Tab() throws IOException{
		
		
		if(!topNavigationBar1_VBox1.getChildren().contains(topNavigationBar1_ScrollPane1)) {
			// If the tab is not already in the VBox, add it to the VBox
			topNavigationBar1_VBox1.getChildren().add(topNavigationBar1_ScrollPane1);
			
	    	// Configure scroll behavior
			topNavigationBar1_ScrollPane1.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
	    	
			//animation effect that slide the tab down by expanding the height of the ScrollPane
			Timeline timeline = new Timeline();
		    KeyValue keyValue = new KeyValue(topNavigationBar1_ScrollPane1.prefHeightProperty(), 80);
		    KeyFrame keyFrame = new KeyFrame(Duration.seconds(0.4), keyValue);
		    timeline.getKeyFrames().add(keyFrame);
		    timeline.play();
			 
			
		}else {
			//animation effect that slide the tab up by shrinking the height of the ScrollPane
			
			Timeline timeline2 = new Timeline();
		    KeyValue keyValue2 = new KeyValue(topNavigationBar1_ScrollPane1.prefHeightProperty(), 0);
		    KeyFrame keyFrame2 = new KeyFrame(Duration.seconds(0.4), keyValue2);
		    timeline2.getKeyFrames().add(keyFrame2);
		    timeline2.play();
			
		    // Remove the tab from the VBox after the animation is finished
		    timeline2.setOnFinished(event -> {
		    	topNavigationBar1_VBox1.getChildren().remove(topNavigationBar1_ScrollPane1);
		    });
		    
			
		}
		
		
	}
	@FXML
	public void close_topNavigationBar1_HBox1_Dropdown_Menu_Tab() throws IOException{

		//animation effect that slide the tab up by shrinking the height of the ScrollPane
		Timeline timeline = new Timeline();
	    KeyValue keyValue = new KeyValue(topNavigationBar1_ScrollPane1.prefHeightProperty(), 0);
	    KeyFrame keyFrame = new KeyFrame(Duration.seconds(0.4), keyValue);
	    timeline.getKeyFrames().add(keyFrame);
	    timeline.play();
		
	    // Remove the tab from the VBox after the animation is finished
	    timeline.setOnFinished(event -> {
	    	topNavigationBar1_VBox1.getChildren().remove(topNavigationBar1_ScrollPane1);
	    });
	    
	}
	
	
}
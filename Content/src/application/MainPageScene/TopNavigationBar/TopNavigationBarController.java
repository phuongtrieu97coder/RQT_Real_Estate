package application.MainPageScene.TopNavigationBar;

import java.io.IOException;
import javafx.fxml.FXML;

import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.scene.control.Label;
import javafx.scene.control.Button;

import javafx.scene.image.ImageView;

import javafx.geometry.Insets;

import javafx.animation.TranslateTransition;

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
		topNavigationBar1_HBox1_Dropdown_Menu_Tab.setTranslateY(
	    -topNavigationBar1_HBox1_Dropdown_Menu_Tab.getHeight());
		
		topNavigationBar1_HBox1_Dropdown_Menu_Tab.setVisible(false);
		topNavigationBar1_VBox1.getChildren().remove(topNavigationBar1_HBox1_Dropdown_Menu_Tab);
	}
	
	@FXML
	public void show_topNavigationBar1_HBox1_Dropdown_Menu_Tab() throws IOException{
		TranslateTransition slideTransition = 
	    new TranslateTransition(Duration.seconds(2), topNavigationBar1_HBox1_Dropdown_Menu_Tab);
		
		
		if(topNavigationBar1_HBox1_Dropdown_Menu_Tab.getTranslateY() == 
		 -topNavigationBar1_HBox1_Dropdown_Menu_Tab.getHeight()) {
			
			// If the tab is currently up, slide it down, bring it to front, and expand the height of StackPane
			
			topNavigationBar1_VBox1.getChildren().add(topNavigationBar1_HBox1_Dropdown_Menu_Tab);
			
			slideTransition.setDelay(Duration.seconds(0.2));
		    
			topNavigationBar1_HBox1_Dropdown_Menu_Tab.setVisible(true);	
			
			slideTransition.setToY(0); // Target position (visible area)
			slideTransition.play();
			
			
		}else {
			
			// If the tab is currently down, slide it up, bring it to back, and shrink the height of the StackPane
			
            slideTransition.setToY(-topNavigationBar1_HBox1_Dropdown_Menu_Tab.getHeight());
            
            slideTransition.setOnFinished(event -> {
            	
            	topNavigationBar1_HBox1_Dropdown_Menu_Tab.setVisible(false);
            	topNavigationBar1_VBox1.getChildren().remove(topNavigationBar1_HBox1_Dropdown_Menu_Tab);
            });
			
			slideTransition.play();
			
		}
	}
	@FXML
	public void close_topNavigationBar1_HBox1_Dropdown_Menu_Tab() throws IOException{
		TranslateTransition slideTransition2 = new TranslateTransition(Duration.seconds(2), topNavigationBar1_HBox1_Dropdown_Menu_Tab);
		
		
		if(topNavigationBar1_HBox1_Dropdown_Menu_Tab.getTranslateY() == 0) {
			// If the tab is currently down, slide it up, bring it to back, and shrink the height of the StackPane

			
			slideTransition2.setToY(-topNavigationBar1_HBox1_Dropdown_Menu_Tab.getHeight());

			 slideTransition2.setOnFinished(event -> {
	            	
            	topNavigationBar1_HBox1_Dropdown_Menu_Tab.setVisible(false);
            	topNavigationBar1_VBox1.getChildren().remove(topNavigationBar1_HBox1_Dropdown_Menu_Tab);
			 });
			slideTransition2.play();
			
		}
	}
	
	
}
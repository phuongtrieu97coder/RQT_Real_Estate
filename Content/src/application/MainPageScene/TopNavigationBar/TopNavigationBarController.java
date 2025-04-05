package application.MainPageScene.TopNavigationBar;

import java.io.IOException;
import javafx.fxml.FXML;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.scene.control.Label;
import javafx.scene.control.Button;

import javafx.scene.image.ImageView;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;


public class TopNavigationBarController{
	@FXML
	AnchorPane topNavigationBar_anchorPane1;
	
	
	@FXML
	BorderPane topNavigationBar1;
	
	@FXML
	HBox topNav1_leftContainer;
	
	@FXML
	ComboBox<String> topNav1_leftContainer_dropdownMenu;
	
	@FXML
	ImageView topNav1_MiddleLogo;
	
	
	@FXML
	BorderPane topNav1_rightContainer;
	
	@FXML
	MenuBar topNav1_rightContainer_menuBar;
	
	@FXML
	Menu topNav1_rightContainer_menuBar_signIn_butt;
	
	@FXML
	Menu topNav1_rightContainer_menuBar_help_butt;
	
	
	
	
}
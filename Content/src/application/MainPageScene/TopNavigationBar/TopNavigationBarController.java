package application.MainPageScene.TopNavigationBar;

import java.io.IOException;
import javafx.fxml.FXML;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.scene.control.Label;
import javafx.scene.control.Button;

import javafx.scene.image.ImageView;
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
	Button topNav1_leftContainer_dropdownMenu_butt;
	
	@FXML
	HBox topNav1_leftContainer_dropdownMenu_butt_HBox;
	
	@FXML
	ImageView topNav1_MiddleLogo;
	
	
	@FXML
	BorderPane topNav1_rightContainer;
	
	@FXML
	HBox topNav1_rightContainer_HBox;
	
	@FXML
	Button topNav1_rightContainer_HBox_SignIn_Butt;
	
	@FXML
	Button topNav1_rightContainer_HBox_Help_Butt;
	
	
	@FXML
	HBox topNavigationBar_anchorPane1_dropdownMenuTab;
	
	@FXML
	HBox topNavigationBar_anchorPane1_dropdownMenuTab_HBox1;
	
	@FXML
	Button topNavigationBar_anchorPane1_dropdownMenuTab_HBox1_Buy_Butt;
	
	@FXML
	Button topNavigationBar_anchorPane1_dropdownMenuTab_HBox1_Rent_Butt;
	
	@FXML
	Button topNavigationBar_anchorPane1_dropdownMenuTab_HBox1_Sell_Butt;
	
	@FXML
	Button topNavigationBar_anchorPane1_dropdownMenuTab_HBox1_Loan_Butt;
	
	@FXML
	Button topNavigationBar_anchorPane1_dropdownMenuTab_HBox1_Agents_Butt;
	
	@FXML
	Button topNavigationBar_anchorPane1_dropdownMenuTab_HBox1_News_Butt;
	
	@FXML
	Button topNavigationBar_anchorPane1_dropdownMenuTab_Close_Butt;
	
	public void initialize() {
		topNavigationBar_anchorPane1_dropdownMenuTab.setVisible(false);
		topNavigationBar_anchorPane1.getChildren().remove(topNavigationBar_anchorPane1_dropdownMenuTab);
	}
	
	@FXML
	public void show_topNavigationBar_anchorPane1_dropdownMenuTab() throws IOException{
		if(topNavigationBar_anchorPane1_dropdownMenuTab.isVisible()==false) {
			topNavigationBar_anchorPane1.getChildren().add(topNavigationBar_anchorPane1_dropdownMenuTab);
			topNavigationBar_anchorPane1_dropdownMenuTab.setVisible(true);
		}else {
			topNavigationBar_anchorPane1.getChildren().remove(topNavigationBar_anchorPane1_dropdownMenuTab);
			topNavigationBar_anchorPane1_dropdownMenuTab.setVisible(false);
		}
	}
	@FXML
	public void close_topNavigationBar_anchorPane1_dropdownMenuTab() throws IOException{
		if(topNavigationBar_anchorPane1_dropdownMenuTab.isVisible()==true) {
			topNavigationBar_anchorPane1.getChildren().remove(topNavigationBar_anchorPane1_dropdownMenuTab);
			topNavigationBar_anchorPane1_dropdownMenuTab.setVisible(false);
		}
	}
	
	
}
module RQT_Real_Estate {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens application.MainPageScene.TopNavigationBar to javafx.graphics, javafx.fxml;
	opens application.MainPageScene.FirstPosterContainer to javafx.graphics, javafx.fxml;

}

package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    Label myLabel1;
    
    @FXML
    TextField myTextField1;
    
    @FXML
    TextField myTextField2;
    
    @FXML
    Label myLabel2;
    
    @FXML
    Label myLabel3;
    
    
    @FXML
    Button add_button;
    

    
    @FXML
    private void addButtonActivate() throws IOException {
        System.out.println("Add Button was pressed!");
        String text1 = myTextField1.getText();
        String text2 = myTextField2.getText();
        
        float number1 = Float.parseFloat(text1);
        float number2 = Float.parseFloat(text2);
        
        myLabel3.setText(Float.toString(number1+number2));
    }
    
}

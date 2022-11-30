package application;

import java.security.PublicKey;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Transferfound extends Frontcode{
	
	
@FXML
private TextField t8;
@FXML
private TextField t9;
@FXML

public void transfer(ActionEvent event) throws Exception{
	Random rand= new Random();
	
	String accountno=t8.getText();
	String ammount=t9.getText();
	long ac=Integer.parseInt(accountno);
	long am=Integer.parseInt(ammount);
	
	if (balance>=am) {
       balance=balance-am;
    
        
       Stage primaryStage = new Stage();
   	Parent root=FXMLLoader.load(getClass().getResource("Withdrawsucessful.fxml"));
   	Scene scene = new Scene(root,400,400);
   	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
   	primaryStage.setScene(scene);
   	primaryStage.show();

	}
	

}
}

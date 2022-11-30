package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Entrydeposit extends Frontcode{
	@FXML
	private TextField t6;
	@FXML
	private TextField t7;
	
	
	@FXML
	public void deposit(ActionEvent event)throws Exception {
		long accountno=1010209236;
		String acno=t6.getText();
		String depo=t7.getText();
		int n1=Integer.parseInt(acno);
		int n2=Integer.parseInt(depo);
		if (accountno==n1) {
			balance=balance+n2;
			Stage primaryStage = new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("Withdrawsucessful.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			System.out.println(balance);
			
		}
		else {
			t6.setText("Enter Valid Account Number");
		}
		
		
	}




}

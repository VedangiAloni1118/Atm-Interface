package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Entrywithdraw extends Frontcode{
	
@FXML
private TextField t5;
@FXML
public void withdrawtransaction(ActionEvent event) throws Exception {
	String amt=t5.getText();
	long amt1=Integer.parseInt(amt);
	if (amt1<balance) {
		balance=balance-amt1;
		Stage primaryStage = new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("Withdrawsucessful.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}else {
		Stage primaryStage = new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("Transactionfail.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	System.out.println(balance);
	
	
}
}

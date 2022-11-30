package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Withdraw {
//@FXML
//private TextField t5;
@FXML
public void withdrawbutton(ActionEvent event)throws Exception {
	Stage primaryStage = new Stage();
	Parent root=FXMLLoader.load(getClass().getResource("Withdraw.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
}
@FXML
public void depositbutton(ActionEvent event)throws Exception {
	Stage primaryStage = new Stage();
	Parent root=FXMLLoader.load(getClass().getResource("Deposit.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
}
public void quitbutton(ActionEvent event)throws Exception {
	javafx.application.Platform.exit();
}
@FXML
public void transferbutton(ActionEvent event)throws Exception {
	Stage primaryStage = new Stage();
	Parent root=FXMLLoader.load(getClass().getResource("Transfer.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
}
@FXML
public void transcation(ActionEvent event)throws Exception{
	Stage primaryStage = new Stage();
	Parent root=FXMLLoader.load(getClass().getResource("Transcactionhistory.fxml"));
	Scene scene = new Scene(root,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
}
}

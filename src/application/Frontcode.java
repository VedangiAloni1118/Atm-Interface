package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Frontcode {
	long balance=100000;
@FXML
private TextField  t1;
@FXML
private TextField t2;
@FXML
public void usercheck(ActionEvent event)throws Exception {
	int id=11072003;
	int pin=1118;
	String id1=t1.getText();
	String atm=t2.getText();
	int num=Integer.parseInt(atm);
	int id2=Integer.parseInt(id1);
	if (id2==id && pin==num) {
		Stage primaryStage = new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("Secondpage.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	else if (id2!=id ) {
	t1.setText("Enter valid id");
		
		
	}
	else if (id2==id &&pin!=num) {
		t2.setText("Enter valid pin");
	}
}
}

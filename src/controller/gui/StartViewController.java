package controller.gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartViewController {
	
	@FXML
	Button start;

	private Stage stage;
	private Scene scene;
	
	@FXML
	public void switchToBoard(ActionEvent event) throws IOException {
		Parent root =FXMLLoader.load(getClass().getResource("../../view/gui/MainView.fxml"));
		scene = new Scene(root);
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
}

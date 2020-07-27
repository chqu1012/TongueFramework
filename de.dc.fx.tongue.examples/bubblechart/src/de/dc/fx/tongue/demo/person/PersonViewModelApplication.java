package de.dc.fx.tongue.demo.person;

import de.dc.fx.tongue.demo.person.controller.*;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PersonViewModelApplication extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		PersonViewController controller = new PersonViewController();
		primaryStage.setScene(new Scene((Parent) controller.getRoot(), 1200, 800));
		primaryStage.show();
	}
}


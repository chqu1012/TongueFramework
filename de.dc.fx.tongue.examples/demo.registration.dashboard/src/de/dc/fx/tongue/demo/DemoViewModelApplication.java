package de.dc.fx.tongue.demo;

import de.dc.fx.tongue.demo.controller.*;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DemoViewModelApplication extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		DemoViewController controller = new DemoViewController();
		primaryStage.setScene(new Scene((Parent) controller.getRoot(), 1200, 800));
		primaryStage.show();
	}
}


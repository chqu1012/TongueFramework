package de.dc.fx.tongue.demo;

import de.dc.fx.tongue.demo.controller.*;
import de.dc.fx.tongue.demo.model.Registration;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
		ObservableList<Registration> input = FXCollections.observableArrayList();
		createRegistration(input, "Jackson", "Peter", 8);
		createRegistration(input, "Stark", "Tony", 12);
		createRegistration(input, "Wayne", "Bruce", 7);
		createRegistration(input, "Allen", "Bary", 21);
		createRegistration(input, "X.", "Oliver", 34);
		controller.setMasterDataRegistration(input );
		primaryStage.setScene(new Scene((Parent) controller.getRoot(), 1200, 800));
		primaryStage.show();
	}

	private void createRegistration(ObservableList<Registration> input, String familyname, String name,int stars) {
		String emailName = name+"."+familyname;
		Registration r = new Registration();
		r.setEmail(emailName+"@mail.com");
		r.setFamilyname(familyname);
		r.setName(name);
		r.setStars(stars);
		r.setUsername(emailName);
		input.add(r);
	}
}


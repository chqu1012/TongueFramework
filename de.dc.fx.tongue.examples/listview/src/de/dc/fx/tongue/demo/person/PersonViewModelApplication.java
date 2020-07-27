package de.dc.fx.tongue.demo.person;

import de.dc.fx.tongue.demo.person.controller.PersonViewController;
import de.dc.fx.tongue.demo.person.model.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
		ObservableList<Person> input = FXCollections.observableArrayList();
		createPerson(input, "Peter", "Parker");
		createPerson(input, "Tony", "Stark");
		createPerson(input, "Steve", "Rogers");
		createPerson(input, "Bruce", "Wayne");
		createPerson(input, "Clark", "Kent");
		controller.setMasterDataPerson(input);
		primaryStage.setScene(new Scene((Parent) controller.getRoot(), 1200, 800));
		primaryStage.show();
	}

	private void createPerson(ObservableList<Person> input, String name, String familyname) {
		Person p = new Person();
		p.setName(name);
		p.setFamilyname(familyname);
		input.add(p);
	}
}


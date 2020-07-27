package de.dc.fx.tongue.demo.person.controller;
	
import de.dc.fx.tongue.demo.person.model.*;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
public class PersonTableViewController extends BasePersonTableViewController{

	public void onTextNameKeyReleased(KeyEvent e) {
		renderer.validateBy(PersonTableViewControllerIDs.validatorNameNotEmpty);
	}
	public void onTextFamilynameKeyReleased(KeyEvent e) {
		renderer.validateBy(PersonTableViewControllerIDs.validatorFamilynameNotEmpty);
	}
	public void onTextIsManKeyReleased(KeyEvent e) {
		renderer.validateBy(PersonTableViewControllerIDs.validatorIsManNotEmpty);
	}
	public void onTextAgeKeyReleased(KeyEvent e) {
		renderer.validateBy(PersonTableViewControllerIDs.validatorAgeNotEmpty);
		renderer.validateBy(PersonTableViewControllerIDs.validatorAgeIsNumeric);
	}
	
	public void onButtonCreateAction(ActionEvent e) {}
}

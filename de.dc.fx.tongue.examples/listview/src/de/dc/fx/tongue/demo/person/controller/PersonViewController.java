package de.dc.fx.tongue.demo.person.controller;
	
import de.dc.fx.tongue.demo.person.model.Person;
import de.dc.fx.tongue.demo.person.model.PersonViewControllerIDs;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyEvent;
public class PersonViewController extends BasePersonViewController{

	public void onTextNameKeyReleased(KeyEvent e) {
		renderer.validateBy(PersonViewControllerIDs.validatorNameNotEmpty);
	}
	public void onTextFamilynameKeyReleased(KeyEvent e) {
		renderer.validateBy(PersonViewControllerIDs.validatorFamilynameNotEmpty);
	}
	public void onTextIsManKeyReleased(KeyEvent e) {
		renderer.validateBy(PersonViewControllerIDs.validatorIsManNotEmpty);
	}
	public void onTextAgeKeyReleased(KeyEvent e) {
		renderer.validateBy(PersonViewControllerIDs.validatorAgeNotEmpty);
		renderer.validateBy(PersonViewControllerIDs.validatorAgeIsNumeric);
	}
	
	public void onButtonCreateAction(ActionEvent e) {
		boolean validate = renderer.validate();
		if (validate) {
			Person person = new Person();
			person.setAge(Integer.parseInt(model.getTextFieldAge()));
			person.setFamilyname(model.getTextFieldFamilyname());
			person.setIsMan(Boolean.parseBoolean(model.getTextFieldIsMan()));
			person.setName(model.getTextFieldName());
			model.masterDataPerson().add(person);
		}
	}
}

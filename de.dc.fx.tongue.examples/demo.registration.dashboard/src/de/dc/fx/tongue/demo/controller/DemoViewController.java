package de.dc.fx.tongue.demo.controller;
	
import de.dc.fx.tongue.demo.model.*;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
public class DemoViewController extends BaseDemoViewController{

	public void onTextUsernameKeyReleased(KeyEvent e) {
		renderer.validateBy(DemoViewControllerIDs.validatorUsernameNotEmpty);
	}
	public void onTextNameKeyReleased(KeyEvent e) {
		renderer.validateBy(DemoViewControllerIDs.validatorNameNotEmpty);
	}
	public void onTextFamilynameKeyReleased(KeyEvent e) {
		renderer.validateBy(DemoViewControllerIDs.validatorFamilynameNotEmpty);
	}
	public void onTextEmailKeyReleased(KeyEvent e) {
		renderer.validateBy(DemoViewControllerIDs.validatorEmailNotEmpty);
	}
	public void onTextStarsKeyReleased(KeyEvent e) {
		renderer.validateBy(DemoViewControllerIDs.validatorStarsNotEmpty);
	}
	
	public void onButtonCreateRegistrationAction(ActionEvent e) {
		boolean validate = renderer.validate();
		if (validate) {
			Registration reg = new Registration();
			reg.setEmail(model.getTextFieldEmail());
			reg.setFamilyname(model.getTextFieldFamilyname());
			reg.setName(model.getTextFieldName());
			reg.setStars(Integer.parseInt(model.getTextFieldStars()));
			reg.setUsername(model.getTextFieldUsername());
			model.masterDataRegistration().add(reg);
		}
	}
	
}

package de.dc.fx.tongue.demo.person.controller;

import de.dc.fx.tongue.demo.person.binding.*;
import de.dc.fx.tongue.demo.person.model.*;
import de.dc.fx.tonque.core.*;
import de.dc.fx.tonque.core.control.*;
import de.dc.fx.tonque.core.control.tableview.filter.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.collections.*;
import javafx.beans.binding.*;
import javafx.beans.property.*;

public abstract class BasePersonViewController extends BaseTongueController<PersonViewModelBinding>{

	protected BorderPane paneRoot; 
	protected ListView listViewPerson; 
	protected Form formTableViewPerson; 
	protected FormTextField textFieldName; 
	protected FormTextField textFieldFamilyname; 
	protected FormTextField textFieldIsMan; 
	protected FormTextField textFieldAge; 
	protected Button buttonCreate; 
	protected FormComboBox comboBoxGender; 
	
	public BasePersonViewController() {
		super(new PersonViewModelBinding(), new TongueControlRenderer(), "./resources/de/dc/fx/tongue/demo/person/PersonView.tongue");
	}
	
	@Override
	public void initializeDatabinding() {
		paneRoot = renderer.findById(PersonViewControllerIDs.paneRoot);
		listViewPerson = renderer.findById(PersonViewControllerIDs.listViewPerson);
		formTableViewPerson = renderer.findById(PersonViewControllerIDs.formTableViewPerson);
		textFieldName = renderer.findById(PersonViewControllerIDs.textFieldName);
		textFieldFamilyname = renderer.findById(PersonViewControllerIDs.textFieldFamilyname);
		textFieldIsMan = renderer.findById(PersonViewControllerIDs.textFieldIsMan);
		textFieldAge = renderer.findById(PersonViewControllerIDs.textFieldAge);
		buttonCreate = renderer.findById(PersonViewControllerIDs.buttonCreate);
		comboBoxGender = renderer.findById(PersonViewControllerIDs.comboBoxGender);
		
			BooleanBinding buttonCreateDisableBinding = textFieldAge.textProperty().isEmpty().or(textFieldFamilyname.textProperty().isEmpty()).or(textFieldIsMan.textProperty().isEmpty()).or(textFieldName.textProperty().isEmpty());
			model.buttonCreateDisableProperty().bind(buttonCreateDisableBinding);
			buttonCreate.disableProperty().bind(buttonCreateDisableBinding);
			BooleanBinding buttonCreateVisibleBinding = textFieldAge.textProperty().isNotEmpty().and(textFieldFamilyname.textProperty().isNotEmpty());
			model.buttonCreateVisibleProperty().bind(buttonCreateVisibleBinding);
			buttonCreate.visibleProperty().bind(buttonCreateVisibleBinding);
		
		model.textFieldNameProperty().bindBidirectional(textFieldName.textProperty());
		model.textFieldFamilynameProperty().bindBidirectional(textFieldFamilyname.textProperty());
		model.textFieldIsManProperty().bindBidirectional(textFieldIsMan.textProperty());
		model.textFieldAgeProperty().bindBidirectional(textFieldAge.textProperty());
		model.buttonCreateProperty().bindBidirectional(buttonCreate.textProperty());
		model.selectedPerson().bind(listViewPerson.getSelectionModel().selectedItemProperty());
		listViewPerson.setItems(model.sortedPerson());
	}
	
	public void setMasterDataPerson(ObservableList<Person> input) { model.masterDataPerson().setAll(input); }
}

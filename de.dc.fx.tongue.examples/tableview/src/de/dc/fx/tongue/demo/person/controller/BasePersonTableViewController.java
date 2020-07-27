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

public abstract class BasePersonTableViewController extends BaseTongueController<PersonTableViewModelBinding>{

	protected BorderPane paneRoot; 
	protected TableView<Person> tableViewPerson; 
	protected Form formTableViewPerson; 
	protected FormTextField textFieldName; 
	protected FormTextField textFieldFamilyname; 
	protected FormTextField textFieldIsMan; 
	protected FormTextField textFieldAge; 
	protected Button buttonCreate; 
	protected Form comboBoxGender; 
	
	public BasePersonTableViewController() {
		super(new PersonTableViewModelBinding(), new TongueControlRenderer(), "./resources/de/dc/fx/tongue/demo/person/PersonTableView.tongue");
	}
	
	@Override
	public void initializeDatabinding() {
		paneRoot = renderer.findById(PersonTableViewControllerIDs.paneRoot);
		tableViewPerson = renderer.findById(PersonTableViewControllerIDs.tableViewPerson);
		formTableViewPerson = renderer.findById(PersonTableViewControllerIDs.formTableViewPerson);
		textFieldName = renderer.findById(PersonTableViewControllerIDs.textFieldName);
		textFieldFamilyname = renderer.findById(PersonTableViewControllerIDs.textFieldFamilyname);
		textFieldIsMan = renderer.findById(PersonTableViewControllerIDs.textFieldIsMan);
		textFieldAge = renderer.findById(PersonTableViewControllerIDs.textFieldAge);
		buttonCreate = renderer.findById(PersonTableViewControllerIDs.buttonCreate);
		comboBoxGender = renderer.findById(PersonTableViewControllerIDs.comboBoxGender);
		
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
		model.sortedPerson().comparatorProperty().bind(tableViewPerson.comparatorProperty());
		model.selectedPerson().bind(tableViewPerson.getSelectionModel().selectedItemProperty());
		FXTableViewSupport<Person> tableViewPersonSupport = FXTableViewSupport.forTableView(tableViewPerson).apply();
		Bindings.bindContent(tableViewPersonSupport.getMasterData(), model.masterDataPerson());
	}
	
	public void setMasterDataPerson(ObservableList<Person> input) { model.masterDataPerson().setAll(input); }
}

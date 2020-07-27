package de.dc.fx.tongue.demo.controller;

import de.dc.fx.tongue.demo.binding.*;
import de.dc.fx.tongue.demo.model.*;
import de.dc.fx.tonque.core.*;
import de.dc.fx.tonque.core.control.*;
import de.dc.fx.tonque.core.control.tableview.filter.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.chart.*;
import javafx.scene.layout.*;
import javafx.collections.*;
import javafx.beans.binding.*;
import javafx.beans.property.*;

public abstract class BaseDemoViewController extends BaseTongueController<DemoViewModelBinding>{

	protected BorderPane paneRoot; 
	protected SplitPane splitPaneCenter; 
	protected AreaChart chartArea; 
	protected TableView<Registration> tableViewRegistration; 
	protected Form formTableViewRegistration; 
	protected FormTextField textFieldUsername; 
	protected FormTextField textFieldName; 
	protected FormTextField textFieldFamilyname; 
	protected FormTextField textFieldEmail; 
	protected FormTextField textFieldStars; 
	protected Button buttonCreateRegistration; 
	
	public BaseDemoViewController() {
		super(new DemoViewModelBinding(), new TongueControlRenderer(), "./resources/de/dc/fx/tongue/demo/demo.tongue");
	}
	
	@Override
	public void initializeDatabinding() {
		paneRoot = renderer.findById(DemoViewControllerIDs.paneRoot);
		splitPaneCenter = renderer.findById(DemoViewControllerIDs.splitPaneCenter);
		chartArea = renderer.findById(DemoViewControllerIDs.chartArea);
		tableViewRegistration = renderer.findById(DemoViewControllerIDs.tableViewRegistration);
		formTableViewRegistration = renderer.findById(DemoViewControllerIDs.formTableViewRegistration);
		textFieldUsername = renderer.findById(DemoViewControllerIDs.textFieldUsername);
		textFieldName = renderer.findById(DemoViewControllerIDs.textFieldName);
		textFieldFamilyname = renderer.findById(DemoViewControllerIDs.textFieldFamilyname);
		textFieldEmail = renderer.findById(DemoViewControllerIDs.textFieldEmail);
		textFieldStars = renderer.findById(DemoViewControllerIDs.textFieldStars);
		buttonCreateRegistration = renderer.findById(DemoViewControllerIDs.buttonCreateRegistration);
		
			BooleanBinding buttonCreateRegistrationDisableBinding = textFieldEmail.textProperty().isEmpty().or(textFieldFamilyname.textProperty().isEmpty()).or(textFieldName.textProperty().isEmpty()).or(textFieldStars.textProperty().isEmpty()).or(textFieldUsername.textProperty().isEmpty());
			model.buttonCreateRegistrationDisableProperty().bind(buttonCreateRegistrationDisableBinding);
			buttonCreateRegistration.disableProperty().bind(buttonCreateRegistrationDisableBinding);
		
		model.textFieldUsernameProperty().bindBidirectional(textFieldUsername.textProperty());
		model.textFieldNameProperty().bindBidirectional(textFieldName.textProperty());
		model.textFieldFamilynameProperty().bindBidirectional(textFieldFamilyname.textProperty());
		model.textFieldEmailProperty().bindBidirectional(textFieldEmail.textProperty());
		model.textFieldStarsProperty().bindBidirectional(textFieldStars.textProperty());
		model.buttonCreateRegistrationProperty().bindBidirectional(buttonCreateRegistration.textProperty());
		model.selectedRegistration().bind(tableViewRegistration.getSelectionModel().selectedItemProperty());
		model.sortedRegistration().comparatorProperty().bind(tableViewRegistration.comparatorProperty());
		FXTableViewSupport<Registration> tableViewRegistrationSupport = FXTableViewSupport.forTableView(tableViewRegistration).apply();
		Bindings.bindContent(tableViewRegistrationSupport.getMasterData(), model.masterDataRegistration());
	}
	
	public void setMasterDataRegistration(ObservableList<Registration> input) { model.masterDataRegistration().setAll(input); }
}

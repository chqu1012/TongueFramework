package de.dc.fx.tongue.demo.person.controller;

import de.dc.fx.tongue.demo.person.binding.*;
import de.dc.fx.tongue.demo.person.model.*;
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

public abstract class BasePersonViewController extends BaseTongueController<PersonViewModelBinding>{

	protected BorderPane paneRoot; 
	protected VBox hboxChart; 
	protected TextField textCountOfSeries; 
	protected Button buttonAddSeries; 
	protected Button buttonClearChart; 
	protected AreaChart chartArea; 
	
	public BasePersonViewController() {
		super(new PersonViewModelBinding(), new TongueControlRenderer(), "./resources/de/dc/fx/tongue/demo/person/PersonView.tongue");
	}
	
	@Override
	public void initializeDatabinding() {
		paneRoot = renderer.findById(PersonViewControllerIDs.paneRoot);
		hboxChart = renderer.findById(PersonViewControllerIDs.hboxChart);
		textCountOfSeries = renderer.findById(PersonViewControllerIDs.textCountOfSeries);
		buttonAddSeries = renderer.findById(PersonViewControllerIDs.buttonAddSeries);
		buttonClearChart = renderer.findById(PersonViewControllerIDs.buttonClearChart);
		chartArea = renderer.findById(PersonViewControllerIDs.chartArea);
		
		
		model.textCountOfSeriesProperty().bindBidirectional(textCountOfSeries.textProperty());
		model.buttonAddSeriesProperty().bindBidirectional(buttonAddSeries.textProperty());
		model.buttonClearChartProperty().bindBidirectional(buttonClearChart.textProperty());
	}
	
}

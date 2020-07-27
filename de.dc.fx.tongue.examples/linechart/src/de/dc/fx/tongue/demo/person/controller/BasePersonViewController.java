package de.dc.fx.tongue.demo.person.controller;

import de.dc.fx.tongue.demo.person.binding.PersonViewModelBinding;
import de.dc.fx.tongue.demo.person.model.PersonViewControllerIDs;
import de.dc.fx.tonque.core.BaseTongueController;
import de.dc.fx.tonque.core.TongueControlRenderer;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public abstract class BasePersonViewController extends BaseTongueController<PersonViewModelBinding>{

	protected BorderPane paneRoot; 
	protected VBox hboxChart; 
	protected TextField textCountOfSeries; 
	protected Button buttonAddSeries; 
	protected Button buttonClearChart; 
	protected LineChart chartLine; 
	
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
		chartLine = renderer.findById(PersonViewControllerIDs.chartLine);
		
		
		model.textCountOfSeriesProperty().bindBidirectional(textCountOfSeries.textProperty());
		model.buttonAddSeriesProperty().bindBidirectional(buttonAddSeries.textProperty());
		model.buttonClearChartProperty().bindBidirectional(buttonClearChart.textProperty());
	}
	
}

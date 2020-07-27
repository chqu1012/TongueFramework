package de.dc.fx.tongue.demo.person.binding;

import de.dc.fx.tongue.demo.person.model.*;
import de.dc.fx.tonque.core.ITongueBindingModel;
import javafx.beans.property.*;
import javafx.collections.*;
import javafx.collections.transformation.*;

public class BasePersonViewModelBinding implements ITongueBindingModel{

	private StringProperty textCountOfSeriesProperty = new SimpleStringProperty();
	public void setTextCountOfSeries(String textCountOfSeries){ this.textCountOfSeriesProperty.set(textCountOfSeries);}
	public String getTextCountOfSeries(){ return this.textCountOfSeriesProperty.get();}
	public StringProperty textCountOfSeriesProperty() { return this.textCountOfSeriesProperty;}
	private StringProperty buttonAddSeriesProperty = new SimpleStringProperty();
	public void setButtonAddSeries(String buttonAddSeries){ this.buttonAddSeriesProperty.set(buttonAddSeries);}
	public String getButtonAddSeries(){ return this.buttonAddSeriesProperty.get();}
	public StringProperty buttonAddSeriesProperty() { return this.buttonAddSeriesProperty;}
	private StringProperty buttonClearChartProperty = new SimpleStringProperty();
	public void setButtonClearChart(String buttonClearChart){ this.buttonClearChartProperty.set(buttonClearChart);}
	public String getButtonClearChart(){ return this.buttonClearChartProperty.get();}
	public StringProperty buttonClearChartProperty() { return this.buttonClearChartProperty;}

	
}	

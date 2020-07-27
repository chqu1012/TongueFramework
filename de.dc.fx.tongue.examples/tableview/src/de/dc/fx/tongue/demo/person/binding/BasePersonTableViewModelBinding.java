package de.dc.fx.tongue.demo.person.binding;

import de.dc.fx.tongue.demo.person.model.*;
import de.dc.fx.tonque.core.ITongueBindingModel;
import javafx.beans.property.*;
import javafx.collections.*;
import javafx.collections.transformation.*;

public class BasePersonTableViewModelBinding implements ITongueBindingModel{

	private StringProperty textFieldNameProperty = new SimpleStringProperty();
	public void setTextFieldName(String textFieldName){ this.textFieldNameProperty.set(textFieldName);}
	public String getTextFieldName(){ return this.textFieldNameProperty.get();}
	public StringProperty textFieldNameProperty() { return this.textFieldNameProperty;}
	private StringProperty textFieldFamilynameProperty = new SimpleStringProperty();
	public void setTextFieldFamilyname(String textFieldFamilyname){ this.textFieldFamilynameProperty.set(textFieldFamilyname);}
	public String getTextFieldFamilyname(){ return this.textFieldFamilynameProperty.get();}
	public StringProperty textFieldFamilynameProperty() { return this.textFieldFamilynameProperty;}
	private StringProperty textFieldIsManProperty = new SimpleStringProperty();
	public void setTextFieldIsMan(String textFieldIsMan){ this.textFieldIsManProperty.set(textFieldIsMan);}
	public String getTextFieldIsMan(){ return this.textFieldIsManProperty.get();}
	public StringProperty textFieldIsManProperty() { return this.textFieldIsManProperty;}
	private StringProperty textFieldAgeProperty = new SimpleStringProperty();
	public void setTextFieldAge(String textFieldAge){ this.textFieldAgeProperty.set(textFieldAge);}
	public String getTextFieldAge(){ return this.textFieldAgeProperty.get();}
	public StringProperty textFieldAgeProperty() { return this.textFieldAgeProperty;}
	private StringProperty buttonCreateProperty = new SimpleStringProperty();
	public void setButtonCreate(String buttonCreate){ this.buttonCreateProperty.set(buttonCreate);}
	public String getButtonCreate(){ return this.buttonCreateProperty.get();}
	public StringProperty buttonCreateProperty() { return this.buttonCreateProperty;}

		private BooleanProperty buttonCreateDisableProperty = new SimpleBooleanProperty();
		public void setButtonCreateDisableProperty(Boolean buttonCreate){ this.buttonCreateDisableProperty.set(buttonCreate);}
		public Boolean getButtonCreateDisableProperty(){ return this.buttonCreateDisableProperty.get();}
		public BooleanProperty buttonCreateDisableProperty() { return this.buttonCreateDisableProperty;}
		private BooleanProperty buttonCreateVisibleProperty = new SimpleBooleanProperty();
		public void setButtonCreateVisibleProperty(Boolean buttonCreate){ this.buttonCreateVisibleProperty.set(buttonCreate);}
		public Boolean getButtonCreateVisibleProperty(){ return this.buttonCreateVisibleProperty.get();}
		public BooleanProperty buttonCreateVisibleProperty() { return this.buttonCreateVisibleProperty;}
	
	private ObservableList<Person> masterDataPerson = FXCollections.observableArrayList();
	private FilteredList<Person> filteredPerson = new FilteredList<>(masterDataPerson);
	private SortedList<Person> sortedPerson = new SortedList<>(filteredPerson);
	private ObjectProperty<Person> selectedPerson = new SimpleObjectProperty<>();
	public ObservableList<Person> masterDataPerson(){ return masterDataPerson;}
	public FilteredList<Person> filteredPerson(){ return filteredPerson;}
	public SortedList<Person> sortedPerson(){ return sortedPerson;}
	public ObjectProperty<Person> selectedPerson(){ return selectedPerson;}
}	

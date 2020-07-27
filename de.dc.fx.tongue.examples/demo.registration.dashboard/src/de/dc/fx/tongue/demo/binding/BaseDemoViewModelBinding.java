package de.dc.fx.tongue.demo.binding;

import de.dc.fx.tongue.demo.model.*;
import de.dc.fx.tonque.core.ITongueBindingModel;
import javafx.beans.property.*;
import javafx.collections.*;
import javafx.collections.transformation.*;

public class BaseDemoViewModelBinding implements ITongueBindingModel{

	protected StringProperty textFieldUsernameProperty = new SimpleStringProperty();
	public void setTextFieldUsername(String textFieldUsername){ this.textFieldUsernameProperty.set(textFieldUsername);}
	public String getTextFieldUsername(){ return this.textFieldUsernameProperty.get();}
	public StringProperty textFieldUsernameProperty() { return this.textFieldUsernameProperty;}
	protected StringProperty textFieldNameProperty = new SimpleStringProperty();
	public void setTextFieldName(String textFieldName){ this.textFieldNameProperty.set(textFieldName);}
	public String getTextFieldName(){ return this.textFieldNameProperty.get();}
	public StringProperty textFieldNameProperty() { return this.textFieldNameProperty;}
	protected StringProperty textFieldFamilynameProperty = new SimpleStringProperty();
	public void setTextFieldFamilyname(String textFieldFamilyname){ this.textFieldFamilynameProperty.set(textFieldFamilyname);}
	public String getTextFieldFamilyname(){ return this.textFieldFamilynameProperty.get();}
	public StringProperty textFieldFamilynameProperty() { return this.textFieldFamilynameProperty;}
	protected StringProperty textFieldEmailProperty = new SimpleStringProperty();
	public void setTextFieldEmail(String textFieldEmail){ this.textFieldEmailProperty.set(textFieldEmail);}
	public String getTextFieldEmail(){ return this.textFieldEmailProperty.get();}
	public StringProperty textFieldEmailProperty() { return this.textFieldEmailProperty;}
	protected StringProperty textFieldStarsProperty = new SimpleStringProperty();
	public void setTextFieldStars(String textFieldStars){ this.textFieldStarsProperty.set(textFieldStars);}
	public String getTextFieldStars(){ return this.textFieldStarsProperty.get();}
	public StringProperty textFieldStarsProperty() { return this.textFieldStarsProperty;}
	protected StringProperty buttonCreateRegistrationProperty = new SimpleStringProperty();
	public void setButtonCreateRegistration(String buttonCreateRegistration){ this.buttonCreateRegistrationProperty.set(buttonCreateRegistration);}
	public String getButtonCreateRegistration(){ return this.buttonCreateRegistrationProperty.get();}
	public StringProperty buttonCreateRegistrationProperty() { return this.buttonCreateRegistrationProperty;}
	protected StringProperty buttonClearAllProperty = new SimpleStringProperty();
	public void setButtonClearAll(String buttonClearAll){ this.buttonClearAllProperty.set(buttonClearAll);}
	public String getButtonClearAll(){ return this.buttonClearAllProperty.get();}
	public StringProperty buttonClearAllProperty() { return this.buttonClearAllProperty;}

		private BooleanProperty buttonCreateRegistrationDisableProperty = new SimpleBooleanProperty();
		public void setButtonCreateRegistrationDisableProperty(Boolean buttonCreateRegistration){ this.buttonCreateRegistrationDisableProperty.set(buttonCreateRegistration);}
		public Boolean getButtonCreateRegistrationDisableProperty(){ return this.buttonCreateRegistrationDisableProperty.get();}
		public BooleanProperty buttonCreateRegistrationDisableProperty() { return this.buttonCreateRegistrationDisableProperty;}
		private BooleanProperty buttonClearAllDisableProperty = new SimpleBooleanProperty();
		public void setButtonClearAllDisableProperty(Boolean buttonClearAll){ this.buttonClearAllDisableProperty.set(buttonClearAll);}
		public Boolean getButtonClearAllDisableProperty(){ return this.buttonClearAllDisableProperty.get();}
		public BooleanProperty buttonClearAllDisableProperty() { return this.buttonClearAllDisableProperty;}
	
	protected ObservableList<Registration> masterDataRegistration = FXCollections.observableArrayList();
	protected FilteredList<Registration> filteredRegistration = new FilteredList<>(masterDataRegistration);
	protected SortedList<Registration> sortedRegistration = new SortedList<>(filteredRegistration);
	protected ObjectProperty<Registration> selectedRegistration = new SimpleObjectProperty<>();
	public ObservableList<Registration> masterDataRegistration(){ return masterDataRegistration;}
	public FilteredList<Registration> filteredRegistration(){ return filteredRegistration;}
	public SortedList<Registration> sortedRegistration(){ return sortedRegistration;}
	public ObjectProperty<Registration> selectedRegistration(){ return selectedRegistration;}
	
	public void clearAllTextFields(){
		this.textFieldUsernameProperty.set("");
		this.textFieldNameProperty.set("");
		this.textFieldFamilynameProperty.set("");
		this.textFieldEmailProperty.set("");
		this.textFieldStarsProperty.set("");
		this.buttonCreateRegistrationProperty.set("");
		this.buttonClearAllProperty.set("");
	}
	
	public void clearAllCollections(){
		this.masterDataRegistration.clear();
	}
}	

package de.dc.fx.tongue.demo.binding;

import de.dc.fx.tongue.demo.model.*;
import de.dc.fx.tonque.core.ITongueBindingModel;
import javafx.beans.property.*;
import javafx.collections.*;
import javafx.collections.transformation.*;

public class BaseDemoViewModelBinding implements ITongueBindingModel{

	private StringProperty textFieldUsernameProperty = new SimpleStringProperty();
	public void setTextFieldUsername(String textFieldUsername){ this.textFieldUsernameProperty.set(textFieldUsername);}
	public String getTextFieldUsername(){ return this.textFieldUsernameProperty.get();}
	public StringProperty textFieldUsernameProperty() { return this.textFieldUsernameProperty;}
	private StringProperty textFieldNameProperty = new SimpleStringProperty();
	public void setTextFieldName(String textFieldName){ this.textFieldNameProperty.set(textFieldName);}
	public String getTextFieldName(){ return this.textFieldNameProperty.get();}
	public StringProperty textFieldNameProperty() { return this.textFieldNameProperty;}
	private StringProperty textFieldFamilynameProperty = new SimpleStringProperty();
	public void setTextFieldFamilyname(String textFieldFamilyname){ this.textFieldFamilynameProperty.set(textFieldFamilyname);}
	public String getTextFieldFamilyname(){ return this.textFieldFamilynameProperty.get();}
	public StringProperty textFieldFamilynameProperty() { return this.textFieldFamilynameProperty;}
	private StringProperty textFieldEmailProperty = new SimpleStringProperty();
	public void setTextFieldEmail(String textFieldEmail){ this.textFieldEmailProperty.set(textFieldEmail);}
	public String getTextFieldEmail(){ return this.textFieldEmailProperty.get();}
	public StringProperty textFieldEmailProperty() { return this.textFieldEmailProperty;}
	private StringProperty textFieldStarsProperty = new SimpleStringProperty();
	public void setTextFieldStars(String textFieldStars){ this.textFieldStarsProperty.set(textFieldStars);}
	public String getTextFieldStars(){ return this.textFieldStarsProperty.get();}
	public StringProperty textFieldStarsProperty() { return this.textFieldStarsProperty;}
	private StringProperty buttonCreateRegistrationProperty = new SimpleStringProperty();
	public void setButtonCreateRegistration(String buttonCreateRegistration){ this.buttonCreateRegistrationProperty.set(buttonCreateRegistration);}
	public String getButtonCreateRegistration(){ return this.buttonCreateRegistrationProperty.get();}
	public StringProperty buttonCreateRegistrationProperty() { return this.buttonCreateRegistrationProperty;}

		private BooleanProperty buttonCreateRegistrationDisableProperty = new SimpleBooleanProperty();
		public void setButtonCreateRegistrationDisableProperty(Boolean buttonCreateRegistration){ this.buttonCreateRegistrationDisableProperty.set(buttonCreateRegistration);}
		public Boolean getButtonCreateRegistrationDisableProperty(){ return this.buttonCreateRegistrationDisableProperty.get();}
		public BooleanProperty buttonCreateRegistrationDisableProperty() { return this.buttonCreateRegistrationDisableProperty;}
	
	private ObservableList<Registration> masterDataRegistration = FXCollections.observableArrayList();
	private FilteredList<Registration> filteredRegistration = new FilteredList<>(masterDataRegistration);
	private SortedList<Registration> sortedRegistration = new SortedList<>(filteredRegistration);
	private ObjectProperty<Registration> selectedRegistration = new SimpleObjectProperty<>();
	public ObservableList<Registration> masterDataRegistration(){ return masterDataRegistration;}
	public FilteredList<Registration> filteredRegistration(){ return filteredRegistration;}
	public SortedList<Registration> sortedRegistration(){ return sortedRegistration;}
	public ObjectProperty<Registration> selectedRegistration(){ return selectedRegistration;}
}	

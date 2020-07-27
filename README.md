# TongueFramework
It is just another javafx renderer with several missed features. This renderer editor support is only used in Eclipse, but the core part can binded independently outside from eclipse.

Included Features:
* Generation of Model View Control classes
* List of fx id class generation
* Directly use of JavaFX controls indeed of reflections (in comparision to fxml)
* Databinding modelling in the tongue file
* Validations based on regular expressions
* Direct stylable controls
* Live Preview of Tongue file

## Benefits

Implementing applications in JavaFX can be very complex. Even though you can create the design using FXML. With FXML you can create a mock design very quickly, but as soon as it becomes complicated forms, it has a negative impact on performance. Tongue Framework creates the control element at runtime directly in comparision to FXML the xml file is read out and instantiated via reflections. With FXML, you cannot simply integrate data binding and validations. Tongue Framework should make it easier for the user to create the boilerplate code by generating all of them.

With this framework, the implementation effort should be reduced. The user interface should only be configured, generated and started.  

To display only one table that can filtered and sorted requires some implementations. Here only the table with the columns and the referenced data model is necessary to display the application. An example follows.

## How it works

![Tongue Framework Overview](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0000_overview.PNG) 

This framework is divided into three components. The main part is the rendering of the tongue file to any custom user interface. Currently the renderer mainly refers to JavaFX. To handle events, there is generated code. Each tongue file will generate controller, model and model binding classes. The last compoment is about managing the tongue file via a treeviewer.

A tongue file describes how the user interface looks like and in the code behind class (controller) the event listener methods can defined as in fxml. 

### Project Structure  
![Project Structure](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0001_project_structure.PNG)  
For each tongue file this class will be generated:  
* UI binding model - this class contains all properties defined in the ui
* Controller class - this class bind the ui binding model with the user interface, further the event listeners can be handled in here.
* Application class
* Control id list class - all ids of the defined tongue file.

### Tongue file  
The tongue file can edit in eclipse editor as TreeViewer with properties and outline support.  
In the following image a JavaFX form will be rendered with several text fields. Here a several controls used:  
* FXForm: It is just a TitledPane with the content of GridPane
* FXFormTextField: JavaFX Label with TextField. On default the prompt message is set.
* FXFormFileText: JavaFX Label with TextField and Button to open the FileChooser
* FXDirectoryTextField: JavaFX Label with TextField and Button to open the DirectoryChooser
* FXRGBPane: It just a custom control to choose the RGB color.
* FXValidation: Validtions for the defined control, it is a optionally definition. This validation contains a FXCheck which can be:
  
### Validations  
  * FXCheckIsInteger: Check for integer with customized error message, error css style and valid style
  * FXCheckIsDouble: Check for double with customized error message, error css style and valid style
  * FXCheckIsDouble: Check for boolean with customized error message, error css style and valid style
  * FXCheckIsEmail: Check for email with customized error message, error css style and valid style
  * FXCheckIsUrl: Check for url with customized error message, error css style and valid style
  * FXCheckIsEmtpy: Check is selected control empty (currently works only for FXLabel and FXTextField)
  * FXCheckIsNotEmtpy: Check is selected control not empty (currently works only for FXLabel and FXTextField)
  * FXCheckContains: Check for contains in string with customized error message, error css style and valid style
  * FXCheckGreater: Not implemented yet
  * FXCheckGreaterThanEquals: Not implemented yet
  * FXCheckLess: Not implemented yet
  * FXCheckLessThanEquals: Not implemented yet
  * FXCheckLessNot: Not implemented yet
  * FXCheckLessIsNull: Not implemented yet
  * FXCheckLessIsNotNull: Not implemented yet
  * FXCheckPattern: Check for the given pattern (regular expression), e.g. postal, address or mobile numbers

![Tongue File](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0002_tongue_file.PNG)  
The rendered user interface with validations
![Tongue User Interface](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0003_tongue_ui.PNG) 

### Databinding

The generated BindingController class for this example looks like
```java
/**
* TONGUE GENERATED BINDING FILE
*/
public abstract class BaseFXFormTextFieldController extends BaseTongueController<FXFormTextFieldModel>{

	@FXML protected FormTextField formName; 
	@FXML protected FormTextField formLastname; 
	@FXML protected FormTextField formAge; 
	@FXML protected FormTextField formEmail; 
	@FXML protected FormTextField formWebsiteText; 
	@FXML protected FormTextField formPhoneText; 
	@FXML protected FormFileTextField formFileText; 
	@FXML protected FormDirectoryTextField formDirectorText; 
	@FXML protected RGBPane rgbPane; 
	
	public BaseFXFormTextFieldController() {
		super(new FXFormTextFieldModel(), new TongueControlRenderer(), "./resources/de/dc/fx/tongue/demo/FXFormTextFields.tongue");
	}
	
	@Override
	public void initializeDatabinding() {
		model.formNameProperty().bindBidirectional(formName.getTextField().textProperty());
		model.formLastnameProperty().bindBidirectional(formLastname.textProperty());
		model.formAgeProperty().bindBidirectional(formAge.textProperty());
		model.formEmailProperty().bindBidirectional(formEmail.textProperty());
		model.formWebsiteTextProperty().bindBidirectional(formWebsiteText.textProperty());
		model.formPhoneTextProperty().bindBidirectional(formPhoneText.textProperty());
		model.formFileTextProperty().bindBidirectional(formFileText.textProperty());
		model.formDirectorTextProperty().bindBidirectional(formDirectorText.textProperty());
	}
}
```

A custom databinding for two controls via textproperty
![Databinding](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0016_tongue_preview.PNG)  

## Tongue File Preview

![](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0004_textproperty_to_label.PNG)  

## TableView Example - First steps
* Define a Tongue file with FXTableView. Each column should has a unique id and property value. If you want a custom cellFactory this can be defined in column property of Table Cell Uri. The class should extends of the TableCell.
![Tongue File](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0005_tongue_tableview.PNG)  
* The TableView will be rendered like  
![TableView UI](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0006_tongue_tableview_ui.PNG)  
* Generated Property binding class  
![TableView UI](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0007_tongue_tableview_binding_model.PNG)  
* Generated controller class  
![TableView UI](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0008_tongue_tableview_controller.PNG)  

### Use existing Java model
When a model is defined, the user can reuse it in the TableView by parsing the compilation unit into the tongue file. The java class can be open via the FXModel popup menu "Parse Uri Model". 
![Parse Model Popup](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0009_tableview_action_parse_model.PNG)    

A default type dialog is open to choose the java class

![Parse Model Popup](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0009_tableview_action_choose_type.PNG)  

After a class is chosen, the FXModel will be filled by generated fields with datatypes.

![Parse Model Popup](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0009_tableview_action_generate_fields.PNG)  

### Create FXColumns by FXModels

When a FXTableView has a FXModel, each columns can create by the fields autoamtically.

![Create Column Popup](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0010_tableview_action_create_columns.PNG)  

![Generate Columns](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0010_tableview_action_generate_columns.PNG)  


# Version

# ChangeLog

# Minimum Requirements

# Installation
* Download zip file
* Open Eclipse Install Manager "Install New Software"
* Add extracted zip file location to repository
* Install

# Third Party APIs
* Eclipse Modelling Framework
* Eclipse Xcore
* Eclipse PDE

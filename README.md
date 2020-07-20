# TongueFramework
It is just another javafx renderer with several missed features. This renderer editor support is only used in Eclipse, but the core part can binded independently outside from eclipse.

Included Features:
* Generation of Model View Control classes
* List of fs id class generation
* Directly use of JavaFX controls indeed of reflections (in comparision to fxml)
* Databinding modelling in the tongue file
* Validations based on regular expressions

## How it works
A tongue file describes how the user interface looks like and in the code behind class (controller) the event listener methods can defined as in fxml. 

*Project Structure*  
![Project Structure](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0001_project_structure.PNG)  
For each tongue file this class will be generated:  
* UI binding model - this class contains all properties defined in the ui
* Controller class - this class bind the ui binding model with the user interface, further the event listeners can be handled in here.
* Application class
* Control id list class - all ids of the defined tongue file.

*Tongue file*  
The tongue file can edit in eclipse editor as TreeViewer with properties and outline support.  
In the following image a JavaFX form will be rendered with several text fields. Here a several controls used:  
* FXForm: It is just a TitledPane with the content of GridPane
* FXFormTextField: JavaFX Label with TextField. On default the prompt message is set.
* FXFormFileText: JavaFX Label with TextField and Button to open the FileChooser
* FXDirectoryTextField: JavaFX Label with TextField and Button to open the DirectoryChooser
* FXRGBPane: It just a custom control to choose the RGB color.
* FXValidation: Validtions for the defined control, it is a optionally definition. This validation contains a FXCheck which can be:
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

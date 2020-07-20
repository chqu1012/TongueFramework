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

Project Structure
![Project Structure](https://github.com/chqu1012/TongueFramework/blob/master/de.dc.fx.tongue.build/images/0001_project_structure.PNG)
For several tongue file:
* UI binding model - this class contains all properties defined in the ui
* Controller class - this class bind the ui binding model with the user interface, further the event listeners can be handled in here.
* Application class
* Control id list class - all ids of the defined tongue file.


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

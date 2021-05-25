# contacts_application_javafx
## About
The program provides an easy-to-use GUI to create, edit and delete contacts using JavaFX.

**Each contact may include**:
* a *first name*
* a *last name*
* a *phone number*
* and *notes* about the contact.

## Getting Started
### Prerequisites
* [Java Amazon Correto 11](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html) - Libraries and software used in the program (JDK)

* [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows) - Software used to write and execute JavaFX code (JDE)

[JavaFX](https://gluonhq.com/products/javafx/) needs to be installed first. To do that, the JavaFX library folder needs to be added into the IDE library.

* *Run > Edit Configurations*
  * Under *"VM options"*, copy and paste:

```
-- module-path "C:\javafx-sdk-11.0.2\lib" --add-modules javafx.controls,javafx.fxml
```

Also make sure that under *"Modify options"* > *"Add VM options"* is enabled.
 
### Installing
Download the entire repository, and compile it into a folder under *"src"* > *"sample"* inside a new IDE project.

## Running the tests
When running the program, click on "Contacts", from there you should be able to either "Add", "Edit" or "Delete" contacts.

## Built With
* Java Amazon Correto 11
* IntelliJ IDEA
* JavaFX

## Authors
* **Anna Karutina** - *Initial work*
* **Mihkel Kougia** - *Documentation*

## Acknowledgements
* Used for learning purposes.

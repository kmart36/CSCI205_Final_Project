# CSCI 205 -Software Engineering and Design
Bucknell University  Lewisburg, PA

### Course Info
Instructor: Brian King  
Semester: Spring 2021

## Team Information
Katy Martinson (Biology, 2024) is the Scrum Master and is responsible for the setup work.  
Phil Morgan (Computer Science, 2024) is one of the main developers and will work with the team on designing the project.   
Kiera Egan (Computer Science, 2024) is the product owner and is responsible for communicating with the client.  
Doug Russo (Computer Science, 2024) is the other main developer and will work with the team on the design for the project. 

## Project Information
*We are designing a multiplayer checkers game. Our game allows for two players to play on one system. Each player is
either on the black team or the red team and the program will allow them to play a class game of checkers using a
coordinate system to move the pieces. The game has many guide-rails that do not allow the user to make impossible moves. 
The game will also force the user to take an enemy piece when the option is available. When all the pieces on one team
are taken, the other player wins and the game ends.*  

*We have different classes for each kind of piece that all fit within a "Checkers Model" package, as all of our object
classes are initialized and instantiated in our model. We also have our controller which is responsible for taking the
model and all of its objects and setting up their purpose for the GUI. Each time an action is completed in the GUI, the 
controller updates the model so precise information can constantly be stored. Our main class is designed to run when the 
Gradle "run" task is executed. This loads in our FXML file (designed using Scene Builder) and sets the stage for the GUI.*

## Libraries
javafx.scene.control - Version 2 - https://docs.oracle.com/javafx/2/api/javafx/scene/control/package-summary.html  
javafx.scene.layout - Version 2 - https://docs.oracle.com/javafx/2/api/javafx/scene/layout/package-summary.html  
javafx.scene.shape - Version 2 - https://docs.oracle.com/javafx/2/api/javafx/scene/shape/package-summary.html  
javafx.scene.paint - Version 2 - https://docs.oracle.com/javafx/2/api/javafx/scene/paint/package-summary.html  
javafx.fxml - Version 2 - https://docs.oracle.com/javafx/2/api/javafx/fxml/package-summary.html  
javafx.stage - Version 8 - https://docs.oracle.com/javase/8/javafx/api/toc.htm  
javafx.application - Version 8 - https://docs.oracle.com/javase/8/javafx/api/toc.htm  
java.net - Version 7 - https://docs.oracle.com/javase/7/docs/api/java/net/package-summary.html  
java.util - Version 7 - https://docs.oracle.com/javase/7/docs/api/java/util/package-summary.html  
java.io - Version 7 - https://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html



## How to run it
Click on the Gradle tab, open the "Tasks" folder, open the "Application" folder, and double-click the "run" task. 
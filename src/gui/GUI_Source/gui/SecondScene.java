package gui;

import driver.FormProjectDriver;
import handlers.BtnLoginHandler;
import handlers.BtnQuitHandler;
import handlers.BtnNewUserHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class SecondScene extends BaseScene{
	
	public SecondScene(FormProjectDriver driver) {
		super(driver);
	}
	
	@Override
	public void setup() {
		Label welcome = new Label("Welcom to Fitness App!");
		Label username = new Label("Username:");
		Label password = new Label("Password:");
		TextField usernameInput = new TextField();
		PasswordField passwordInput = new PasswordField();
		Button login = new Button("Login");	//Launches scene3
		Button quit = new Button("Quit"); //Quits 
		Button newUser = new Button("Create Profile");//Launches scene4
		
		//Add labels, textfields and buttons to gridpane
		GridPane layout2 = new GridPane();
		layout2.add(welcome, 0, 0);
		layout2.add(username, 0, 1);
		layout2.add(password, 0, 2);
		layout2.add(usernameInput, 1, 1);
		layout2.add(passwordInput, 1, 2);
		layout2.add(login, 0, 3);
		layout2.add(quit, 1, 3);
		layout2.add(newUser, 0, 4);
		
		//Attach the event handlers
		BtnQuitHandler qHandler = new BtnQuitHandler();
		quit.setOnAction(qHandler);
		
		BtnLoginHandler lHandler = new BtnLoginHandler(getDriver());
		login.setOnAction(lHandler);
		
		BtnNewUserHandler nHandler = new BtnNewUserHandler(getDriver());
		newUser.setOnAction(nHandler);
		
		//Add grid pane to pane
		StackPane pane = new StackPane();
		pane.getChildren().add(layout2);
		
		//Set the scene
		setScene(new Scene(pane, 600, 500));
		display();
	}
}

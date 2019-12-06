package gui;

import driver.FormProjectDriver;
import handlers.BtnQuitHandler;
import handlers.BtnStartHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class FirstScene extends BaseScene {

	public FirstScene(FormProjectDriver driver) {
		super(driver);
	}
	
	@Override
	public void setup() {
		Button start = new Button("Start");	//Launches the second scene
		Button quit = new Button("Quit");	//Quits
		
		//Add buttons to hbox
		HBox layout1 = new HBox();
		layout1.getChildren().add(start);
		layout1.getChildren().add(quit);
		layout1.setAlignment(Pos.CENTER);
		
		//Attach the event handlers
		BtnQuitHandler qHandler = new BtnQuitHandler();
		quit.setOnAction(qHandler);
		
		BtnStartHandler sHandler = new BtnStartHandler(getDriver());
		start.setOnAction(sHandler);
		
		//Add hbox to pane
		StackPane pane = new StackPane();
		pane.getChildren().add(layout1);
		
		//Set the scene
		setScene(new Scene(pane, 600, 500));
		display();
	}
}

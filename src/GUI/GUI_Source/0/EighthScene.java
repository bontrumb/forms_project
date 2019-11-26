package gui;

import driver.FormProjectDriver;
import handlers.BtnBackHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class EighthScene extends BaseScene {
	
	public EighthScene(FormProjectDriver driver){
		super(driver);
	}

	@Override
	public void setup() {
		Label weightL = new Label("Weight:");
		Label dateL = new Label("Date:");
		TextField weightInput = new TextField();
		TextField dateInput = new TextField();
		Button update = new Button("Update");
		Button back = new Button("Back");
		
		//Add labels and text field to grid pane
		GridPane layout8 = new GridPane();
		layout8.add(weightL, 0, 0);
		layout8.add(dateL, 0, 1);
		layout8.add(weightInput, 1, 0);
		layout8.add(dateInput, 1, 1);
		layout8.add(update, 0, 2);
		layout8.add(back, 1, 2);
		
		//Attach the event handlers
		BtnBackHandler bHandler = new BtnBackHandler(getDriver());
		back.setOnAction(bHandler);
		
		//Add gridpane to pane
		StackPane pane = new StackPane();
		pane.getChildren().add(layout8);
		
		//Set the scene
		setScene(new Scene(pane, 600, 500));
		display();
		
	}
	
}



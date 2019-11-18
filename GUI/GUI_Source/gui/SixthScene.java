package gui;

import driver.FormProjectDriver;
import handlers.BtnBackHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class SixthScene extends BaseScene {
	
	public SixthScene(FormProjectDriver driver){
		super(driver);
	}

	@Override
	public void setup() {
		Label liftL = new Label("Lift:");
		Label liftedL = new Label("Amount lifted:");
		TextField liftInput = new TextField();
		Button update = new Button("Update");
		Button back = new Button("Back");
		//Label liftedAmount = new Label("");
		
		//Add labels and text field to grid pane
		GridPane layout6 = new GridPane();
		layout6.add(liftL, 0, 0);
		layout6.add(liftedL, 0, 1);
		layout6.add(liftInput, 1, 0);
		layout6.add(update, 0, 2);
		layout6.add(back,1,2);
		
		//Attach the event handlers
		BtnBackHandler bHandler = new BtnBackHandler(getDriver());
		back.setOnAction(bHandler);
		
		
		//Add gridpane to pane
		StackPane pane = new StackPane();
		pane.getChildren().add(layout6);
		
		//Set the scene
		setScene(new Scene(pane, 600, 500));
		display();
	}
	
}


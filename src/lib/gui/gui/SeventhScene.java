package gui;

import driver.FormProjectDriver;
import handlers.BtnBack1Handler;
import handlers.BtnTLiftHandler;
import handlers.BtnTWeightHandler;
import handlers.BtnBack1Handler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class SeventhScene extends BaseScene {

	public SeventhScene(FormProjectDriver driver) {
		super(driver);
	}
	
	@Override
	public void setup() {
		Button tLift = new Button("Track Lifts");	//Launches scene6
		Button tWeight = new Button("Track Weight");	//Launches scene8
		Button back1 = new Button("Back");
		
		//Add buttons to hbox
		HBox layout7 = new HBox();
		layout7.getChildren().add(tLift);
		layout7.getChildren().add(tWeight);
		layout7.getChildren().add(back1);
		layout7.setAlignment(Pos.CENTER);
		
		//Attach the event handlers
		BtnTLiftHandler tlHandler = new BtnTLiftHandler(getDriver());
		tLift.setOnAction(tlHandler);
		
		BtnBack1Handler bHandler = new BtnBack1Handler(getDriver());
		back1.setOnAction(bHandler);
		
		BtnTWeightHandler twHandler = new BtnTWeightHandler(getDriver());
		tWeight.setOnAction(twHandler);
		
		//Add hbox to pane
		StackPane pane = new StackPane();
		pane.getChildren().add(layout7);
		
		//Set the scene
		setScene(new Scene(pane, 600, 500));
		display();
	}
}
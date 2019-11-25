package gui;

import driver.FormProjectDriver;
import handlers.BtnViewHandler;
import handlers.BtnTrackHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class ThirdScene extends BaseScene {

	public ThirdScene(FormProjectDriver driver) {
		super(driver);
	}
	
	@Override
	public void setup() {
		Button track = new Button("Track Fitness");	//Launches the fourth scene
		Button view = new Button("View Insights");	//Launches the fith scene
		
		//Add buttons to hbox
		HBox layout3 = new HBox();
		layout3.getChildren().add(track);
		layout3.getChildren().add(view);
		layout3.setAlignment(Pos.CENTER);
		
		//Attach the event handlers
		BtnViewHandler vHandler = new BtnViewHandler(getDriver());
		view.setOnAction(vHandler);
		
		BtnTrackHandler tHandler = new BtnTrackHandler(getDriver());
		track.setOnAction(tHandler);
		
		//Add hbox to pane
		StackPane pane = new StackPane();
		pane.getChildren().add(layout3);
		
		//Set the scene
		setScene(new Scene(pane, 600, 500));
		display();
	}
}

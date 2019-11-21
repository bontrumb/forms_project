package gui;

import driver.FormProjectDriver;
import handlers.BtnQuitHandler;
import handlers.BtnUpdateHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;


public class FourthScene extends BaseScene{
	
	public FourthScene(FormProjectDriver driver) {
		super(driver);
	}

	@Override
	public void setup() {
		//Setting up the scene
		Label textL = new Label("Create Profile");
		Label genderL = new Label("Gender:");
		Label heightL = new Label("Height:");
		Label weightL = new Label("Weight:");
		Label BFL = new Label("BF");
		Label activityLevelL = new Label("Activity Level:");
		Label stepsL = new Label("Step:s");
		Label restingbpmL = new Label("Resting BPM:");
		Label liftsL = new Label("Lifts:");
		TextField genderInput = new TextField("F/M");
		TextField heightInput = new TextField("ft.");
		TextField weightInput = new TextField("lbs.");
		TextField BFInput = new TextField("%");
		TextField activityLevelInput = new TextField();
		TextField stepsInput = new TextField("steps");
		TextField restingBPMInput = new TextField("BPM");
		TextField liftsInput = new TextField("reps");
		Button update = new Button("Save");
		Button quit = new Button("Quit");
		
		//Add labels, text fields and buttons to grid pane
		GridPane layout4 = new GridPane();
	   layout4.add(textL, 0, 0);
	   layout4.add(genderL, 0, 1);
	   layout4.add(heightL, 0, 2);
	   layout4.add(weightL, 0, 3);
	   layout4.add(BFL, 0, 4);
	   layout4.add(activityLevelL, 0, 5);
	   layout4.add(stepsL, 0, 6);
	   layout4.add(restingbpmL, 0, 7);
	   layout4.add(liftsL, 0, 8);
	   layout4.add(genderInput, 1, 1);
	   layout4.add(heightInput, 1, 2);
	   layout4.add(weightInput, 1, 3);
	   layout4.add(BFInput, 1, 4);
	   layout4.add(activityLevelInput, 1, 5);
	   layout4.add(stepsInput, 1, 6);
	   layout4.add(restingBPMInput, 1, 7);
	   layout4.add(liftsInput, 1, 8);
	   layout4.add(update, 0, 9);
	   layout4.add(quit, 1, 9);
		
	   //Attach the event handlers
	 	BtnQuitHandler qHandler = new BtnQuitHandler();
	 	quit.setOnAction(qHandler);
	 	
	 	BtnUpdateHandler UHandler = new BtnUpdateHandler(getDriver());
		update.setOnAction(UHandler);
		

		
		//root.getChildren().add(sceneA(app.getUser()));	//Set up first scene
		
		//Add grid pane to pane
		StackPane pane = new StackPane();
		pane.getChildren().add(layout4);
		
		//Set the scene
		setScene(new Scene(pane, 600, 500));
		display();
	}
	
	


	
	
}

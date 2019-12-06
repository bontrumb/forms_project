package gui;

import data.UserData;
import data.UserDataIndex;
import driver.FormProjectDriver;
import handlers.BtnBack1Handler;
import handlers.BtnQuitHandler;
import handlers.BtnUpdateHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;


public class FifthScene extends BaseScene{
	
	public FifthScene(FormProjectDriver driver) {
		super(driver);
	}

	@Override
	public void setup() {
		//Setting up the scene
		Label textL = new Label("Fitness Dashboard");
		Label genderL = new Label("Gender: " + getDriver().getUserdata().GetData_Var(UserDataIndex.GENDER.getIndex()).GetEntry());
		Label heightL = new Label("Height: " + getDriver().getUserdata().GetData_Var(UserDataIndex.HEIGHT.getIndex()).GetEntry());
		Label weightL = new Label("Weight: " + getDriver().getUserdata().GetData_Var(UserDataIndex.WEIGHT.getIndex()).GetEntry());
		Label BFL = new Label("BF: " + getDriver().getUserdata().GetData_Var(UserDataIndex.BODY_FAT.getIndex()).GetEntry());
		Label activityLevelL = new Label("Activity Level: " + getDriver().getUserdata().GetData_Var(UserDataIndex.ACTIVITY_LEVEL.getIndex()).GetEntry());
		Label stepsL = new Label("Steps: " + getDriver().getUserdata().GetData_Var(UserDataIndex.STEPS.getIndex()).GetEntry());
		Label restingbpmL = new Label("Resting BPM: " + getDriver().getUserdata().GetData_Var(UserDataIndex.RESTING_BPM.getIndex()).GetEntry());
		Label liftsL = new Label("Lifts: " + getDriver().getUserdata().GetData_Var(UserDataIndex.BENCH.getIndex()).GetEntry());
		Label caloricL = new Label("Daily caloric requirements: " + String.format("%.2f",(double)getDriver().getUserdataCalc().GetDC()));
		Label basalL = new Label("Basal Metabolic Rate: " + String.format("%.2f",(double)getDriver().getUserdataCalc().GetBM()));
		Label FFMIL = new Label("Fat Free Mass Index: " + String.format("%.2f",(double)getDriver().getUserdataCalc().GetFFMI()));
		Label VOL = new Label("(Not yet implemented) VO2 Max: " + getDriver().getUserdataCalc().GetVO2_Max());
		Label bmiL = new Label("BMI: " + String.format("%.2f",(double)getDriver().getUserdataCalc().GetBMI()));
		Label liftL = new Label("(Not yet implemented) lbs required to reach next bracket: " + null);

		Button quit = new Button("Quit");
		Button back = new Button("Back");
		
		//Add labels, text fields and buttons to grid pane
		GridPane layout5 = new GridPane();
	   layout5.add(textL, 0, 0);
	   layout5.add(genderL, 0, 1);
	   layout5.add(heightL, 0, 2);
	   layout5.add(weightL, 0, 3);
	   layout5.add(BFL, 0, 4);
	   layout5.add(activityLevelL, 0, 5);
	   layout5.add(stepsL, 0, 6);
	   layout5.add(restingbpmL, 0, 7);
	   layout5.add(liftsL, 0, 8);
	   layout5.add(caloricL, 0, 10);
	   layout5.add(basalL, 0, 11);
	   layout5.add(FFMIL, 0, 12);
	   layout5.add(VOL,0,13);
	   layout5.add(bmiL, 0, 14);
	   layout5.add(liftL, 0, 15);
	   //layout5.add(genderInput, 1, 1);
	   //layout5.add(heightInput, 1, 2);
	   //layout5.add(weightInput, 1, 3);
	   //layout5.add(BFInput, 1, 4);
	   //layout5.add(activityLevelInput, 1, 5);
	   //layout5.add(stepsInput, 1, 6);
	   //layout5.add(restingBPMInput, 1, 7);
	   //layout5.add(liftsInput, 1, 8);
	   //layout5.add(update, 0, 9);
	   layout5.add(quit, 1, 16);
	   layout5.add(back, 0, 16);
	   
		
	   //Attach the event handlers
	 	BtnQuitHandler qHandler = new BtnQuitHandler();
	 	quit.setOnAction(qHandler);
	 	
	 	BtnBack1Handler bHandler = new BtnBack1Handler(getDriver());
		back.setOnAction(bHandler);
		
		//root.getChildren().add(sceneA(app.getUser()));	//Set up first scene
		
		//Add grid pane to pane
		StackPane pane = new StackPane();
		pane.getChildren().add(layout5);
		
		//Set the scene
		setScene(new Scene(pane, 600, 500));
		display();
	}
}

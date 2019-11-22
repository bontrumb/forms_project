package gui;

import data.UserData;
import data.UserDataIndex;
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
		Label stepsL = new Label("Steps:");
		Label restingbpmL = new Label("Resting BPM:");
		Label liftsL = new Label("Lifts:");
		UserData u = getDriver().getUserdata();
		TextField genderInput = new TextField(u.GetData_Var(UserDataIndex.GENDER.getIndex()).GetEntry() != null ? u.GetData_Var(UserDataIndex.GENDER.getIndex()).GetEntry().toString() : "F/M");
		TextField heightInput = new TextField((u.GetData_Var(UserDataIndex.HEIGHT.getIndex()).GetEntry() != null ? u.GetData_Var(UserDataIndex.HEIGHT.getIndex()).GetEntry().toString() : "")  + "ft");
		TextField weightInput = new TextField((u.GetData_Var(UserDataIndex.WEIGHT.getIndex()).GetEntry() != null ? u.GetData_Var(UserDataIndex.WEIGHT.getIndex()).GetEntry().toString() : "") + "lbs");
		TextField BFInput = new TextField((u.GetData_Var(UserDataIndex.BODY_FAT.getIndex()).GetEntry() != null ? u.GetData_Var(UserDataIndex.BODY_FAT.getIndex()).GetEntry().toString() : "") + "%");
		TextField activityLevelInput = new TextField(u.GetData_Var(UserDataIndex.ACTIVITY_LEVEL.getIndex()).GetEntry() != null ? u.GetData_Var(UserDataIndex.ACTIVITY_LEVEL.getIndex()).GetEntry().toString() : "1-5");
		TextField stepsInput = new TextField((u.GetData_Var(UserDataIndex.STEPS.getIndex()).GetEntry() != null ? u.GetData_Var(UserDataIndex.STEPS.getIndex()).GetEntry().toString() : "") + "steps");
		TextField restingBPMInput = new TextField((u.GetData_Var(UserDataIndex.RESTING_BPM.getIndex()).GetEntry() != null ? u.GetData_Var(UserDataIndex.RESTING_BPM.getIndex()).GetEntry().toString() : "") + "BPM");
		TextField liftsInput = new TextField((u.GetData_Var(UserDataIndex.BENCH.getIndex()).GetEntry() != null ? u.GetData_Var(UserDataIndex.BENCH.getIndex()).GetEntry().toString() : "") + "reps");
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

		update.setOnAction(click -> {
			getDriver().getUserdata().SetEntry_Direct(UserDataIndex.GENDER.getIndex(), genderInput.getCharacters().toString());
			getDriver().getUserdata().SetEntry_Direct(UserDataIndex.HEIGHT.getIndex(), heightInput.getCharacters().toString());
			getDriver().getUserdata().SetEntry_Direct(UserDataIndex.WEIGHT.getIndex(), weightInput.getCharacters().toString());
			getDriver().getUserdata().SetEntry_Direct(UserDataIndex.BODY_FAT.getIndex(), BFInput.getCharacters().toString());
			getDriver().getUserdata().SetEntry_Direct(UserDataIndex.ACTIVITY_LEVEL.getIndex(), activityLevelInput.getCharacters().toString());
			getDriver().getUserdata().SetEntry_Direct(UserDataIndex.STEPS.getIndex(), stepsInput.getCharacters().toString());
			getDriver().getUserdata().SetEntry_Direct(UserDataIndex.RESTING_BPM.getIndex(), restingBPMInput.getCharacters().toString());
			getDriver().getUserdata().SetEntry_Direct(UserDataIndex.BENCH.getIndex(), liftsInput.getCharacters().toString());
			ThirdScene scene = new ThirdScene(getDriver());
			scene.setup();
		});
		

		
		//root.getChildren().add(sceneA(app.getUser()));	//Set up first scene
		
		//Add grid pane to pane
		StackPane pane = new StackPane();
		pane.getChildren().add(layout4);
		
		//Set the scene
		setScene(new Scene(pane, 600, 500));
		display();
	}
	
	


	
	
}

package driver;

import calc.UserData_Calc;
import data.UserData;
import gui.FirstScene;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FormProjectDriver extends Application{
	Stage stage;
	static UserData userdata  = new UserData();
	static UserData_Calc userdataCalc = new UserData_Calc(userdata);

	public void setScene(Scene scene) {
		stage.setScene(scene);
	}

	public UserData getUserdata() {
		return userdata;
	}

	public UserData_Calc getUserdataCalc(){
		return userdataCalc;
	}

	public void start(Stage stage) {
		this.stage = stage;
		stage.setTitle("Fitness App");
		stage.show();
		FirstScene scene = new FirstScene(this);
		scene.setup();

	}

	public static void main(String[] args) {
		launch(args);

	}
}

